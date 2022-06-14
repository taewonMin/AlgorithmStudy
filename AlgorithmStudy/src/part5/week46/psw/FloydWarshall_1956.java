package part5.week46.psw;

import java.util.Scanner;

public class FloydWarshall_1956 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(), e = sc.nextInt();
        int[][] fw = new int[v+1][v+1];
        int inf = Integer.MAX_VALUE;

        for (int i = 1; i <= v; i++) {
            for (int j = 1; j <= v; j++) {
                if (i!=j) fw[i][j] = inf;
            }
        }

        for (int i = 0; i < e; i++) {
            fw[sc.nextInt()][sc.nextInt()] = sc.nextInt();
        }

        int a = inf;
        for (int k = 1; k <= v; k++) {
            for (int i = 1; i <= v; i++) {
                for (int j = 1; j <= v; j++) {
                    if (i==j) continue;
                    fw[i][j] = Math.min(fw[i][j],fw[i][k]+fw[k][j]);
                    a = Math.min(a,fw[i][j]+fw[j][i]);
                }
            }
        }
        System.out.print(a == inf ? -1 : a);
    }
}