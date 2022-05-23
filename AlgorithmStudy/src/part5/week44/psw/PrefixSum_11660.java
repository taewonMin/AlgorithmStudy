package part5.week44.psw;

import java.io.IOException;
import java.util.Scanner;
/*
4 3
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
2 2 3 4
3 4 3 4
1 1 4 4

27
6
64
 */
public class PrefixSum_11660 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m = sc.nextInt();
        int[][] prefixSum = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < m; i++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        }
        System.out.println(sb);
    }
}
