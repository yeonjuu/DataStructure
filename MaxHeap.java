
public class MaxHeap<T extends Comparable> {
	
	private T[] a;
	private int size = 0;
	private static int MAX = 100;
	public MaxHeap(int s) { a = (T[]) new Comparable[s];}
	public MaxHeap() { this(MAX);}
	public MaxHeap(T[] b) {
		int j =0;
		if(b[0] != null) j=1;
		a = (T[])new Comparable[b.length+j];
		for(int i = 0; i <b.length; i++)
			a[i+j] = b[i];
		size = a.length -1;
	}
	
	private int parent(int pos) { return pos/2;}
	private int left(int pos) { return pos*2;}
	private int right(int pos) { return pos*2 +1 ;}
	private boolean isLeaf(int pos) {
		if(pos> (size/2) && pos <= size)
			return true;
		return false;
	}
	
	private void swap(int i , int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public int size() {
		return size;
	}
	public void insert(T element) {
		a[++size] = element;
		int current = size;
		while(parent(current) > 0 && a[current].compareTo(a[parent(current)])>0) {
			swap(current, parent(current));
			current = parent(current);
		}
	}
	private void heapify(int pos) {
		if(!isLeaf(pos)) {
			if(right(pos)>size) {
				if(a[pos].compareTo(a[left(pos)])<0) {
					swap(pos, left(pos));
					heapify(left(pos));
				}
			}
			else if(a[pos].compareTo(a[left(pos)])<0 ||
					a[pos].compareTo(a[right(pos)])<0) {
				if(a[left(pos)].compareTo(a[right(pos)])>0) {
					swap(pos,left(pos));
					heapify(left(pos));
				}
				else {
					swap(pos, right(pos));
					heapify(right(pos));
				}
			}
		
		}
	}
	public T removeMax() {
		T result = a[1];
		a[1] = a[size--];
		heapify(1);
		return result;
	}
	public String toString() {
		String result = "{";
		for(int i = 1; i < size; i++) 
			result += a[i] + ",";
		result += a[size];
		return result + "}";
	}
	public void buildHeap(int index) {
		if(index > 0 && index <= size/2) {
			buildHeap(left(index));
			buildHeap(right(index));
			heapify(index);
		}
	}
	public void sort() {
		for(int i = size; i>1; i--) {
			swap(i,1);
			size--;
			heapify(1);
		}
		size = a.length-1;
	}
	private boolean isHeap(int root) {
		if(root <=0)
			return true;
		else if(root <= size/2) {//heap인지에 대한 3가지 조건
			for(int i = 1; i <size; i++) {
				if(a[i] == null)
					return false;
			}
			for(int i =1; i <size; i++) {
				if(a[right(i)] !=null ) {
					if(a[i].compareTo(a[left(i)])<0 ||
							a[i].compareTo(a[right(i)]) <0)
						return false;
					else return true;
				}
				if(a[right(i)] == null) {
					if(a[i].compareTo(a[left(i)])<0)
						return false;
				}
			}
			return true;
		}
		return true;
	}
	

	public static void main(String[] args) {
		
		MaxHeap<Integer> maxHeap = new MaxHeap<Integer>(15);

		maxHeap.insert(5);		maxHeap.insert(3);
		maxHeap.insert(17);		maxHeap.insert(10);
		maxHeap.insert(84);		maxHeap.insert(19);
		maxHeap.insert(6);		maxHeap.insert(22);
		maxHeap.insert(9);

		System.out.println("Heap(" + maxHeap.size() + "): " + maxHeap);

		while(maxHeap.size()>0)
			System.out.print(maxHeap.removeMax() + " ");

		System.out.println("\nNew Heap");

		Integer[] b = {null, 20, 40, 30, 10, 90, 70};

		maxHeap = new MaxHeap<Integer>(b);

		System.out.println("Before Construction: " + maxHeap.isHeap(1));
		System.out.println("Heap(" + maxHeap.size() + "): " + maxHeap);
		
		maxHeap.buildHeap(1);
		System.out.println("After Construction: " + maxHeap.isHeap(1));
		System.out.println("Heap(" + maxHeap.size() + "): " + maxHeap);
		
		maxHeap.sort();
		System.out.println("After sort: Heap("+ maxHeap.size() + "): " + maxHeap);
		
	}

}
