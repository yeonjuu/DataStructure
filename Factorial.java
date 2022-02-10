//recursion �� �̿��� factorial coding
//recursion�� �Լ��� stack���� �����ϱ⿡ error�� ����� stackoverflow �߻� 
public class Factorial {
	private static long[] fib = new long[45];
	private static int lastIndex = 2;
	static {
		fib[0] = 0;
		fib[1] = fib[2] =1;
	}
	public static void main(String[] args) {
		Factorial f = new Factorial();
		for( int n =0 ; n <44; n++) {
			long t0 = System.currentTimeMillis();
			long m = f.dpFibonacci(n);
			long t1 = System.currentTimeMillis();
			System.out.println(n + "\t"+(t1-t0));
		}
	/*	for( int n =0 ; n < 50; n++) {
			long t0 = System.currentTimeMillis();
			long m = f.fibonacci(n);
			long t1 = System.currentTimeMillis();
			System.out.println(n + "\t"+(t1-t0));
		}*/
		/*for( int n =0 ; n < 48; n++) {
			long t0 = System.currentTimeMillis();
			long m = f.iterativeFibonacci(n);
			long t1 = System.currentTimeMillis();
			System.out.println(n + "\t"+(t1-t0)+"\t"+m);
		}*/
		//System.out.println(f.factorial(5));
		//System.out.println(f.f(101));// ¦���� ��� base case�� �������� �ʴ´� (n=1�� �ɼ�����)
		//System.out.println(f.fibonacci(6));
	}
	public long factorial(int n) {
		if(n==0 || n==1) 
			return 1;
		else if(n >1)
			return n*factorial(n-1);
		else return -1;
	}
	public int f (int n) {
		if(n==1) return 1;
		else return n*f(n-2);
	}
	public long fibonacci(int n ) {//��ȿ������, �Ȱ��� ���� �ݺ��ؼ� ȣ��
		if(n==0) 
			return 0;
		else if(n==1 || n==2) 
			return 1;
		else
			return fibonacci(n-1) + fibonacci(n-2);
		
	}
	public long iterativeFibonacci(int n) {
		if(n==0) 
			return 0;
		else if(n==1 || n==2) 
			return 1;
		else {
			long f0 = 0, f1 = 1, f2 =2;//f2 = f(n), f1 = F(n-1), f0 =f(n-2)
			for( int i = 2; i<n; i++) {
				f0 = f1;
				f1 = f2;
				f2 = f1 + f0;
			}
			return f2;
		}
	}
	public long dpFibonacci(int n) {
		for(int i = lastIndex+1; i <=n; i++) 
				fib[i] = fib[i-1] + fib[i-2];
		if(n > lastIndex) lastIndex = n;
			return fib[n];
		}
	}