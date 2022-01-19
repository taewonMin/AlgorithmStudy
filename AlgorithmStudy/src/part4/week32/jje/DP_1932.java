package part4.week32.jje;

import java.util.Scanner;

public class DP_1932 {
    static int[][] org = null;
    static int[][] index = null;
    static int m = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();

        org = new int[m][m];
        index = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                org[i][j] = sc.nextInt();
                if(i == j){
                    break;
                }
            }
        }

        index[0][0] = org[0][0];
        int result = 0;
        int a = 0;
        int b = 0;
        for (int i = 1; i < m; i++) {
            a = recursive(m - 1, i - 1);
            b = recursive(m - 1, i);
            if(a < b) {
                result = b;
            } else {
                result = a;
            }
        }

        System.out.println(result);

        sc.close();
    }

    static int recursive(int n, int n2) {

        if(index[n][n2] == 0){
            if (n2 == 0){
                index[n][n2] = recursive(n - 1, n2) + org[n][n2];
            } else if (org[n - 1][n2] == 0){
                index[n][n2] = recursive(n - 1, n2 - 1) + org[n][n2];
            } else {
                index[n][1] = Math.min(recursive(n - 1, n2), recursive(n - 1, n2 - 1)) + org[n][n2];
            }
        }
        return index[n][n2];
    }
}
