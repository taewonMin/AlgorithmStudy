package week11_math.mtw;

import java.util.Scanner;

// 피보나치 치킨
public class Math_13270 {
	static long[] dp = new long[21];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int cnt = 1;
		long result = 0;
		while(result >= N) {
			result = fibocacci(cnt++);
		}
		
		System.out.println();
		
		sc.close();
	}
	
	
	static long fibocacci(int n) {
		if(n < 3) {
			return n;
		}
		
		if(dp[n] == 0) {
			dp[n] = fibocacci(n-1) + fibocacci(n-2);
		}
		
		return dp[n];
	}
}
