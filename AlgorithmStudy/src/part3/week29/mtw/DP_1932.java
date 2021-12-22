package part3.week29.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class DP_1932 {
    public static int[][] triangle;
    public static int[][] dp;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        triangle = new int[n][n];
        dp = new int[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i], -1);
        }

        for(int i=0; i<n; i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j<input.length; j++){
                triangle[i][j] = Integer.parseInt(input[j]);
            }
        }

        dp[0][0] = triangle[0][0];
        int max = 0;
        for(int i=0; i<n; i++){
            int num = recursion(n-1, i);
            if(num > max){
                max = num;
            }
        }

        bw.write(max+"");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int recursion(int i, int j){
        if(dp[i][j] == -1){
            if(j==0){
                dp[i][j] = recursion(i-1, j) + triangle[i][j];
            }else if(j==i){
                dp[i][j] = recursion(i-1, j-1) + triangle[i][j];
            }else{
                dp[i][j] = Math.max(recursion(i-1, j-1), recursion(i-1, j)) + triangle[i][j];
            }
        }
        return dp[i][j];
    }
}
