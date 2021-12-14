package part3.week28.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_9461 {

    public static long[] dp = new long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            bw.write(triangle(N)+"");
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static long triangle(int N){
        if(dp[N] == 0){
            dp[N] = triangle(N-1) + triangle(N-5);
        }
        return dp[N];
    }
}
