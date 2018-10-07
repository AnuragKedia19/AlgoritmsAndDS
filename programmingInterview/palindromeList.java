package programmingInterview;

//import programmingInterview.DeleteMiddle.Node;

public class palindromeList {
	
static class Node{
		
		int data;
		Node next = null;
		
		Node(int data){
			this.data = data;
		}
		
		
	}
	
	static Node Middle(Node head) {
		
		Node slow_ptr = head;
		Node fast_ptr = head;
		while(fast_ptr!=null && fast_ptr.next!=null) {
			slow_ptr = slow_ptr.next;
			fast_ptr = fast_ptr.next.next;
		}
		
		return slow_ptr;
		
	}
	
	static int Length(Node head) {
		int count = 0;
		while(head!=null) {
			count++;
			head = head.next;
		}
		
		return count;
	}
	
	static Node Reverse(Node head) {
		Node curr1 = head;
		Node prev = null;
		Node next1 = curr1;
		while(curr1!=null) {
			next1 = curr1.next;
			curr1.next = prev;
			prev = curr1;
			curr1 = next1;			
		}
		
		return prev;
	}
	
	static boolean palindrome(Node head) {
		Node curr = head;
		
		if(curr==null)
			return false;
		int len = Length(curr);
		Node mid = Middle(curr);
		//printList(mid);
		Node rev;
		
		//Node temp = mid.next;
		int flag=0;
		if(len%2!=0) {
			rev = Reverse(mid.next);
			printList(rev);
			
		}
		else
		{
			rev = Reverse(mid);
			printList(rev);
			
		}
		
		while(rev != null && curr!=mid) {
			if(rev.data!=curr.data) {
					flag =1;
					break;
			}
			rev=rev.next;
			curr = curr.next;
		}
		
		if(flag==0)
			return true;
		else
			return false;
		
		
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
		Node start = new Node(10); 
        start.next = new Node(12); 
        start.next.next = new Node(17); 
        start.next.next.next = new Node(16); 
        start.next.next.next.next = new Node(17); 
        start.next.next.next.next.next = new Node(12); 
        start.next.next.next.next.next.next = new Node(10); 
        
        System.out.println("Linked list before :"); 
        printList(start); 
        System.out.println();
        if(palindrome(start)) {
        	System.out.println("it is a Palindrome");
        }
        else {
        	System.out.println("It is not a palindrome");
        }


	}

}
