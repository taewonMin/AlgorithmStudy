package part4.week34.psw;

import java.util.Scanner;

public class Greedy_1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), sum = 0;
        int max = 1;
        while (true){
            sum += max;
            if (n <= sum) break;
            max++;
        }
        System.out.println(n==sum ? max : max-1);
    }
}
