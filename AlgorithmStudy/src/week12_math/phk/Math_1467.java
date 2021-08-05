package week12_math.phk;

import java.util.Scanner;

public class Math_1467 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int s = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		int n = 1;
		
		/*
		e,s,m은 연도를 각각 15, 28, 19로 나눈 나머지
		(연도-e)%15=0
		(연도-s)%28=0
		(연도-m)%19=0
		 */
		
		System.out.println(n);
	}
}
