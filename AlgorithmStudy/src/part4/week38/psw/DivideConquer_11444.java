package part4.week38.psw;

import java.util.Scanner;
//12892	112
public class DivideConquer_11444 {
    static int p = 1000000007;
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        long[][] a = {{1,1},{1,0}};
        long[][] c = n > 0? pow(a,n-1) : new long[2][2];
        System.out.println(c[0][0]);
    }

    private static long[][] pow(long[][] a, long n) {
        if (n<=1) return a;
        long[][] temp = pow(a,n/2);
        if (n%2==1) return calc(calc(temp,temp),a);
        return calc(temp,temp);
    }

    private static long[][] calc(long[][] a, long[][] b) {
        long n = a.length;
        long[][] c = new long[2][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += (a[i][k]*b[k][j])%p;
                }
                c[i][j] = sum%p;
            }
        }
        return c;
    }
}