package part3.week23.psw;

import java.util.Scanner;

public class DP_2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int[] answer = new int[n];
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            answer[i+1] = answer[i] + numbers[i+1];
            answer[i+2] = answer[i] + numbers[i+2];
        }
        sc.close();
    }
}
