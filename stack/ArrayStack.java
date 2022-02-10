package data1001;

public class ArrayStack<T> implements Stack<T> {
		private int top = -1;
		private T[] item;
		public ArrayStack(int size) {
			item = (T[]) new Object[size]; //����ȯ
			
		}//arraystack�� ��ü�� ����� ���ؼ� �ʿ���.
		public boolean isEmpty() {
			if(top < 0) 
				return true;
			else
				return false;
	
		}
		public boolean push(T newItem) {
			if(top < item.length) {//item�� ���̰� top�� ������ �� ���� full�� ����
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
			return item[top+1];//top�� ��ġ�� �̵���Ų �� �� �ڿ� ���� return �ؾ� ����� pop��.
		}
		public T peek() {
			return item[top];
		}
		public int size() {
			return top+1;
		}
}

