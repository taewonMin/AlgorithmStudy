package part2.week20.mtw;

import java.util.Arrays;
import java.util.Scanner;

// 별찍기 - 10
public class Recursion_2447 {
    static char[][] star;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        star = new char[N][N];
        for(char[] line : star){
            Arrays.fill(line, ' ');
        }

        // drawStar(Math.log(N)/Math.log(3), 0, 0);
        drawStar(N, 0, 0);

        for(char[] line : star){
            System.out.println(line);
        }

        sc.close();
    }

    static void drawStar(int n, int x, int y){
        if(n==1){
            star[x][y] = '*';
            return;
        }
        int m = n/3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==1 && j==1){
                    continue;
                }
                drawStar(m, x+i*m, y+j*m);
            }
        }

    }

    // static void drawStar(double k, int y, int x){
    //     for(int i=y; i<y+3; i++){
    //         for(int j=x; j<x+3; j++){
    //             if(i== y+1 && j==x+1){
    //                 continue;
    //             }
    //             if(k==1){   // 별찍기
    //                 star[i][j] = '*';
    //             }else{
    //                 drawStar(k-1, i*3, j*3);
    //             }
    //         }
    //     }
    // }
}
