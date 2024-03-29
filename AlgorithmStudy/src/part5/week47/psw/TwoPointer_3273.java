package part5.week47.psw;

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
        int x = sc.nextInt();
        Arrays.sort(numbers);
        int start = 0, end = n-1, answer = 0;

        while (start < end){
            if (numbers[start] + numbers[end] == x) answer++;

            if (numbers[start] + numbers[end] < x) {
                start++;
            }else {
                end--;
            }
        }

        System.out.println(answer);
    }
}
