package programmingInterview;

import java.util.Scanner;

public class SearchInCircularly {
	
	static int FindElement(int A[], int n, int x) {
		
		int low =0, high = n-1;
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			if(A[mid]==x) {
				
				return mid;
				
				}
			else if(A[mid]<=A[high]){
				if(x <= A[high] && x > A[mid]) {
					
					low = mid+1;
					
				}
				else {
					
					high = mid - 1;
				}
				
			}
			
			else if(A[low]<=A[mid]) {
				if(x>=A[low] && x<A[mid]) {
					high = mid -1;
				}
				else {
					low = mid+1;
					}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int A[]= new int[11];
		for(int i=0;i<11;i++) {
			
			A[i] = sc.nextInt();
		}
		int count = FindElement(A,11,5);
		System.out.println(count);
	}

}
