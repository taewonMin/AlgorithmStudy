package week13.bbg;

import java.util.Scanner;
// 거스름돈 17736KB	232ms
public class Math_14916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n >= 5) {
			int A = n/5;
			for(int a=A ; a > 0 ; a--) {
				float B = (float)(n-5*a)/2 ;
				int b = (int)B;
				if(B==b) {
					System.out.println(a+b);
					break;
				}
				if(a==1) System.out.println(-1);
			}
		}else {
			if(n % 2 == 0) {
				System.out.println(n/2);
			}else {
				System.out.println(-1);
			}
		}
		
		sc.close();
	}
}
