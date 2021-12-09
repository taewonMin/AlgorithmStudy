package part3.week27.psw;

import java.util.Scanner;

public class Math_2775 {
    static int[][] apart = new int[15][15];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < apart[0].length; i++) {
            apart[0][i]=i;
        }

        String str = "";
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(findNum(k,n));
        }



        System.out.println(str);
    }

    private static int findNum(int k, int n) {
        for (int i = 1; i <= n; i++) {
            if (apart[k-1][i] == 0) findNum(k-1,i);
            apart[k][n] += apart[k-1][i];
        }
        return apart[k][n];
    }

    private static int[][] setAll(){
        int[][] APT = new int[15][15];

        for(int i = 0; i < 15; i++) {
            APT[i][1] = 1;	// i층 1호
            APT[0][i] = i;	// 0층 i호
        }

        for(int i = 1; i < 15; i ++) {	// 1층부터 14층까지

            for(int j = 2; j < 15; j++) {	// 2호부터 14호까지
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }
        return APT;
    }
}
