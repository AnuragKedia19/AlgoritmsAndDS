package programmingInterview;

import java.util.Scanner;

public class LongestSpan {

	public static void main(String[] args) {
		
			// arr1= 0,1,0,1,0,0,1
			// arr2= 0,1,1,0,0,0,0
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1 []  = new int[n];
		int arr2[] = new int[n];
		int maxlen=0, presum1=0,presum2=0,curr_diff, diff_i,len;
		int diff[] = new int[2*n+1];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			arr2[i] = sc.nextInt();
		}
		for(int i=0;i<2*n+1;i++) {
			diff[i] = -1;
		}
		
		for(int i=0;i<n;i++) {
			
			presum1+=arr1[i];
			presum2+=arr2[i];
			
			curr_diff= presum1-presum2;
			diff_i = n + curr_diff;
			
			if(curr_diff==0) {
				maxlen = i+1;
			}
			
			else if(diff[diff_i] == -1) {
				diff[diff_i]=i;
			}
			
			else {
				
				len=i-diff[diff_i];
				
				if(len>maxlen) {
					maxlen=len;
				}
			}
		}
		
		System.out.println(maxlen);
		
	}

}
