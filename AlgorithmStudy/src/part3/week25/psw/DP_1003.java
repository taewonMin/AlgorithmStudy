package part3.week25.psw;

import java.io.IOException;
import java.util.Scanner;

public class DP_1003 {
    static int one;
    static int two;
    static int[][] saved = new int[2][41];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int cnt = sc.nextInt();
            fibonacci(cnt);
            System.out.println(one+" "+two);
            one = 0;
            two = 0;
        }

    }

    static int fibonacci(int n){
        if (n == 0) {
            one++;
            saved[0][n] = 0;
            saved[1][n] = 1;
            return 0;
        } else if (n == 1) {
            saved[0][n] = 1;
            saved[1][n] = 1;
            return 1;
        } else {



            return fibonacci(n-1) + fibonacci(n-2) ;
        }
    }
}
/*



 */