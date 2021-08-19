package ch13_2_stack_queue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> msQue = new LinkedList<Message>();
		
		//�ֱ�
		msQue.offer(new Message("sendMail", "ȫ�浿"));
		msQue.offer(new Message("sendSMS", "�ſ��"));
		msQue.offer(new Message("sendKaKaotalk", "ȫ�β�"));
		
	while(!msQue.isEmpty()) {
		//������
		Message msg = msQue.poll();
		switch(msg.command) {		
		case "sendMail":
		System.out.println(msg.to + "�Կ��� ������ �����ϴ�");
			break;
		case "sendSMS":
			System.out.println(msg.to + "�Կ��� SMS�� �����ϴ�");
			break;
		case "sendKaKaotalk":
			System.out.println(msg.to + "�Կ��� īī������ �����ϴ�");
		    break;
		default:
			break;
		}	
	}
	}
}
