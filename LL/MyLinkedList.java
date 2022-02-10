package LL;
import java.util.*;

public class MyLinkedList<T extends Comparable>{
	private Node<T> start;
	private static class Node<T extends Comparable>{
		T data;
		Node<T> next; // point the next node
		Node(){
			data = null;
			next = null;
		}
		Node(T newData, Node<T>nextList){
			data = newData;
			next = nextList;
		}
	}
	
	public void insert (T x) {
		if(start ==null || start.data.compareTo(x)>0) {//start.data > x인경우
			start = new Node<T>(x , start);
			return;
		}//insertion case2,3
		Node<T> p = start;
		
		while(p.next != null) {
			if(p.next.data.compareTo(x) > 0) break;
			p = p.next;
		}
		p.next = new Node<T>(x, p.next);
	}//insertion case 1,4
	
	public boolean delete(T x) {
		if(start ==null || start.data.compareTo(x)>0)
			return false;//empty the list
		
		if(start.data.compareTo(x) == 0) {
			start = start.next;
			return true;
		}//start data delete
		
		for(Node<T> p = start; p.next != null; p = p.next) {
			if(p.next.data.compareTo(x) > 0) break;
			else if(p.next.data.compareTo(x) == 0) {
				p.next = p.next.next; //p값만 변경해서 데이터 삭제
				return true;
			}
		}
		return false;
	}
	public void print() {
		Node<T> p = start;
		for(; p != null; p = p.next) {
				System.out.println(p.data + "->");
		}
			System.out.println(p.data);
	}
}


