package part3.week25.psw;

import java.io.*;
import java.util.Scanner;
//11428 73
public class DP_1003 {
    static int[][] dp = new int[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        dp[0][0]=1;
        dp[1][1]=1;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            bw.write(get(num,0)+" "+get(num,1)+"\n");
        }
        bw.flush();
    }

    public static int get(int num,int i){
        if(num<2){
            return dp[num][i];
        }else {
            if (dp[num-1][i]==0) dp[num-1][i] = get(num-1,i);
            if (dp[num-2][i]==0) dp[num-2][i] = get(num-2,i);
            return dp[num][i] = dp[num-1][i] + dp[num-2][i];
        }
    }
}