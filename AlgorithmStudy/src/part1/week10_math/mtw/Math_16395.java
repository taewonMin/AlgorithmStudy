package part1.week10_math.mtw;

import java.util.Scanner;

// 파스칼의 삼각형
public class Math_16395 {
	static int[][] dp;
	static int binomial(int n, int k) {
		if(k==0 || n==k) {
			return 1;
		}
		
		if(dp[n][k] == 0) {
			dp[n][k] = binomial(n-1,k-1) + binomial(n-1,k);
		}
		return dp[n][k];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt()-1;
		int k = sc.nextInt()-1;
		
		dp = new int[n+1][k+1];
		System.out.println(binomial(n, k));
		
		sc.close();
	}
}
