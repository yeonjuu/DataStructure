package quene;

public class TestQ {

	public static void main(String[] args) {
		//MyQ<String> q = new ArrayQ<String>(3);
		MyQ<String> q = new LinkedQ<String>();
		q.enQ("���"); q.enQ("������"); q.enQ("Ű��");
	      System.out.println(q.size()+": "+q.toString());
	      System.out.println("After dequeue "+q.deQ()+" is "+q);
	      q.enQ("����"); 
	      System.out.println(q.size()+": "+q.toString());
	      q.enQ("�ٳ���"); 
	      System.out.println(q.size()+": "+q.toString());
	      System.out.println(q.enQ("������"));
	      System.out.println(q.size()+": "+q.toString());

		
		
	}

}
