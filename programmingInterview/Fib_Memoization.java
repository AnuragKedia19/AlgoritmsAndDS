package programmingInterview;

import java.util.Arrays;
import java.util.Scanner;

public class Fib_Memoization {
	
	public static int fib_memo(int n, int memo[]) {
		
		if(memo[n]!=0) {
			return memo[n];
		}
		
		int result;
		if((n==1)||(n==2)) {
			result = 1;
		}
			
		else {
			result = fib_memo(n-1,memo) + fib_memo(n-2,memo);
		}
			
		memo[n]=result;
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), res=0;
		int memo [] = new int[n+1];
		Arrays.fill(memo, 0);
		res = fib_memo(n,memo);
		System.out.println(res);

	}

}
