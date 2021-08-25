package part2.week15.jje;

import java.util.Scanner;

public class Math_16162 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();

        int[] melody = new int[n];

        for (int i = 0; i < n; i++) {
            melody[i] = sc.nextInt();
        }

        int num = 0;

        for (int i = 0; i < n; i++) {
            if (melody[i] == a) {
                num++;
                a += d;
            }

        }
        System.out.println(num);

        sc.close();
    }
}