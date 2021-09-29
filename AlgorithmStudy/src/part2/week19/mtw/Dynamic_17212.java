package part2.week19.mtw;

import java.util.Arrays;
import java.util.Scanner;

public class Dynamic_17212 {
    static int[] dp;
    static int[] coin = {7,5,2,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        dp = new int[N+1];
        Arrays.fill(dp, N);
        dp[0] = 0;

        for(int i=1; i<=N; i++){
            for(int j=0; j<coin.length; j++){
                if(i % coin[j] == 0 && dp[i] == N){
                    dp[i] = i / coin[j];
                    break;
                }else if(i > coin[j]){
                    int cnt = dp[i-coin[j]] + 1;
                    if(dp[i] > cnt){
                        dp[i] = cnt;
                    }
                }
            }
        }

        System.out.println(dp[N]);

        sc.close();
    }
}
