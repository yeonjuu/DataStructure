package data1001;

import java.util.*;

public class TestStack {
	public static void main(String[] args) {
		Stack<String> crates = new ArrayStack<String>(4);
		System.out.println(crates.push("키위"));
		System.out.println(crates.push("사과"));
		System.out.println(crates.push("복숭아"));
		System.out.println(crates.push("피망"));
			
		System.out.println("과일이  몇개? " + crates.size());
		System.out.println("맨 위의 있는 과일은? " +  crates.peek());
		
		
		Stack<String> crates2 = new ListStack<String>();
		System.out.println(crates2.push("키위"));
		System.out.println(crates2.push("사과"));
		System.out.println(crates2.push("복숭아"));
		System.out.println(crates2.push("바나나"));
			
		System.out.println("과일이  몇개? " + crates2.size());
		System.out.println("맨 위의 있는 과일은? " +  crates2.peek());
	}

}
