package part4.week32.chw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DP_11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int max = 0;
        int[] arr = new int[N];
        int[] lis_dp = new int[N];
        int[] lds_dp = new int[N];
        lis_dp[0] = 1;
        lds_dp[0] = 1;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int idx = 0;
        while(st.hasMoreTokens()) {
        	arr[idx] = Integer.parseInt(st.nextToken());
        	idx++;
        }
        
        // LIS
        for(int i = 0; i < N; i++) {
        	lis_dp[i] = 1;
        	for(int j = 0; j < i; j++) {
        		if(arr[i] > arr[j] && lis_dp[i] < lis_dp[j] + 1) {
        			lis_dp[i] = lis_dp[j] + 1;
        		}
        	}
        }
        
        // LDS
        for(int i = N - 1; i >= 0; i--) {
        	lds_dp[i] = 1;
        	for(int j = N - 1; j > i; j--) {
        		if(arr[i] > arr[j] && lds_dp[i] < lds_dp[j] + 1) {
        			lds_dp[i] = lds_dp[j] + 1;
        		}
        	}
        }
        
        for(int i = 0; i < N; i++) {
        	max = Math.max(lds_dp[i] + lis_dp[i], max);
        }
        
        bw.write(String.valueOf(max-1));
        br.close();
        bw.flush();
        bw.close();
    }
}
/*
[8, 2, 9, 1, 4, 6, 7, 10]
[3, 2, 2, 1, 1, 1, 1, 1]

*/