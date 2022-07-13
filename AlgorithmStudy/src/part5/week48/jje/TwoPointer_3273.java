package part5.week48.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoPointer_3273 {
    public static void main(String[] args) throws IOException {
        //1806
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int result = Integer.MAX_VALUE;
        int start = 0;
        int end = start + 1;
        int sum = 0;
        int tempResult = 0;
        int tempSum = 0;

        while (start < end && start < n) {
            tempSum = sum + numbers[start];
            tempResult++;
            if (s <= sum && result <= tempResult ) {
                start++;
                end = start + 1;
                sum = 0;
                tempResult = 0;

            } else {
                end++;
                result = tempResult;
                sum = tempSum;
            }
        }

        System.out.println(result);

    }
}