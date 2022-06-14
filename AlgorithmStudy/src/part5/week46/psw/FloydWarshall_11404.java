package part5.week46.psw;

import java.util.Scanner;

public class FloydWarshall_11404 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        long[][] fw = new long[n+1][n+1];
        long inf = 100000*100+1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                fw[i][j] = i==j ? 0 : inf;
            }
        }

        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
            fw[a][b] = Math.min(fw[a][b],c);
        }

        // 경유지
        for (int k = 1; k <= n; k++) {
            //출발지
            for (int i = 1; i <= n; i++) {
                if (i==k) continue;
                //도착지
                for (int j = 1; j <= n; j++) {
                    if (i==j || j==k) continue;
                    long start = fw[i][k], end = fw[k][j];
                    fw[i][j] = Math.min(fw[i][j], start + end);
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sb.append((fw[i][j] == inf ? 0 : fw[i][j]) +" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
/*
2,1

2,1 + 1,1
 */