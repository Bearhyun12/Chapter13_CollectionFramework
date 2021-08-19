package ch13_1_collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<>();
	/**
	 * [HashTable] implemets Map
	 * 
	 * HashMap�� ������ ���α���
	 * - ����ȭ(synchronized) �� �޼ҵ�� ����
	 *  : �ϳ��� �����尡 ���� �Ϸ��ؾ߸� �ٸ� ������ ���� ����
	 */
	map.put("spring", "12");
	map.put("summer", "123");
	map.put("fall", "1234");
	map.put("winter", "12345");
	
	Scanner scanner = new Scanner(System.in);
	
	while(true) {
		System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
		
		System.out.print("���̵�: ");
		String id = scanner.nextLine().trim(); // trim() ��������
		
		System.out.print("��й�ȣ: ");
		String password = scanner.nextLine().trim();
		System.out.println();
		
		// ID�� ���ٸ�...
		if(!map.containsKey(id)) { //map�� key�� ����ִ�?
			System.out.println("�Է��Ͻ� ID�� �������� �ʽ��ϴ� " + "�ٽ� �Է����ּ���.");
		}
		// ID�� �ִٸ�...	
		else {
			//��� ����ġ
			if (!map.get(id).equals(password)) {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		
	        //��� ��ġ
			else { 
			System.out.println("�α��� �Ǿ����ϴ�.");
			break;
		
			}
		}
	}
	scanner.close();
	}
}
    
