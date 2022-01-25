package part4.week33.psw;

import java.util.Scanner;

public class DP_12865 {
    public static void main(String[] args) {
        test2();
    }

    public static void test1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] dp = new int[k+1];
        for (int i = 0; i < n; i++) {
            dp[sc.nextInt()] = sc.nextInt();
        }

        for (int i = 1; i <= k; i++) {
            for (int j = i+1; j+i <= k; j++) {
                dp[i+j] = Math.max(dp[i+j],dp[i]+dp[j]);
            }
        }
        System.out.println(dp[k]);
    }

    public static void test2(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] dp = new int[k+1], weight = new int[n+1], value = new int[n+1],dp2 = new int[k+1];
        for (int i = 1; i <= n; i++) {
            weight[i] = sc.nextInt();
            value[i]  = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j + weight[i] <= k; j++) {
                dp2[j+weight[i]] = Math.max(dp2[j+weight[i]],dp2[j]+value[i]);
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = k; j - weight[i] >= 0; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }

        System.out.println(dp[k]);
    }
}
/*
4 7
6 13
4 8
3 4
5 12
 */