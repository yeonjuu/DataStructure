package data1001;

public interface Stack<T> {
	public boolean isEmpty();
	public boolean push(T newItem); // isFull
	public T pop();
	public T peek();
	public int size();
	

}
