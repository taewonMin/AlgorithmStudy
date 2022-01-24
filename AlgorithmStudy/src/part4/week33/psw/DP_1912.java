package part4.week33.psw;

import java.util.Scanner;
//	97160	680
public class DP_1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), STACK = 0, NEW = 1, answer = Integer.MIN_VALUE;
        int[][] dp = new int[n+1][2];

        for (int i = 1; i < n+1; i++) {
            int number = sc.nextInt();
            dp[i][STACK] = Math.max(dp[i-1][STACK]+number,dp[i-1][NEW]+number);
            dp[i][NEW] = number;
            answer = Math.max(answer,Math.max(dp[i][STACK],dp[i][NEW]));
        }

        System.out.println(answer);
        sc.close();
    }
}
/*
더하거나 안더하거나의 최대값
 */