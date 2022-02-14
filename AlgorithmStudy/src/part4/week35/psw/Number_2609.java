package part4.week35.psw;

import java.util.Scanner;
// 12900	108
public class Number_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        int answer = gcd(a,b);
        System.out.println(answer + "\n" + (a*b)/answer);
    }
    // 유클리드 호제법
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
