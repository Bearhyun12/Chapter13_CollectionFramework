package ch13_1_collections;

import java.util.List;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LottoGenExample {
	
	static final int MAX = 45;
	static final int COUNT = 6;
	
	public static void main(String[] args) {
		
		/**
		 * [로또 번호 생성기]
		 * 중복 저장 되지 않는 HashSet 이용
		 */
		
		// 번호 생성기? Math.random()
		// HashSet에 담자 
		// HasgSet은 중복검사를 따로 할 필요가 없다
		
	   Set<Integer> set = new HashSet<>(COUNT);
	   
	   int n = 0;
	   while(set.size() < COUNT) {
		   n++;
		   set.add(((int)(Math.random() *  MAX) + 1));
	   }
	    List<Integer> lotto = new LinkedList<>(set);
	    
	    Collections.sort(lotto); //내림차순으로 정렬하는거
	   
		System.out.println(lotto + ", " + n + "회"); //요건 중복검사 
	}
}
