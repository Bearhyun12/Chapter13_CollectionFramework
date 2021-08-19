package ch13_2_stack_queue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> msQue = new LinkedList<Message>();
		
		//³Ö±â
		msQue.offer(new Message("sendMail", "È«±æµ¿"));
		msQue.offer(new Message("sendSMS", "½Å¿ë±Ç"));
		msQue.offer(new Message("sendKaKaotalk", "È«µÎ²²"));
		
	while(!msQue.isEmpty()) {
		//²¨³»±â
		Message msg = msQue.poll();
		switch(msg.command) {		
		case "sendMail":
		System.out.println(msg.to + "´Ô¿¡°Ô ¸ÞÀÏÀ» º¸³À´Ï´Ù");
			break;
		case "sendSMS":
			System.out.println(msg.to + "´Ô¿¡°Ô SMS¸¦ º¸³À´Ï´Ù");
			break;
		case "sendKaKaotalk":
			System.out.println(msg.to + "´Ô¿¡°Ô Ä«Ä«¿ÀÅåÀ» º¸³À´Ï´Ù");
		    break;
		default:
			break;
		}	
	}
	}
}
