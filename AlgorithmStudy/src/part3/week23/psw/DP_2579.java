package part3.week23.psw;

import java.util.Scanner;
//13364	128
public class DP_2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] steps = new int[N+1], dp = new int[N+1];
        for (int i = 1; i <= N; i++) {
            steps[i] = sc.nextInt();
            if(i==1) dp[i]=steps[i];
            if(i==2) dp[i]=steps[i]+dp[i-1];
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = steps[i] + Math.max(dp[i-2],dp[i-3]+steps[i-1]);
        }
        System.out.println(dp[N]);
    }
}