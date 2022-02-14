package part3.week25.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackTracking_2580{
    public static int[][] sudoku = new int[9][9];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i<9; i++){
            String[] input = br.readLine().split(" ");
            for(int j=0; j<input.length; j++){
                sudoku[i][j] = Integer.parseInt(input[j]);
            }
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<sudoku[i].length; j++){
                bw.write(sudoku[i][j] + " ");
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void backTracking(int x, int y){
        if(sudoku[y][x] != 0) return;

        
        // 가로 탐색
        for(int i=0; i<9; i++){
            if(i != x && sudoku[y][i] == 0){
                 
            }
        }

        // 세로 탐색
        for(int i=0; i<9; i++){
            if(i != y && sudoku[i][x] == 0){
                 
            }
        }

        // 정사각형 탐색
//        for(){
//
//        }
    }
}