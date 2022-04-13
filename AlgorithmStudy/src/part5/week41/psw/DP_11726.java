package part5.week41.psw;

import java.util.Scanner;
//	12932	108
public class DP_11726 {
    static int[] DP;
    static int DIV = 10007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DP = new int[n];
        System.out.println(dp(n-1));
    }

    private static int dp(int n) {
        if (n < 2){
            return DP[n] = (n==0 ? 1 : 2);
        }
        if (DP[n-1]==0) DP[n-1]= dp(n-1);
        if (DP[n-2]==0) DP[n-2]= dp(n-2);
        return DP[n] = (DP[n-1]+DP[n-2])%DIV;
    }
}
/*
0 0 2개
0 0

0 0 0 3개
0 0 0

0 0 0 0 5개
0 0 0 0

0 0 0 0 0 8개
0 0 0 0 0

0 0 0 0 0 0 13개
0 0 0 0 0 0

7 -> 8+13=21
8 -> 13+21 = 34

0 0 0 0 0 0 0 0 0 55개...
0 0 0 0 0 0 0 0 0
 */

