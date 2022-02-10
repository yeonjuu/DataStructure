package data1001;

import java.util.*;

public class TestStack {
	public static void main(String[] args) {
		Stack<String> crates = new ArrayStack<String>(4);
		System.out.println(crates.push("Ű��"));
		System.out.println(crates.push("���"));
		System.out.println(crates.push("������"));
		System.out.println(crates.push("�Ǹ�"));
			
		System.out.println("������  �? " + crates.size());
		System.out.println("�� ���� �ִ� ������? " +  crates.peek());
		
		
		Stack<String> crates2 = new ListStack<String>();
		System.out.println(crates2.push("Ű��"));
		System.out.println(crates2.push("���"));
		System.out.println(crates2.push("������"));
		System.out.println(crates2.push("�ٳ���"));
			
		System.out.println("������  �? " + crates2.size());
		System.out.println("�� ���� �ִ� ������? " +  crates2.peek());
	}

}
