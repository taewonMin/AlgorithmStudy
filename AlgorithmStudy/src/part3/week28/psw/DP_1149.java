package part3.week28.psw;

import java.util.Arrays;
import java.util.Scanner;

public class DP_1149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][3];
        for (int i = 1; i <= n; i++) {
            dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2]) + sc.nextInt();
            dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2]) + sc.nextInt();
            dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1]) + sc.nextInt();
        }
        System.out.println(Arrays.stream(dp[n]).min().getAsInt());
        sc.close();
    }
}