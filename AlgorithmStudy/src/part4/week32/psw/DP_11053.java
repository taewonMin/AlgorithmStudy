package part4.week32.psw;

import java.util.Arrays;
import java.util.Scanner;

public class DP_11053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numbers = new int[length];
        int[] dp = new int[length];

        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[j] && max < dp[j]) {
                    max = dp[j];
                }
            }
            dp[i] = max +1;
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());
        sc.close();
    }
}
