package ch13_3_example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		
		//�ݺ���(iterator)�� �̿��ؼ� ������ ����
		while(itr.hasNext()) {  //hashNext -> ������ �����Ұ� �־�?
			System.out.println(itr.next() + "\t"); //�����Ұ� ������ �������´�
		}
		
		//���� hashNext�� ���� ++�Ǿ��ִ� ��Ȳ, �ʱ�ȭ�� �������
		itr = list.iterator(); //Iterator �ʱ�ȭ
		
		System.out.println("=======================================");
		while(itr.hasNext()) {  //hashNext -> ������ �����Ұ� �־�?
			System.out.println(itr.next() + "\t"); //�����Ұ� ������ �������´�
		}
		
		
	}
}
