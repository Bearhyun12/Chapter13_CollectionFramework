package com.libs.collection;

public class MySmartList<T> implements MyList<T>{
    //�ʵ� ����
		//�ʵ�
		//��Ҹ� ������ �迭
		private Object[] elementData;
		
		// ���� �迭�� �� ����
		private int capacity;
		
		//�迭 ����� ���� ��ġ��
		private int cursor;
		
		
		// �÷��� �迭�� �뷮
		 private final int amount = 3;
		 
	//������
		MySmartList(int amount) {	
			this.capacity =  amount;
			elementData = new Object[capacity];
			cursor = 0;
		}
		
		public MySmartList() {
			this(3);
		}
	//�޼ҵ�
	@Override
	public void add(T t) {
		
		 if(capacity <= cursor ) {
	    	 //�ʰ������� �迭���� ����
	    	 //���ο� �迭 ����(������ ����)
	    	 Object[] tempArr = new Object[capacity + amount];
	    	 //��Һ���
//	    	 for(int i =0; i < arr.length; i++ ) {
//	    		 tempArr[i] = arr[i];
//	    	 }
	    	 System.arraycopy(elementData, 0, tempArr, 0, elementData.length);
	    	 //���� ����
	    	 elementData = tempArr;
	    	 
	    	 //�迭 �뷮 ������Ʈ
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
		// �����ϰ��� �ϴ� idx(index)�� �������̸� 0���� �ʱ�ȭ�ϸ� ��
				if(idx != cursor - 1) {
				   // �迭�� ó��
					System.arraycopy(elementData, idx +1, elementData, idx, 
							(cursor-1) - idx);
				}
				// ������ ������ �ʱ�ȭ
				elementData[cursor -1] = 0; 
				
				//���� ��ġ�� �缳�� �������
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
