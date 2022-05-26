package part5.week45.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class PrefixSum_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] param = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = param[0], m = param[1];

        int[][] numbers = new int[n+m][];
        for (int i = 0; i < n+m; i++) {
            numbers[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int[][][] prefixSum = new int[2][n+1][n+1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                prefixSum[0][i][j] = prefixSum[0][i][j-1] + numbers[i-1][j-1];
                prefixSum[1][j][i] = prefixSum[1][j][i-1] + numbers[j-1][i-1];
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < m; i++) {
            int x1 = numbers[n+i][0] , y1 = numbers[n+i][1], x2 = numbers[n+i][2], y2 = numbers[n+i][3];
            sb.append(       "\n");
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