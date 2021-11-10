package part3.week25.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_1003 {
    public static BufferedWriter bw;
    public static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++){
            int N = Integer.parseInt(br.readLine());
            dp = new int[N+1][2];
            dp[0] = new int[]{1,0};
            if(N > 0){
                dp[1] = new int[]{0,1};
                fibonacci(N);
            }
            bw.write(dp[N][0] + " " + dp[N][1] + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static int[] fibonacci(int N) throws IOException{
        if(dp[N][0] != 0 || dp[N][1] != 0){
            return dp[N];
        }

        int[] temp1 = fibonacci(N-1);
        int[] temp2 = fibonacci(N-2);
        dp[N][0] = temp1[0]+temp2[0];
        dp[N][1] = temp1[1]+temp2[1];
        return dp[N];
    }
}
