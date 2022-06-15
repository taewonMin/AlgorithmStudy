package part5.week47.jje;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointer_3273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);
        int x = sc.nextInt();
        int sum = 0;
        int result = 0;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            sum = numbers[start] + numbers[end];
            if (sum == x) result++;
            if (sum <= x) start++;
            else end--;
        }

        System.out.println(result);
    }
}
