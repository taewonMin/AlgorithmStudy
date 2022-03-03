package part4.week37.psw;

import java.util.Scanner;

public class DivideConquer_10830 {
    static int[][] line, pow;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b = sc.nextInt();
        line = new int[n][n];
        pow = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                line[i][j] = sc.nextInt();
                pow[i][j] = line[i][j];
            }
        }
        for (int k = 1; k < b; k++) {
            int[][] temp = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    temp[i][j] = dc(i,j);
                }
            }
            pow=temp;
        }
        System.out.println();
    }

    private static int dc(int i, int j) {
        int sum = 0;
        for (int k = 0; k < line.length; k++) {
            sum += line[i][k]*pow[k][j];
        }
        return sum;
    }
}