package data1001;

public class ArrayStack<T> implements Stack<T> {
		private int top = -1;
		private T[] item;
		public ArrayStack(int size) {
			item = (T[]) new Object[size]; //형변환
			
		}//arraystack을 객체로 만들기 위해선 필요함.
		public boolean isEmpty() {
			if(top < 0) 
				return true;
			else
				return false;
	
		}
		public boolean push(T newItem) {
			if(top < item.length) {//item의 길이가 top의 값보다 긴 경우는 full된 상태
				item[++top] = newItem;
				return true;
			}
			else
				return false;
		}
		
		public T pop(){
			if(top < 0)
				return null;
			top--;
			return item[top+1];//top의 위치를 이동시킨 후 그 뒤에 값을 return 해야 제대로 pop됨.
		}
		public T peek() {
			return item[top];
		}
		public int size() {
			return top+1;
		}
}

