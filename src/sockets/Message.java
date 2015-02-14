package sockets;
import java.io.*;

public class Message implements Serializable {

	protected static final long serialVersionUID = 1112122200L;
	
	public static final int MESSAGE = 1;

	public static final int STOP = 2;

	public static final int SIMPLE_MESSAGE = 3;
	private int type;
	private String message;
	
	public Message(int type, String message) {
		this.type = type;
		this.message = message;
	}
	
	int getType() {
		return type;
	}
	String getMessage() {
		return message;
	}
}
