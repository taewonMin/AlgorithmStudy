package part3.week28.psw;

import java.util.Scanner;
//	70680	296
public class DP_1904 {
    static int[] dp = null;
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        dp = new int[n+1];
        System.out.println(goDP(n));
    }

    private static int goDP(int n) {
        if (n < 3) return dp[n] = n;
        if (dp[n] == 0) dp[n] = ((dp[n-1]=goDP(n-1)%15746) + (dp[n-2] = goDP(n-2)%15746))%15746;
        return dp[n];
    }
}
/*

00 이 가질 수 있는 개수별

00 = 1  -> 1

n/2 ->



1(1)   = [1]
2(2)   = [11,00]
3(3)   = [001,100,111]
4(5)   = [0000,0011,1100,1001,1111]
5(8)   = [
          00001,00111,11001,10011,11111
            10000,11100,11001
          ]
6()     = [
            000000
            000011,001111,110011,100111,111111
            100001,100111,
            ]
 */
