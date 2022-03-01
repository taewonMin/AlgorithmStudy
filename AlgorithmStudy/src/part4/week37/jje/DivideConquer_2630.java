package part4.week37.jje;

import java.util.Scanner;

public class DivideConquer_2630 {

    static int[][] arr = null;
    static int white = 0;
    static int black = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n][n];
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        recursive(rowIndex, colIndex, n, n);
        System.out.println(white + "\n" + black);

    }
    static void recursive (int rowIndex, int colIndex, int row, int col){

        int first = arr[rowIndex][colIndex];
        int newRow = rowIndex + (row - rowIndex) / 2;
        int newCol = colIndex + (col - colIndex) / 2;

        Loop1 :
        for (int i = rowIndex; i < row; i++) {
            for (int j = colIndex; j < col; j++) {
                if (arr[i][j] != first) {
                    recursive(rowIndex, colIndex, newRow, newCol); //0,0 / 4,4
                    recursive(rowIndex, newCol, newRow, col); // 0,4 / 4,8
                    recursive(newRow, colIndex, row, newCol); // 4,0 / 8,4
                    recursive(newRow, newCol, row, col); // 4,4 / 8,8
                    return;
                }
            }
        }
        if(first == 0 ) {
            white++;
        } else {
            black++;
        }
    }
}
