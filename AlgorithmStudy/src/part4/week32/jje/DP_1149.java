package part4.week32.jje;

import java.util.Scanner;

public class DP_1149 {
    static int[][] org = null;
    static int[][] index = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        org = new int[n][3];
        index = new int[n][3];
        for (int i = 0; i < org.length; i++) {
            for (int j = 0; j < 3; j++) {
                org[i][j] = sc.nextInt();
            }
        }
        index[0][0] = org[0][0];
        index[0][1] = org[0][1];
        index[0][2] = org[0][2];

        System.out.println(Math.min(recursive(n - 1, 0), Math.min(recursive(n - 1, 1), recursive(n - 1, 2))));
        sc.close();
    }

    static int recursive(int n, int n2){
        if(index[n][n2] == 0){
            if (n2 == 0) {
                index[n][0] = Math.min(recursive(n - 1, 1), recursive(n - 1, 2)) + org[n][0];
            } else if (n2 == 1) {
                index[n][1] = Math.min(recursive(n - 1, 0), recursive(n - 1, 2)) + org[n][1];
            } else if (n2 == 2) {
                index[n][2] = Math.min(recursive(n - 1, 0), recursive(n - 1, 1)) + org[n][2];
            }
        }

        return index[n][n2];
    }
}
