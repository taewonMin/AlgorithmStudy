package week9_math.jms;

import java.util.Scanner;

public class Math_16673 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int K = sc.nextInt();
		int P = sc.nextInt();
		
		long total = 0 ;
		for (int i = 1; i <= C; i++) {
			total += i*K+Math.pow(i, 2)*P;
		}
		System.out.println(total);
	}
}
