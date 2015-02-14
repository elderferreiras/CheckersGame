package sockets;
import graphicinterface.CheckersBoardServerGUI;

import java.io.*;
import java.net.*;

public class Server {
	private static int uniqueId;
	private ClientThread ct;
	private CheckersBoardServerGUI sg;
	private int port;
	private boolean keepGoing;
	
	public Server(int port) {
		this(port, null);
	}
	
	public Server(int port, CheckersBoardServerGUI sg) {
		this.sg = sg;
		this.port = port;
	}
	
	public void start() {
		keepGoing = true;
		try 
		{
			ServerSocket serverSocket = new ServerSocket(port);
			
			display("Server waiting for Clients on port " + port + ".");
			while(keepGoing) 
			{	
				Socket socket = serverSocket.accept();
				if(!keepGoing)
					break;
				ct = new ClientThread(socket);
				ct.start();
			}
			try {
				serverSocket.close();
					try {
					ct.sInput.close();
					ct.sOutput.close();
					ct.socket.close();
					}
					catch(IOException ioE) {
					}
			} catch(Exception e) {
				display("Exception closed the server and client.");
			}
			}catch (IOException e) {
			display(e.toString());
			}
	}		
	
	public void stop() {
		keepGoing = false;
		try {
			new Socket("localhost", port);
		}
		catch(Exception e) {
		}
	}
	
	private void display(String msg) {
		sg.appendEvent(">"+msg+".\n");
	}
	
	public synchronized void sendMessage(String message) {
			ct.writeMsg(message);
	}

	class ClientThread extends Thread {
		Socket socket;
		ObjectInputStream sInput;
		ObjectOutputStream sOutput;
		int id;
		Message cm;
		
		ClientThread(Socket socket) {
			id = ++uniqueId;
			this.socket = socket;
			try
			{
				sOutput = new ObjectOutputStream(socket.getOutputStream());
				sInput  = new ObjectInputStream(socket.getInputStream());
				display("Client connected.");
				sg.appendGameStatus(">The game just started.\n");
				sg.appendGameStatus(">It's your turn.\n");
			}
			catch (IOException e) {
				display(">Error while creating new Input/output Streams");
				return;
			}
		}
	
		public void run() {
			boolean keepGoing = true;
			while(keepGoing) {
				try {
					cm = (Message) sInput.readObject();
				}
				catch (IOException e) {
					display("Error in the Client while reading Streams.");
					break;				
				}
				catch(ClassNotFoundException e2) {
					break;
				}
				
				String message = cm.getMessage();
				
				switch(cm.getType()) {
				case Message.STOP:
					display(">Client disconnected with a STOP message.");
					keepGoing = false;
					break;
				case Message.MESSAGE:
					sg.appendEvent(">"+message+"\n");
					break;
				case Message.SIMPLE_MESSAGE:
					sg.appendGameStatus(">"+message+"\n");		
					sg.appendGameStatus("It's your turn.\n");
					sg.movimenta(message);
					break;
				}
			}
			close();
		}
		
		private void close() {
			try {
				if(sOutput != null) sOutput.close();
			}
			catch(Exception e) {}
			try {
				if(sInput != null) sInput.close();
			}
			catch(Exception e) {};
			try {
				if(socket != null) socket.close();
			}
			catch (Exception e) {}
		}
		
		private boolean writeMsg(String msg) {
			if(!socket.isConnected()) {
				close();
				return false;
			}
			
			try {
				sOutput.writeObject(msg);
			}
			catch(IOException e) {
				display("Error sending message to Client");
				display(e.toString());
			}
			return true;
		}
	}
}

