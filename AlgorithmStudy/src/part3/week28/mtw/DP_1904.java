package part3.week28.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class DP_1904 {
    public static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        dp = new int[N+2];
        Arrays.fill(dp, -1);
        dp[1] = 1;
        dp[2] = 2;

        bw.write(recursion(N) + "");
        // bw.write(iterator(N) + "");

        br.close();
        bw.flush();
        bw.close();
    }

    // 336ms 55844KB
    public static int recursion(int N){
        if(dp[N] != -1){
            return dp[N];
        }
        return dp[N] = (recursion(N-1) + recursion(N-2))%15746;
    }

    // 148ms 18172KB
    public static int iterator(int N){
        if(N < 3){
            return N;
        }else{
            for(int i=3; i<=N; i++){
                dp[i] = (dp[i-1] + dp[i-2])%15746;
            }
            return dp[N];
        }
    }
}
