package part5.week44.psw;

import java.util.Scanner;

// 시간 복잡도 O(N)
public class PrefixSum_2559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] prefixSum = new int[n+1];
        int answer = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i-1]+sc.nextInt();
            if (i>=k) answer = Math.max(answer, prefixSum[i] - prefixSum[i-k]);
        }
        System.out.println(answer);
    }
}
