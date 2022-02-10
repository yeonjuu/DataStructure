package quene;

public class ArrayQ<E> implements MyQ<E> {
	private int front, rear;
	private int size;
	private Object[] items;
	public ArrayQ(int n){
		front = rear = -1;
		size = 0;
		items = (E[])(new Object[n]);
	}
	public boolean isEmpty() {
		if(size ==0) 
			return true;
		return false;
	}
	public boolean enQ(E item) {
		if(size >= items.length) return false;
		if(isEmpty())
			front = (front +1)%items.length;
		rear = (rear+1)%items.length;
		items[rear] = item;
		size++;
		return true;
		}
	public E deQ() {
		E result;
		if(isEmpty()) {
			System.err.println("비어있는 상태에서는 거낼 수 없습니다.");
			return null;
		}
		size--;
		result = (E)items[front];
		front = (front+1) % items.length;
		return result;
	}
	public int size() {
		return size;
	}
	public String toString() {
		String s = "";
		for(int i = 0 ; i<items.length; i++)
			s += items[i] + " ";
		s += "\n";
		return s;
	}
}
