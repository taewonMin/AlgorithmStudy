package part4.week33.psw;

import java.util.Scanner;
//17144	140
public class DP_9251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = ("0"+sc.next()).toCharArray();
        char[] b = ("0"+sc.next()).toCharArray();

        int[][] dp = new int[a.length+1][b.length+1];
        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < b.length; j++) {
                dp[i][j] = a[i]==b[j] ? dp[i-1][j-1]+1 : Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        System.out.println(dp[a.length-1][b.length-1]);
    }
}