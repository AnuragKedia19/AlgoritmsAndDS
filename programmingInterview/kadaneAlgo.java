package programmingInterview;

import java.util.Scanner;

public class kadaneAlgo {
	
	public static int kadane(int a[]) {
		 int max=0, max_curr = a[0];
		 for(int i=1;i<a.length;i++) {
			 
			 max_curr = Math.max(a[i], max_curr+a[i]);
			 
			 if(max_curr>max) {
				 max = max_curr;
			 }
		 }
		 
		 return max;
	}

//	public static void main(String[] args) {
//		
//		  Scanner sc = new Scanner(System.in);
//		  int n = sc.nextInt();
//		  int a[] = new int[n];
//		  for(int i=0;i<n;i++) {
//			  a[i]=sc.nextInt();
//		  }
//		  int max = kadane(a);
//		  System.out.println(max);
//	}

}
