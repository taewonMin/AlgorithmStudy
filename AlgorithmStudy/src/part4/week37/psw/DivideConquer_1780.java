package part4.week37.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//	317188	820
public class DivideConquer_1780 {
    static int[][] map;
    static int r = 0 , g = 0, b = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(0,0,n);
        System.out.println(r+"\n"+g+"\n"+b);
    }

    private static void divide(int i, int j, int n) {
        if (conquer(i,j,n)){
            switch (map[i][j]){
                case -1: r++; break;
                case  0: g++; break;
                case  1: b++; break;
            }
            return;
        }

        n/=3;

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                divide(i+(k*n),j+(l*n),n);
            }
        }
    }

    private static boolean conquer(int i, int j, int n) {
        int start = map[i][j];
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                if (map[k+i][l+j] != start) return false;
            }
        }
        return true;
    }

}
