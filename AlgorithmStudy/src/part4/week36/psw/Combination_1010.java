package part4.week36.psw;

import java.math.BigDecimal;
import java.util.Scanner;
//25088	276
public class Combination_1010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            int temp = Math.min(n,k);
            n = Math.max(n,k);
            k = temp;
            BigDecimal answer = facto(n).divide(facto(n-k).multiply(facto(k)));
            System.out.println(answer);
        }
    }

    private static BigDecimal facto(int n) {
        if (n==0) return new BigDecimal(1);
        return facto(n-1).multiply(new BigDecimal(n));
    }
}
