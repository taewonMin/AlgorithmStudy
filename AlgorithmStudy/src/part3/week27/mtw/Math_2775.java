package part3.week27.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Math_2775 {
    static int[][] dp = new int[15][15];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<15; i++){
            dp[0][i] = i+1;
            dp[i][0] = 1;
        }

        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            bw.write(recursion(k, n-1) + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    static int recursion(int k, int n){
        if(dp[k][n] != 0) return dp[k][n];
        return recursion(k, n-1) + recursion(k-1, n);
    }
}
