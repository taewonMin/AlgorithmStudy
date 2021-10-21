package part3.week22.psw;

import java.util.Scanner;

public class DP_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n+1];
        for (int i = 2; i <= n ; i++) {
            numbers[i] += 1+numbers[i-1];
            if (i%3 ==0) numbers[i] = Math.min( numbers[i] , numbers[i/3] +1);
            if (i%2 ==0) numbers[i] = Math.min( numbers[i] , numbers[i/2] +1);
        }
        System.out.println(numbers[n]);
        sc.close();
    }
}