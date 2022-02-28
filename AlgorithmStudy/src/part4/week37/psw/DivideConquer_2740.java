package part4.week37.psw;

import java.util.Scanner;

//28812	300
public class DivideConquer_2740 {
    static int[][] A, B, C;
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        B = new int[sc.nextInt()][sc.nextInt()];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        C = new int[A.length][B[0].length];

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                C[i][j] = dc(i,j);
                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static int dc(int i, int j) {
        int sum = 0;
        for (int k = 0; k < A[0].length; k++) {
            sum += A[i][k]*B[k][j];
        }
        sb.append(sum);
        return sum;
    }
}
/*
1 2 2    -1 -2 0
3 4 3     0 0 3
5 6 4     2 2 2
 */