package com.libs.collection;
/**
 * @author wjemfka123
 * 2021.08.18
 * java 211기 >>>
 * int[]를 관리하기 위한 자료구조
 */
public class MyIntList {
	//필드
	//요소를 저장할 배열
	private int[] arr;
	
	//배열 요소의 현재 위치값
	private int cursor;
	
	// 현재 배열의 총 길이
	private int capacity;
	
	// 늘려줄 배열의 용량
	private final int amount;
	
	//생성자
	public MyIntList(int amount) {
		this.amount = amount;
		this.capacity = this.amount;
		this.arr = new int[capacity];
		cursor = 0;
	}
	//메소드
	
	//요소 추가
	public void add(int num) {
//	    현재용량을 초과하는지의 여부 조건 검사
     if(capacity <= cursor ) {
    	 //초과했으면 배열복사 수행
    	 //새로운 배열 생성(사이즈 업한)
    	 int[] tempArr = new int[capacity + amount];
    	 //요소복사
//    	 for(int i =0; i < arr.length; i++ ) {
//    		 tempArr[i] = arr[i];
//    	 }
    	 System.arraycopy(arr, 0, tempArr, 0, arr.length);
    	 //참조 변경
    	 arr = tempArr;
    	 
    	 //배열 용량 업데이트
    	 capacity += amount;    	 
     }
     this.arr[cursor++] = num;
}
	
    //요소 얻기
 	public int get(int idx) {
		
		return arr[idx];
	}
 	
	//요소 삭제
	public void remove(int idx ) {
		// 삭제하고자 하는 idx(index)가 마지막이면 0으로 초기화하면 됨
		if(idx != cursor - 1) {
		   // 배열의 처리
			System.arraycopy(arr, idx +1, arr, idx, 
					(cursor-1) - idx);
		}
		// 마지막 데이터 초기화
		arr[cursor -1] = 0; 
		
		//현재 위치를 재설정 해줘야함
		cursor--;
	}
	// 요소 개수
	public int size() {
		
		return cursor;
	}
	// 요소 출력
	@Override
	public String toString() {
		String tmp = "";
		for (int i : arr) {
			tmp += i + ", ";
		}
		return "[" + tmp + "]";
	}
	
	// 배열 초기화
	public void clear() {
		arr = new int[amount];
		this.capacity = this.amount;
		cursor = 0;
	}
	
	
	
	
	
	
	
	
}
