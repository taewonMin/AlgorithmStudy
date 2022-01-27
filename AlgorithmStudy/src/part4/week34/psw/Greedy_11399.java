package part4.week34.psw;

import java.util.Arrays;
import java.util.Scanner;
//	16328	156
public class Greedy_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        int sum = numbers[0];
        for (int i = 1; i < n; i++) {
            numbers[i] += numbers[i-1];
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
