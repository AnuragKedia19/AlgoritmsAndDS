package programmingInterview;

//import java.util.Arrays;
import java.util.Scanner;

public class Fib_BottonUp {
	
public static int fib_bottom(int n) {
		
		if((n==1)||(n==2)) {
			return 1;
		}
		int bottom [] = new int[n+1];
		bottom[1] = 1;
		bottom[2] = 1;
		for(int i=3; i<=n;i++) {
			bottom[i] = bottom[i-1] + bottom[i-2];
		}
			
		
		return bottom[n];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), res=0;
		res = fib_bottom(n);
		System.out.println(res);

	}

}
