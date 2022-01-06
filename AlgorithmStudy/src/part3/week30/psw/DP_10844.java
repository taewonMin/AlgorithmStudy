package part3.week30.psw;

import java.util.Arrays;
import java.util.Scanner;

public class DP_10844 {
    static int[] DP = new int[101];

    public static void main(String[] args) {
        DP[1] = 9; DP[2] = 17;
        DP[3] = 32; DP[4] = 61;
        DP[5] = 116; DP[6] = 222;
        DP[7] = 424; DP[8] = 813;
//      0 -1 -2 -3 -6 -10 -20 -35 -70
//        Scanner sc = new Scanner(System.in);
//        sc.close();
//        for (int i = 1; i < 100; i++) {
//            System.out.println(i+" : "+test3(i));
//        }
        test2(10);
    }

    private static int test(int n) {
        int cnt = 0;
        int start = (int)Math.pow(10,n-1);
        int end = (int)Math.pow(10,n);
        for (int i = start; i < end; i++) {
            String t = i+"";
            boolean flag = true;
            for (int j = 0; j < n-1; j++) {
                if (Math.abs(Integer.parseInt(t.charAt(j)+"") - Integer.parseInt(t.charAt(j+1)+""))!=1) flag = false;
            }
            if (flag) {
                System.out.println(i);
                cnt++;
            }
        }
        return cnt;
    }

    public static int test2(int n){
        int[][] dp = new int[n][11];
        for (int i = 0; i < 10; i++) {
            if (i==9) dp[1][i] = 1;
            if (i>0 && i<9) dp[1][i] = 2;
            dp[0][i] = 1;
        }

        for (int i = 2; i < n; i++) {
            for (int j = 1; j < 10; j++) {
                dp[i][j] = dp[i-1][j-1]+dp[i-1][j+1];
                if (j == 1) dp[i][j] += dp[i-2][j];
            }
        }
        return Arrays.stream(dp[n-1]).sum();
    }
//
//12880	108
    public static int test3(int n){
        int[][] dp = new int[101][11];
        for (int i = 0; i < 10; i++) {
            if (i==9) dp[1][i] = 1;
            if (i>0 && i<9) dp[1][i] = 2;
            if (i>0) dp[0][i] = 1;
        }
        int answer = 0;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < 10; j++) {
                dp[i][j] = (dp[i-1][j-1]%1000000000+dp[i-1][j+1]%1000000000)%1000000000;
                if (j == 1) dp[i][j] += dp[i-2][j]%1000000000;

                if (i==n-1) answer = (answer%1000000000 + dp[i][j]%1000000000)%1000000000;
            }

        }
        if (n==1) answer = 9;
        if (n==2) answer = 17;
        return answer;
    }
}
/*
    1  -> 10     56 5~~
                    7~~
    2  -> 21
          23
    3  ->
    4
    5
    6
    7
    8
    9 -> 98





 */