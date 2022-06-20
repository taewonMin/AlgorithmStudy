package part5.week48.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TwoPointer_2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        Arrays.sort(numbers);
        int sum = 0;
        int start = 0;
        int end = n - 1;
        int tempSum = Integer.MAX_VALUE;
        int result1 = 0;
        int result2 = 0;

        while (start < end) {
            sum = numbers[start] + numbers[end];
            if (tempSum > Math.abs(sum)) {
                tempSum = Math.abs(sum);
                result1 = numbers[start];
                result2 = numbers[end];
            }
            if (sum <= 0) start++;
            else end--;
        }

        System.out.println(result1+"\n"+result2);

    }
}
