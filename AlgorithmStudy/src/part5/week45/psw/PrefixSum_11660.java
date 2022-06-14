package part5.week45.psw;

import java.util.Scanner;

public class PrefixSum_11660 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] prefixSum = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[i][j] = prefixSum[i-1][j] + prefixSum[i][j-1] - prefixSum[i-1][j-1] + sc.nextInt();
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < m; i++) {
            int x1 = sc.nextInt() , y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
            sb.append(prefixSum[x2][y2] - prefixSum[x2][y1-1] - prefixSum[x1-1][y2] + prefixSum[x1-1][y1-1]+"\n");
        }

        System.out.println(sb);
    }
}
/*
4 3
1 2 3 2
2 3 4 1
3 4 5 3
4 5 6 7
2 2 3 4
3 4 3 4
1 1 4 4

27
6
64
 */