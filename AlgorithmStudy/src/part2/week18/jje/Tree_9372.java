package part2.week18.jje;

import java.util.Scanner;

public class Tree_9372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //링형..?

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                sc.nextInt();
                sc.nextInt();
            }
            System.out.println(n-1);
        }
        sc.close();
    }
}
