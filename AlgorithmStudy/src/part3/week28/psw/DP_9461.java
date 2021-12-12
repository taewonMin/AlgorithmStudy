package part3.week28.psw;

import java.util.Scanner;
//12984	124
public class DP_9461 {
    static long[] dp = new long[101];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sample = {1, 1, 1, 2, 2, 3, 4, 5, 7, 9};
        for (int i = 1; i < 11; i++) { dp[i] = sample[i-1];}

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(goDP(sc.nextInt()));
        }
        sc.close();
    }

    private static long goDP(int n) {
        if (n > 10 && dp[n] == 0) dp[n] = (dp[n-2]=goDP(n-2)) + (dp[n-3] = goDP(n-3));
        return dp[n];
    }
}
