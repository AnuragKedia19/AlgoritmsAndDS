package programmingInterview;

import java.util.LinkedList;


public class ReverseLL {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	static Node Reverse(Node head) {
		
			Node curr = head;
			Node prev = null;
			Node next1 = head;
		
			
			while(curr!=null) {
				next1 = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next1;
			}
		head = prev;
		return head;
	}
	
	static void printL(Node node) {
		while(node!=null) {
			System.out.println(node.data+" ");
			node=node.next;
		}
	}
	
	public static void main(String[] args) {
		
		ReverseLL list = new ReverseLL();
		list.head = new Node(86);
		list.head.next = new Node(15);
		list.head.next.next = new Node(18);
		list.head.next.next.next = new Node(20);
		printL(head);
		head = Reverse(head);
		System.out.println("After Reversing");
		printL(head);
	}

}
