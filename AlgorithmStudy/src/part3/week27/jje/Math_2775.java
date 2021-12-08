package part3.week27.jje;

import java.util.Scanner;

public class Math_2775 {

    static int[][] arr = new int[15][15];

    public static void main(String[] args) {
        /*
        1 2 3 4
        1 3 6 10
        1 4 10 20
        1 5 15 35
         */

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int k = 0;
        int n = 0;

        for (int i = 0; i < 15; i++) {
            arr[0][i] = i + 1;
            arr[i][0] = 1;
        }

        for (int i = 0; i < t; i++) {
            k = sc.nextInt();
            n = sc.nextInt()-1;
            if (k > 0 && n > 0) {
                apartment(k, n);
            }
            System.out.println(arr[k][n]);
        }
    }

    static void apartment(int k, int n){
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = arr[i - 1][j]+arr[i][j-1];
            }
        }
    }
}
