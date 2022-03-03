package part4.week37.psw;

import java.util.Scanner;
//	12924	116
public class DivideConquer_10830 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long b = sc.nextLong();
        int[][] line = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                line[i][j] = sc.nextInt()%1000;
            }
        }
        int[][] map = dc(line,b);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(map[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static int[][] dc(int[][] line, long b) {
        if (b==1) return line;
        int[][] temp = dc(line,b/2);
        if (b%2==1) return pow(pow(temp,temp),line);
        return pow(temp,temp);
    }

    private static int[][] pow(int[][] a, int[][] b) {
        int n = a.length;
        int[][] c = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += (a[i][k]*b[k][j])%1000;
                }
                c[i][j] = sum%1000;
            }
        }

        return c;
    }
}