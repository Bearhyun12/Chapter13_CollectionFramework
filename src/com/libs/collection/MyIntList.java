package com.libs.collection;
/**
 * @author wjemfka123
 * 2021.08.18
 * java 211�� >>>
 * int[]�� �����ϱ� ���� �ڷᱸ��
 */
public class MyIntList {
	//�ʵ�
	//��Ҹ� ������ �迭
	private int[] arr;
	
	//�迭 ����� ���� ��ġ��
	private int cursor;
	
	// ���� �迭�� �� ����
	private int capacity;
	
	// �÷��� �迭�� �뷮
	private final int amount;
	
	//������
	public MyIntList(int amount) {
		this.amount = amount;
		this.capacity = this.amount;
		this.arr = new int[capacity];
		cursor = 0;
	}
	//�޼ҵ�
	
	//��� �߰�
	public void add(int num) {
//	    ����뷮�� �ʰ��ϴ����� ���� ���� �˻�
     if(capacity <= cursor ) {
    	 //�ʰ������� �迭���� ����
    	 //���ο� �迭 ����(������ ����)
    	 int[] tempArr = new int[capacity + amount];
    	 //��Һ���
//    	 for(int i =0; i < arr.length; i++ ) {
//    		 tempArr[i] = arr[i];
//    	 }
    	 System.arraycopy(arr, 0, tempArr, 0, arr.length);
    	 //���� ����
    	 arr = tempArr;
    	 
    	 //�迭 �뷮 ������Ʈ
    	 capacity += amount;    	 
     }
     this.arr[cursor++] = num;
}
	
    //��� ���
 	public int get(int idx) {
		
		return arr[idx];
	}
 	
	//��� ����
	public void remove(int idx ) {
		// �����ϰ��� �ϴ� idx(index)�� �������̸� 0���� �ʱ�ȭ�ϸ� ��
		if(idx != cursor - 1) {
		   // �迭�� ó��
			System.arraycopy(arr, idx +1, arr, idx, 
					(cursor-1) - idx);
		}
		// ������ ������ �ʱ�ȭ
		arr[cursor -1] = 0; 
		
		//���� ��ġ�� �缳�� �������
		cursor--;
	}
	// ��� ����
	public int size() {
		
		return cursor;
	}
	// ��� ���
	@Override
	public String toString() {
		String tmp = "";
		for (int i : arr) {
			tmp += i + ", ";
		}
		return "[" + tmp + "]";
	}
	
	// �迭 �ʱ�ȭ
	public void clear() {
		arr = new int[amount];
		this.capacity = this.amount;
		cursor = 0;
	}
	
	
	
	
	
	
	
	
}
