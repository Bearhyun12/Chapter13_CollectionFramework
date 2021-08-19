package ch13_1_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		/**
		 *  Ű(key) ��ü, ��(Value)��ü�� ������ Map,Entry ��ü�� �����ϴ� ����
		 *   : Entry�� Map �������̽� ���ο� ���� �� ��ø �������̽�
		 *   
		 *   - Ű(Key)�� �ߺ� ���� �� �� ������ ���� �ߺ� ���� ����
		 */
		
		// �̸��� ������ �����ϴ� �ڷ� ����
		Map<String, Integer> map = new HashMap<>();
		
		//��ü ����
		map.put("�ſ��", new Integer(85));
		map.put("ȫ�浿", 90);
		map.put("����", 80);
		
		//Ű�� �����Ƿ� ������ ���� ������ ��ü (ȫ�浿(Key)�� ������ ������ �ٸ���Ȳ -> 95�� �������̵�)
		map.put("ȫ�浿", 65);
		System.out.println("�� Entry �� : " + map.size());
		
		//��ü ã��
		System.out.println("\tȫ�浿 " + map.get("ȫ�浿"));
		System.out.println("key���� ����: " + map.containsKey("����"));
		System.out.println("============================================================");
		
		//[��ü ���� �� ó��]
		
		
		
		
		// 1. Set<Key> �̿�,       ���⼭ Set�� '�ָӴ�' ���� ������ �Ѵ� 
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
		System.out.println("\t" + key + " : " + value);
		
		}
		keyIterator = keySet.iterator();
		System.out.println("======================================================================");
	
		
		//��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��: " + map.size());

		
		// 2. Set<Map.Entry> �̿�
		
		//��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		entryIterator = entrySet.iterator();
			System.out.println();
			
			//��ü ��ü ����
			map.clear();
			System.out.println("�� Entry ��: " + map.size());
	}
	
}
