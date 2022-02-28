package part4.week37.psw;

import java.util.Scanner;
//12844	124
public class DivideConquer_1629 {
    static long C;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong(), B = sc.nextLong();
        C = sc.nextLong();
        System.out.println(dc(A,B));
    }

    private static long dc(long A, long B) {
        if (B==1) return A%C;
        long temp = dc(A, B/2);
        if (B%2 == 1) return (temp*temp%C)*A%C;
        return temp*temp%C;
    }
}