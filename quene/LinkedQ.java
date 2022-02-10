package quene;

public class LinkedQ<E> implements MyQ<E> {
	private Node<E> front, rear;
	private int size;
	class Node<E>{
		E data;
		Node<E> next;
		Node( E item, Node<E> n){
			data = item; next = n;
		}
		Node() {this(null, null);}
	}
	public boolean isEmpty() {
		if(front == null) return true;
		return false;
	}
	public boolean enQ( E item) {
		size++;
		if(isEmpty())
			front = rear = new Node<E>(item, null);
		else {
			rear.next  = new Node<E>(item, null);
			rear = rear.next;
		}
		return true;
	}
	public E deQ() {
		if(isEmpty()) return null;
		size--;
		E result = front.data;
		if(front == rear) {
			front = rear = null;
		}
		else front = front.next;
		return result;
		
	}
	public int size() {
		return size;
	}
	public String toString() {
		String s = "";
		for(Node<E> p = front; p != null; p= p.next)
			s += p.data+"";
		s += "\n";
		return s;
	}
}
