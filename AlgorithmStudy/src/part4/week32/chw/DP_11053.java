package part4.week32.chw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DP_11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];
        dp[0] = 1;
        int max = 0;
        int idx = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()) {
        	arr[idx] = Integer.parseInt(st.nextToken());
        	idx++;
        }
        for(int i = 0; i < N; i++) {
        	dp[i] = 1;
        	for(int j = 0; j < i; j++) {
        		if(arr[j] < arr[i] && dp[j] + 1 > dp[i]) {
        			dp[i] = dp[j] + 1;
        		}
        	}
        	max = Math.max(dp[i], max);
        }
        
        bw.write(String.valueOf(max));
        br.close();
        bw.flush();
        bw.close();
    }
}