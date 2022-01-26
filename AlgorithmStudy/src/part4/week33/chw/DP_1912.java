package part4.week33.chw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DP_1912 {
	static Integer[] dp;
	static int[] arr;
	static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n];
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        dp[0] = arr[0];
        max = arr[0];
        
        dp(n-1);
        System.out.println(max);
        br.close();
        bw.flush();
        bw.close();
    }
    
    static int dp(int N) {
    	if(dp[N] == null) {
    		dp[N] = Math.max(dp(N-1) + arr[N], arr[N]);
    		max = Math.max(max, dp[N]);
    	}
    	return dp[N];
    }
}
