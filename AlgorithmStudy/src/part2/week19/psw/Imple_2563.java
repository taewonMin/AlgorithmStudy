package part2.week19.psw;

import java.util.Scanner;

public class Imple_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] map = new boolean[101][101];
        int a = 0;

        while (n-- > 0){
            int x = sc.nextInt(), y = sc.nextInt();
            for (int j = y; j < y+10; j++) {
                for (int k = x; k < x+10; k++) {
                    if (!map[j][k]) a++;
                    map[j][k] = true;
                }
            }
        }

        System.out.println(a);
    }
}
