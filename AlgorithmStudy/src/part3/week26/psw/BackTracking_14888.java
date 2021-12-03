package part3.week26.psw;

import java.util.Scanner;

public class BackTracking_14888 {
    static int[][] map = new int[9][9];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int[] line : map) {
            for (int i = 0; i < line.length; i++) {
                line[i] = sc.nextInt();
            }
        }
        
        sudoku(0,0);
            
        sc.close();
    }

    private static void sudoku(int i, int j) {
        if (j == 9){
            sudoku(i+1,0);
            return;
        }

        if (i == 9){
            StringBuffer sb = new StringBuffer();
            for (int[] t: map) {
                for (int u: t) {
                    sb.append(u+" ");
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
            System.exit(0);
        }

        if (map[i][j] == 0){
            for (int k = 1; k <= 9 ; k++) {
                if (promising(i,j,k)){
                    map[i][j] = k;
                    sudoku(i,j+1);
                }
            }
            map[i][j] = 0;
            return;
        }
        sudoku(i,j+1);
    }

    static boolean promising(int i, int j,int target){
        for (int k = 0; k < 9; k++) {
            if (map[i][k] == target || map[k][j] == target){
                return false;
            }
        }

        return sectionChk(i-(i%3),j-(j%3),target);
    }

    private static boolean sectionChk(int x, int y, int target) {
        for (int i = x; i < 3; i++) {
            for (int j = y; j < 3; j++) {
                if (map[i][j] == target) return false;
            }
        }
        return true;
    }
}
