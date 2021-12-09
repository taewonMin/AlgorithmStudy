package part3.week27.psw;

import java.util.Scanner;

public class Backtracking_14889 {
    static int[][] map = null;
    static int[] visited = null; // 중복되지 않은 n/2 개의 수열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new int[n][n];
        visited = new int[n] ;
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) map[i][j] = sc.nextInt();

        sc.close();
    }
}
