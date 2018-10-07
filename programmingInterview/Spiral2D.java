package programmingInterview;

import java.util.Scanner;

public class Spiral2D {

	static void PrintSpiral(int A[][],int m, int n) {
			
			int T=0,B=m-1,L=0,R=n-1,dir=0;
			while(T<=B && L<=R)
			{
				if(dir==0) {
					for(int i=L;i<R;i++) {
						System.out.println(A[T][i]);
					}
					dir=1;
					T++;
				}
				
				else if(dir==1) {
					for(int i=T;i<B;i++) {
						System.out.println(A[i][R]);
					}
					dir=2;
					R--;
				}
				
				else if(dir==2) {
					for(int i=R;i>=L;i--) {
						System.out.println(A[B][i]);
					}
					dir=3;
					B--;
				}
				
				else if(dir==3) {
					for(int i=B;i>=T;i--) {
						System.out.println(A[i][L]);
					}
					dir=3;
					L++;
				}
				
			}
			
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A[][] = new int[4][4];
		for(int j=0;j<4;j++) {
			for(int k=0;k<4;k++) {
				A[j][k] = sc.nextInt();
			}
			PrintSpiral(A,4,4);
			
			
		}

	}

}
