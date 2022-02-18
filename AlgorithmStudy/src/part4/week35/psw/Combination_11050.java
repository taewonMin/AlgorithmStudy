package part4.week35.psw;

import java.util.Scanner;

public class Combination_11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int answer = facto(n)/(facto(n-k)*facto(k));
        // nCk = n!/(n-k)!k!
        System.out.println(answer);
    }

    private static int facto(int n) {
        if (n==0) return 1;
        return n*facto(n-1);
    }
}
