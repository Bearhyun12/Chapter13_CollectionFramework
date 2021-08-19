package com.libs.collection;

public class MySmartList<T> implements MyList<T>{
    //필드 선언
		//필드
		//요소를 저장할 배열
		private Object[] elementData;
		
		// 현재 배열의 총 길이
		private int capacity;
		
		//배열 요소의 현재 위치값
		private int cursor;
		
		
		// 늘려줄 배열의 용량
		 private final int amount = 3;
		 
	//생성자
		MySmartList(int amount) {	
			this.capacity =  amount;
			elementData = new Object[capacity];
			cursor = 0;
		}
		
		public MySmartList() {
			this(3);
		}
	//메소드
	@Override
	public void add(T t) {
		
		 if(capacity <= cursor ) {
	    	 //초과했으면 배열복사 수행
	    	 //새로운 배열 생성(사이즈 업한)
	    	 Object[] tempArr = new Object[capacity + amount];
	    	 //요소복사
//	    	 for(int i =0; i < arr.length; i++ ) {
//	    		 tempArr[i] = arr[i];
//	    	 }
	    	 System.arraycopy(elementData, 0, tempArr, 0, elementData.length);
	    	 //참조 변경
	    	 elementData = tempArr;
	    	 
	    	 //배열 용량 업데이트
	    	 capacity += amount; 
	    	 }
		    elementData[cursor++] = t;
	}
		

	@SuppressWarnings("unchecked")
	@Override
	public T get(int idx) {
		return (T) elementData[idx];
	}

	@Override
	public int size() {
		return cursor;
	}

	@Override
	public void remove(int idx) {
		// 삭제하고자 하는 idx(index)가 마지막이면 0으로 초기화하면 됨
				if(idx != cursor - 1) {
				   // 배열의 처리
					System.arraycopy(elementData, idx +1, elementData, idx, 
							(cursor-1) - idx);
				}
				// 마지막 데이터 초기화
				elementData[cursor -1] = 0; 
				
				//현재 위치를 재설정 해줘야함
				cursor--;
			}
		
	

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		elementData = new Object[amount];
		this.capacity = this.amount;
		cursor = 0;
	}
	
	@Override
	public String toString() {
		String tmp = "";
		for (Object t : elementData) {
			tmp += (T) t + ", ";
		}
		return "[" + tmp + "]";
	}

}
