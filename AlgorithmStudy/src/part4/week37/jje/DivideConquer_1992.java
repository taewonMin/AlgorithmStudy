package part4.week37.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivideConquer_1992 {

    static int[][] arr = null;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        recursive(rowIndex, colIndex, n, n);
        System.out.println(sb);

    }
    static void recursive (int rowIndex, int colIndex, int row, int col){

        int first = arr[rowIndex][colIndex];
        int newRow = rowIndex + (row - rowIndex) / 2;
        int newCol = colIndex + (col - colIndex) / 2;

        Loop1 :
        for (int i = rowIndex; i < row; i++) {
            for (int j = colIndex; j < col; j++) {
                if (arr[i][j] != first) {
                    sb.append("(");
                    recursive(rowIndex, colIndex, newRow, newCol); //0,0 / 4,4
                    recursive(rowIndex, newCol, newRow, col); // 0,4 / 4,8
                    recursive(newRow, colIndex, row, newCol); // 4,0 / 8,4
                    recursive(newRow, newCol, row, col); // 4,4 / 8,8
                    sb.append(")");
                    return;
                }
            }
        }
        sb.append(first);
    }
}