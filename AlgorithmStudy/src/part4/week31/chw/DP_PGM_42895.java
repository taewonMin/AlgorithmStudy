package part4.week31.chw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_PGM_42895 {
	static int N;
	static int number;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] numArr = br.readLine().split(" ");
        N = Integer.parseInt(numArr[0]);
        number = Integer.parseInt(numArr[1]);
        
        int result = dp(N, 1);
        bw.write(String.valueOf(result));
        
        br.close();
        bw.flush();
        bw.close();
    }
    static int dp(int num, int cnt) {
    	int len = String.valueOf(num).length();
    	String s = "";
    	for(int i = 0; i < len; i++) {
    		s += String.valueOf(N);
    	}
    	if(num == Integer.parseInt(s)) {
    		return len + cnt - 1;
    	}
    	
    	// 덧셈
    	dp(num + N, cnt + 1);
    	// 뺄셈
    	dp(num - N, cnt + 1);
    	// 곱셈
    	dp(num * N, cnt + 1);
    	// 나눗셈
    	dp(num / N, cnt + 1);
    	
    	
    	return 0;
    }
}
