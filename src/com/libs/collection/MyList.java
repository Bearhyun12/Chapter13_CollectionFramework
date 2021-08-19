package com.libs.collection;
/**
 * �ڷᱸ�� ������ ���� �޼ҵ� �԰��� ������ �������̽� �ۼ�
 * @author wjemfka123
 *
 */
public interface MyList<T> {

	public abstract void add(T element);
	public abstract T get(int idx);
	public abstract int size(); 
	public abstract void remove(int idx );
	public abstract void clear();
}
