package part4.week35.psw;

import java.math.BigDecimal;
import java.util.Scanner;
//47972	376
public class Combination_11051 {
    static int div = 10007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        BigDecimal answer = (facto(n).divide(facto(n-k).multiply(facto(k)))).remainder(new BigDecimal(div));
        System.out.println(answer);
    }

    private static BigDecimal facto(int n) {
        if (n==0) return new BigDecimal(1);
        return facto(n-1).multiply(new BigDecimal(n));
    }
}
