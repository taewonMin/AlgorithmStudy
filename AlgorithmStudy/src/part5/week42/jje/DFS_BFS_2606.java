package part5.week42.jje;

import java.util.Scanner;

public class DFS_BFS_2606 {
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int pair = sc.nextInt();

        int com[][] = new int[num + 1][num + 1];
        boolean check[] = new boolean[num + 1];

        for (int i = 0; i < pair; i++) {
            int con1 = sc.nextInt();
            int con2 = sc.nextInt();

            com[con1][con2] = 1;
            com[con2][con1] = 1;
        }
        dfs(com, check, 1);

        System.out.println();
    }

    static void dfs(int[][] com, boolean[] check, int index) {
        if (check[index] == true) return;

        check[index] = true;
        cnt++;

        for (int i = 0; i < com[index].length; i++) {
            if(com[index][i] == 1 & check[i]) dfs(com, check, i);
        }
    }
}
