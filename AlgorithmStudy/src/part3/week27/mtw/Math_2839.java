package part3.week27.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Math_2839 {

    public static int[] dp = new int[5001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        dp[3] = 1;
        dp[4] = -1;
        dp[5] = 1;

        int N = Integer.parseInt(br.readLine());
        
        bw.write(recursion(N)+"");

        br.close();
        bw.flush();
        bw.close();

        // 방법 2
        // int cnt = 0;
        // while(true) {
        //     if(N%5 == 0) {
        //         System.out.println(N/5 + cnt);
        //         break;
        //     }
        //     if(N < 3) {
        //         System.out.println(-1);
        //         break;
        //     }
        //     N -= 3;
        //     cnt++;
        // }
    }

    static int recursion(int n){
        if(n < 3) return -1;
        if(dp[n] != 0) return dp[n];
        int temp1 = recursion(n-5)+1;
        int temp2 = recursion(n-3)+1;
        if(temp1 == 0 & temp2 == 0){
            return dp[n] = -1;
        }
        temp1 = temp1==0 ? Integer.MAX_VALUE : temp1;
        temp2 = temp2==0 ? Integer.MAX_VALUE : temp2;
        
        return dp[n] = Math.min(temp1, temp2);
    }
}
