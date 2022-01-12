package part4.week31.chw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_2156 {
	static Integer[] dp;
	static int[] grapeArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int N = Integer.parseInt(br.readLine());
        dp = new Integer[N+1];
        grapeArr = new int[N+1];
        for(int i = 1; i <= N; i++) {
        	grapeArr[i] = Integer.parseInt(br.readLine());
        }
        
        dp[0] = 0;
        dp[1] = grapeArr[1];
        if(N > 1) {
        	dp[2] = grapeArr[1] + grapeArr[2];
        }
        System.out.println(dp(N));
        br.close();
        bw.flush();
        bw.close();
    }
    static int dp(int N) {
    	if(dp[N] == null) {
//    		dp[N] = Math.max(dp(N-2), dp(N-3) + grapeArr[N-1]) + grapeArr[N];
    		dp[N] = Math.max(Math.max(dp(N-2), dp[N-3] + grapeArr[N-1]) + grapeArr[N], dp(N-1));
    	}	//							16		6			13				9
    		//									19 + 9 , 	10 +13
    	return dp[N];
    }
}
