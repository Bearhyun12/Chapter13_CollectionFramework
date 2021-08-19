package ch13_2_stack_queue;

public class Message {
	String command;
	String to;
	Message(String command, String to){
		this.command = command;
		this.to = to;
	}
}
