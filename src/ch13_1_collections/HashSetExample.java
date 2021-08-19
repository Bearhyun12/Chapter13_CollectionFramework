package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		/**
		 *  [HashSet] implements Set
		 *  
		 *  List�÷���(�������̽�)�� ��ü�� ������ ����������,
		 *  
		 *  �ε����� ���� ���� �ʴ´�
		 *  : �ݺ���(Iterator) �����Ѵ�.
		 *  �ߺ��ؼ� ���� �� �� ���� ������ ���� ����
		 */
		Set<String> set = new HashSet<>();
		
		// hashCode() + equals()�� �̿��� ��
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("�� ��ü��: "+ size);
		
		//�ݺ��ڸ� �̿��� ����
		Iterator<String> iterator = set.iterator(); //�ش� �ڷᱸ���� �ݺ��� ���
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		System.out.println();
		
//		set.remove("JDBC");
//		set.remove("iBATIS");
		
		System.out.println("�� ��ü��: " + set.size());
		
		
		System.out.println("--------------------------------------------------");
		//�ݺ��� �ٽ� ���(�ʱ�ȭ)    ��, for���̳� while�� �������� �ѹ��� ȣ���ؼ� �ʱ�ȭ�����
		iterator = set.iterator(); 
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		System.out.println("--------------------------------------------------");
		
		//for�� ����
		for (String element : set) {
			System.out.println("\t" + element);			
		}
	set.clear();
	if (set.isEmpty()) {System.out.println("��� ����");
		
	}
	}
}
