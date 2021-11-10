package part3.week25.chw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_1003 {
	static int[] dp;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++) {
        	dp = new int[2];
        	int N = Integer.parseInt(br.readLine());
        	if(N == 0) {
        		bw.write(0 + " " + 1 + "\n");
        	}else if(N == 1) {
        		bw.write(1 + " " + 0 + "\n");
        	}else {
        		fibonacci(N);
        		bw.write(dp[0] + " " + dp[1] + "\n");
        	}
        }
        br.close();
        bw.flush();
        bw.close();
    }
    static void fibonacci(int input) {
    	if(input == 0) {
    		dp[0]++;
    	}else if(input == 1) {
    		dp[1]++;
    	}else {
    		fibonacci(input - 1);
    		fibonacci(input - 2);
    	}
    }
}