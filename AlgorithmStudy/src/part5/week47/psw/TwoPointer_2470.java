package part5.week47.psw;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointer_2470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        int start = 0, end = n-1, res = Integer.MAX_VALUE;
        String answer = "";
        while (start < end){
            int sum = numbers[start]+numbers[end];
            if (Math.abs(sum) < Math.abs(res)){
                res = sum;
                answer = numbers[start] +" "+numbers[end];
            }

            if (sum < 0){
                start++;
            }else {
                end--;
            }
        }
        System.out.println(answer);
    }
}
