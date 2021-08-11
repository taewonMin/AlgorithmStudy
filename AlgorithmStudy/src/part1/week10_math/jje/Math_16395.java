package part1.week10_math.jje;

import java.util.Scanner;

public class Math_16395 {

	public static void main(String[] args) {
		   
		//파스칼의 삼각형 https://blog.naver.com/vollollov/220947452823
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(factorial(n)/(factorial(k)*factorial(n-k)));
	
		sc.close();
	}
	   
	static int factorial(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result*=i;
		}
		return result;
	}
}
