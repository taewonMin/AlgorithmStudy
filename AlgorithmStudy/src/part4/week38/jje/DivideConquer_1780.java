package part4.week38.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DivideConquer_1780 {

    static int[][] arr = null;
    static int[] resultArr = new int[3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n][n];
        int rowIndex = 0;
        int colIndex = 0;
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(line.split(" ")[j]);
            }
        }
        recursive(rowIndex, colIndex, n);
        Arrays.stream(resultArr).asLongStream().forEach(e -> System.out.print(e + " "));
    }

    static void recursive (int rowIndex, int colIndex, int n) {
        if (check(rowIndex, colIndex, n)) {
            if (arr[rowIndex][colIndex] == -1) resultArr[0]++;
            else if (arr[rowIndex][colIndex] == 0) resultArr[1]++;
            else  resultArr[2]++;
            return;
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int length = n / 3;
                    recursive(rowIndex + i * length, colIndex + j * length, length);
                }
            }
        }
    }

    static boolean check (int rowIndex, int colIndex, int n) {

        int firstNum = arr[rowIndex][colIndex];

        for (int i = rowIndex; i < rowIndex + n; i++) {
            for (int j = colIndex; j < colIndex + n; j++) {
                if(firstNum != arr[i][j]) return false;
            }
        }
        return true;
    }
}

