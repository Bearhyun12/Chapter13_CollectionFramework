package ch13_1_collections;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

class MyClass{
	
}
public class CollectionEx {

	public static void main(String[] args) {
		
		// 값을 저장하는 배열
		int[] arr1 = new int[3];
		arr1[0] = 1;
//		arr1[3] = 3; 
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr1)); 
		
		// 번지를 저장하는 배열
	   MyClass[] arr2 = new MyClass[3];	
	   arr2[0] = new MyClass(); //첫번째 방에 마이클래스 객체 주소 저장
	   System.out.println(Arrays.toString(arr2));

	    // 배열의 한계...
	   
	    // Collection 자료구조 등장
	   
	   List<String> list1 = new ArrayList<String>();
	  list1.add("kor"); //String을 담고잇으니 String을 써라
	  list1.add("1");
	  System.out.println(list1);
	  
//	  List<int>  <> 는 객체를 담는그릇  클래스형만 올수 있음, 기본형 타입은 오면안됨
      List<Integer> list2 = new ArrayList<>();	
	  list2.add(new Integer(1)); //이게 박싱한거임. 아래랑 똑같은 말
      list2.add(1); // 오토박싱
      System.out.println(list2.get(1)); //값을 가져올땐 언박싱
	  System.out.println(list2);
      
	  List<Character> list3 = new Vector<>();
	  list3.add('e'); list3.add('f');
	  System.out.println(list3);
	  
	  List<Float> list4 = new LinkedList<>();
	  list4.add(0.1f); list4.add(0.1f);
	  
	  List<Double> list5 = new LinkedList<>();
	  list5.add(0.1); 
	  list5.add(0.1); 
	  list5.add(0.1);
	  System.out.println(list5);
	  
	  Set<Double> set = new HashSet<>();
	  set.add(0.1);
	  set.add(0.1);      //set은 중복을 허용안한다!!
	  set.add(0.1);
	  System.out.println(set);
	  
	  Map<Integer, String> map = new HashMap<>();
	  map.put(211, "강남");
	  map.put(201, "종로");
	  System.out.println(map);
	
	}
}
