package programmingInterview;

import java.util.Scanner;

public class circularlySorted {
	
	static int FindRot(int A[], int n) {
		
		int low=0, high = n-1;
		while(low<=high) {
			
			if(A[low]<=A[high]) {
					return low;
			}
			
			int mid = (low+high)/2;
			int nex = (mid+1)%n, prev = (mid+n-1)%n;
			if(A[mid]<=A[nex] && A[mid]<=A[prev]) {
				return mid;
			}
			else if(A[mid]<=A[high]) high = mid -1;
			else if (A[mid]<=A[low]) low = mid +1;
			
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
		int count = FindRot(A,11);
		System.out.println(count);
	}

}
