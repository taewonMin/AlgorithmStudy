package part3.week30.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 쉬운 계단 수
public class DP_10844 {
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static long[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new long[N+1][10];    // 길이N, N번째 자리수

        for(int i=0; i<10; i++){
            dp[1][i] = 1;
        }

        long sum = 0;
        for(int i=1; i<10; i++){
            sum += stair(N, i);
        }
        bw.write(sum%1000000000+"");

        br.close();
        bw.flush();
        bw.close();
    }

    public static long stair(int N, int i) throws IOException{
        if(N > 1 && dp[N][i] == 0){
            if(i==0){   // 자리수가 0이면 다음 수는 1
                dp[N][i] = stair(N-1, 1);
            }else if(i==9){ // 자리수가 9이면 다음수는 8
                dp[N][i] = stair(N-1, 8);
            }else{
                dp[N][i] = stair(N-1, i-1) + stair(N-1, i+1);
            }
        }
        return dp[N][i]%1000000000;
    }
}
