package part4.week33.mtw;

import java.io.*;
import java.util.Arrays;

public class DP_1912 {
    public static int[] sequence;
    public static int[] dp;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        sequence = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        dp = new int[n];
        dp[0] = sequence[0];

        bw.write(bottomUp(n)+"");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int bottomUp(int n){
        int max = dp[0];
        for(int i=1; i<n; i++){
            if(dp[i-1] > 0){
                dp[i] = dp[i-1] + sequence[i];
            }else{
                dp[i] = sequence[i];
            }
            if(dp[i] > max){
                max = dp[i];
            }
        }
        return max;
    }
}
