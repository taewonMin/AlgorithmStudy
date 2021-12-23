package part3.week29.psw;

import java.util.Arrays;
import java.util.Scanner;
// 115284	768
//115612	756
public class DP_1932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n][];
        dp[0] = new int[]{sc.nextInt()};
        int answer = dp[0][0];

        for (int i = 1; i < n; i++) {
            dp[i] = new int[i+1];
            for (int j = 0; j < i+1; j++) {
                if (j==0){
                    dp[i][j] = dp[i-1][0];
                }else if(j==i){
                    dp[i][j] = dp[i-1][j-1];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1]);
                }
                dp[i][j] += sc.nextInt();

                if (i==n-1) answer = Math.max(answer,dp[i][j]);
            }
        }
        //Arrays.sort
        System.out.println(answer);
        sc.close();
    }
}
