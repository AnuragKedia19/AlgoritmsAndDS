package programmingInterview;

//import java.util.LinkedList;

public class DeleteMiddle {
	
	//static Node head;
	
	static class Node{
		
		int data;
		Node next = null;
		
		Node(int data){
			this.data = data;
		}
		
		
	}
	
	public static void Middle(Node head, int x) {
		
			Node curr = head;
			Node prev = null;
			
			while(curr.next!=null) {
				
				if(curr.data==x) {
					prev.next = curr.next;
					curr.next = null;
				}
			else {
				prev = curr;
				curr = curr.next;
			}
			}
		
	}
	
	static void printList(Node head)  
    { 
        while (head != null)  
        { 
            System.out.print(head.data + " "); 
            head = head.next; 
        } 
    } 

	public static void main(String[] args) {
		
		//LinkedList list = new LinkedList(); 
		Node start = new Node(10); 
        start.next = new Node(12); 
        start.next.next = new Node(17); 
        start.next.next.next = new Node(19); 
        start.next.next.next.next = new Node(12); 
        start.next.next.next.next.next = new Node(11); 
        start.next.next.next.next.next.next = new Node(10); 
        
        System.out.println("Linked list before :"); 
        printList(start); 
        
        Middle(start, 11);
        
        System.out.println("\nLinked list after removing Middle except first and last :"); 
        printList(start);
		

	}

}
