package part5.week42.psw;

import java.util.Scanner;

public class PrefixSum_11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = sc.nextInt();
        int[] prefixSum = new int[n+1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] += prefixSum[i-1] + sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(prefixSum[b]-prefixSum[a-1]);
        }
    }
}
