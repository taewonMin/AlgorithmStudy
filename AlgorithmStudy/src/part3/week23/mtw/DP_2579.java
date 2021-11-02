package part3.week23.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_2579 {
    public static int[] dp;
    public static int[] stair;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new int[N];

        stair = new int[N];
        for(int i=0; i<N; i++){
            stair[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = stair[0];
        if(N>1) dp[1] = stair[0]+stair[1];
        if(N>2) dp[2] = Math.max(stair[0], stair[1])+stair[2];
        
        System.out.println(getMaxValue(N-1));

        br.close();
    }

    public static int getMaxValue(int N){
        if(dp[N] == 0){
            dp[N] = Math.max(getMaxValue(N-2), getMaxValue(N-3)+stair[N-1]) + stair[N];
        }
        return dp[N];
    }
}
