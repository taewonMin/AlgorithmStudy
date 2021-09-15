package part2.week18.phk;

import java.util.Scanner;

public class Imple_10994 {
    public static void main(String[] args) {
        /**
         * n=1 1
         * n=2 5 = 1+4
         * n=3 9 = 5+4 
         * ...
         * 4(n-1)+1 = 4n-3
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        char[][] start = {{'*'}};
        char[][] star = new char[4*n -3][4*n -3];
        int cnt = 1;    
        while(cnt == n){
            star = draw(start);
        }
        
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                System.out.print(star[i][j] == star[0][0] ? ' ' : star[i][j]);
            }
        }
        
    }
    
    static char[][] draw(char[][] star){
        char[][] n_star = new char[star.length + 4][star.length + 4];
        
        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                n_star[i+2][j+2] = star[i][j];
            }
        }

        for(int i = 0; i < n_star.length; i++){ 
            n_star[0][i] = star[0][0];
            n_star[i][0] = star[0][0];
            n_star[n_star.length-1][i] = star[0][0];
            n_star[i][n_star.length-1] = star[0][0];
        }

        return n_star;
    }
}
