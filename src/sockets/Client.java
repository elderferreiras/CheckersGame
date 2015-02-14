package sockets;
import graphicinterface.CheckersBoardClientGUI;

import java.net.*;
import java.io.*;

public class Client  {
	private ObjectInputStream sInput;	
	private ObjectOutputStream sOutput;		
	private Socket socket;
	private CheckersBoardClientGUI cg;
	
	private String server;
	private int port;

	Client(String server, int port) {
		this(server, port, null);
	}
	
	public Client(String server, int port, CheckersBoardClientGUI cg) {
		this.server = server;
		this.port = port;
		this.cg = cg;
	}
	
	public boolean start() {
		try {
			socket = new Socket(server, port);
		} 
		catch(Exception ec) {
			display("Error connectiong to server:" + ec);
			return false;
		}
		
		String msg = "Connection accepted " + socket.getInetAddress() + ":" + socket.getPort();
		display(msg);
	
		try
		{
			sInput  = new ObjectInputStream(socket.getInputStream());
			sOutput = new ObjectOutputStream(socket.getOutputStream());
		}
		catch (IOException eIO) {
			display("Exception creating new Input/output Streams: " + eIO);
			return false;
		}

		new ListenFromServer().start();
		return true;
	}

	private void display(String msg) {
		if(cg == null)
			System.out.println(msg);     
		else{
			cg.appendEvent(">" + msg + "\n");		
			}
	}

	public void sendMessage(Message msg) {
		try {
			sOutput.writeObject(msg);
		}
		catch(IOException e) {
			display("Exception writing to server: " + e);
		}
	}

	class ListenFromServer extends Thread {

		public void run() {
			while(true) {
				try {
					String msg = (String) sInput.readObject();					
						cg.appendGameStatus(">"+msg+"\n");		
						cg.appendGameStatus(">It's your turn.\n");		
						cg.movimenta(msg);
				}
				catch(IOException e) {
					display("Server has close the connection: " + e);
					if(cg != null) 
						cg.connectionFailed();
					break;
				}
				catch(ClassNotFoundException e2) {
				}
			}
		}
	}
}
