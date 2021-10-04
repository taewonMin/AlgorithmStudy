package part2.week20.psw;

import java.util.Scanner;

public class Brute_1018 {
    static int answer = 64;
    static char[][] map = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();sc.nextLine();
        map = new char[N][];
        for (int i = 0; i < N; i++) map[i] = sc.nextLine().toCharArray();
        sc.close();

        for (int i = 0; i < N-7; i++) {
            for (int j = 0; j < M-7; j++) {
                answer = Math.min(answer,find(i,j));
            }
        }
        System.out.println(answer);
    }

    private static int find(int i, int j) {
        int cnt = 0;
        char eq = chg(map[i][j]);
        for (int k = i; k < i+8; k++) {
            for (int l = j; l < j+8; l++) {
                if (eq == map[k][l]) cnt++;
                eq = chg(eq);
            }
            eq = chg(eq);
        }
        return Math.min(cnt,64-cnt);
    }

    public static char chg(char ch) {return ch == 'W' ? 'B' : 'W';}
}
