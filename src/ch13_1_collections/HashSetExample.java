package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		/**
		 *  [HashSet] implements Set
		 *  
		 *  List컬렉션(인터페이스)은 객체의 순서를 유지하지만,
		 *  
		 *  인덱스로 관리 되지 않는다
		 *  : 반복자(Iterator) 제공한다.
		 *  중복해서 저장 할 수 없는 수학의 집합 개념
		 */
		Set<String> set = new HashSet<>();
		
		// hashCode() + equals()를 이용한 비교
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: "+ size);
		
		//반복자를 이용한 루핑
		Iterator<String> iterator = set.iterator(); //해당 자료구조의 반복자 얻기
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		System.out.println();
		
//		set.remove("JDBC");
//		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		
		System.out.println("--------------------------------------------------");
		//반복자 다시 얻기(초기화)    즉, for문이나 while문 돌렸으면 한번더 호출해서 초기화해줘라
		iterator = set.iterator(); 
		
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		System.out.println("--------------------------------------------------");
		
		//for문 루핑
		for (String element : set) {
			System.out.println("\t" + element);			
		}
	set.clear();
	if (set.isEmpty()) {System.out.println("비어 있음");
		
	}
	}
}
