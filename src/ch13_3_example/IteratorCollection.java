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
		
		//반복자(iterator)을 이용해서 순차적 참조
		while(itr.hasNext()) {  //hashNext -> 다음에 참조할게 있어?
			System.out.println(itr.next() + "\t"); //참조할게 없으면 빠져나온다
		}
		
		//현재 hashNext로 인해 ++되어있는 상황, 초기화를 해줘야함
		itr = list.iterator(); //Iterator 초기화
		
		System.out.println("=======================================");
		while(itr.hasNext()) {  //hashNext -> 다음에 참조할게 있어?
			System.out.println(itr.next() + "\t"); //참조할게 없으면 빠져나온다
		}
		
		
	}
}
