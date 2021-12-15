package part3.week28.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_1149 {
    public static int cost[][];
    public static int dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        cost = new int[N][3];
        dp = new int[N][3];
        for(int i=0; i<N; i++){
            String[] input = br.readLine().split(" ");
            int R = Integer.parseInt(input[0]);
            int G = Integer.parseInt(input[1]);
            int B = Integer.parseInt(input[2]);
            cost[i] = new int[]{R,G,B};
            if(i==0){
                dp[i] = new int[]{R,G,B};
            }
        }
        
        int min = Math.min(recursion(N-1, 0), Math.min(recursion(N-1, 1), recursion(N-1, 2)));
        bw.write(min+"");

        br.close();
        bw.flush();
        bw.close();
    }

    public static int recursion(int N, int color){
        if(dp[N][color] == 0){
            if(color==0){
                dp[N][color] = Math.min(recursion(N-1, 1), recursion(N-1, 2)) + cost[N][color];
            }else if(color==1){
                dp[N][color] = Math.min(recursion(N-1, 0), recursion(N-1, 2)) + cost[N][color];
            }else{
                dp[N][color] = Math.min(recursion(N-1, 0), recursion(N-1, 1)) + cost[N][color];
            }
        }
        return dp[N][color];
    }
}
