package quene;

public class TestQ {

	public static void main(String[] args) {
		//MyQ<String> q = new ArrayQ<String>(3);
		MyQ<String> q = new LinkedQ<String>();
		q.enQ("사과"); q.enQ("오렌지"); q.enQ("키위");
	      System.out.println(q.size()+": "+q.toString());
	      System.out.println("After dequeue "+q.deQ()+" is "+q);
	      q.enQ("양파"); 
	      System.out.println(q.size()+": "+q.toString());
	      q.enQ("바나나"); 
	      System.out.println(q.size()+": "+q.toString());
	      System.out.println(q.enQ("복숭아"));
	      System.out.println(q.size()+": "+q.toString());

		
		
	}

}
