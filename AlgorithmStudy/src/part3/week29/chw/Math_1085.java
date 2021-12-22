package part3.week29.chw;

import java.util.Scanner;

public class Math_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(Math.min(Math.min(x, sc.nextInt()-x), Math.min(y, sc.nextInt()-y)));
        sc.close();
    }
}