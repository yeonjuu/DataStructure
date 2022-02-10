package quene;

public interface MyQ<E> {
	public boolean isEmpty();
	public boolean enQ( E item);
	public E deQ();
	public int size();
}
