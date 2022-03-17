package part4.week38.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideConquer_2740 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String a = br.readLine();
        int[][] arrA = makeArr(a);
        String b = br.readLine();
        int[][] arrB = makeArr(b);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrA.length ; i++) {
            for (int j = 0; j < arrB[0].length; j++) {
                int result = 0;
                for (int k = 0; k < arrA[0].length; k++) {
                    result += arrA[i][k] * arrB[k][j];
                }
                sb.append(result+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }

    static int[][] makeArr (String rowCol) throws IOException {
        int n = Integer.parseInt(rowCol.split(" ")[0]);
        int m = Integer.parseInt(rowCol.split(" ")[1]);
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(line.split(" ")[j]);
            }
        }
        return arr;
    }
}
