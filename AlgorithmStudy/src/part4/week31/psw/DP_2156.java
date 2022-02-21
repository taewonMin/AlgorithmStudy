package part4.week31.psw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
//32640	448
public class DP_2156 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] dp = new int[t+1][3];
        for (int i = 1; i < t+1; i++) {
            int n = sc.nextInt();
            dp[i][0] = Arrays.stream(dp[i-1]).max().getAsInt();
            dp[i][1] = dp[i-1][0]+n;
            dp[i][2] = dp[i-1][1]+n;
        }
        System.out.println(Arrays.stream(dp[t]).max().getAsInt());
        sc.close();
    }
}
