package part5.week46.psw;

import java.util.Scanner;

public class DP_24416 {
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        System.out.println(fn(n)+" "+(n-2));
    }
    static int fn(int n){
        if (n==1 || n==2){
            return dp[n]=1;
        }
        return dp[n]= fn(n-1)+fn(n-2);
    }
}
