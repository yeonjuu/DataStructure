
public class BinarySearch {
	public int[] a;

	public static void main(String[] args) {
		int[] v = {60, 110, 115, 214, 255, 274, 293, 369, 396, 427, 436, 462};
		BinarySearch bs = new BinarySearch(v);
		System.out.println(bs.search(0, v.length, 369));
		
	}
	public BinarySearch(int [] val) {
		a = val;
	}
	public int  search(int l, int r, int key) {
		int result = 0;
		if(l>r) 
			result = -1;
		else { 
			int m = (l+r)/2;
			System.out.println("Check"+ a[m]);
			if(key == a[m]) 
				result = m;
			else if(key < a[m]) 
				result = search(l, m-1, key);
			else 
				result = search(m+1, r ,key);
		}
		return result;
	}

}
