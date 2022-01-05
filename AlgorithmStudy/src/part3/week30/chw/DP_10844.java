package part3.week30.chw;

import java.util.Scanner;

public class DP_10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[][] dp = new long[N+1][10];
        for(int i = 1; i < 10; i++) {
        	dp[1][i] = 1;
        }
        int C = 1000000000;
        for(int i = 2; i <= N; i++) {
        	for(int j = 0; j < 10; j++) {
        		if(j == 0) {
        			dp[i][0] = dp[i-1][1] % C;
        		}else if(j == 9) {
        			dp[i][9] = dp[i-1][8] % C;
        		}else {
        			dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % C;
        		}
        	}
        }
        long result = 0;
        for(int i = 0; i < 10; i++) {
        	result += dp[N][i];
        }
        System.out.println(result % C);
        sc.close();
    }
}

/*
	    1  2  3  4  5  6  7  8  9  0
N = 1 : 1  1  1  1  1  1  1  1  1  0  -> 9개
N = 2 : 1  2  2  2  2  2  2  2  1  1  -> 17개
N = 3 : 2  3  4  4  4  4  4  3  2  1  -> 31개
N = 4 : 3  6  7  8  8  8  7  6  3  2  -> 58개
N = 5 : 6  10 14 15 16 15 14 10 6  3  -> 109개     
N = 6 : 10 20 25 30 30 30 25 20 10 6  -> 206개 
N = 7 : 20 35 50 55 60 55 50 35 20 10 -> 390개

*/

