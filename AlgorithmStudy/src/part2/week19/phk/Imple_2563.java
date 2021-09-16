package part2.week19.phk;

import java.util.Scanner;

public class Imple_2563 {
    public static void main(String[] args) {
        int[][] page = new int[100][100];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    page[j][k]++;
                }
            }
        }
        sc.close();

        int d = 0;
        for (int i = 0; i < page.length; i++) {
            for (int j = 0; j < page[i].length; j++) {
                if(page[i][j] != 0) d++;
            }
        }
        System.out.println(d);
    }
}
