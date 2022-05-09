package part5.week42.psw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_DFS_1707 {
    static boolean[][] nodes;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int v = sc.nextInt(), e = sc.nextInt();
            nodes = new boolean[v+1][v+1];
            visited = new boolean[v+1];
            for (int j = 0; j < e; j++) {
                int a = sc.nextInt(), b = sc.nextInt();
                nodes[a][b] = true;
                nodes[b][a] = true;
            }
            boolean flag = true;
            for (int j = 1; j < nodes.length; j++) {
                for (int l = 1; l < nodes.length; l++) {
                    if (nodes[j][l] && !visited[j]){
                        flag = bfs(j);
                    }
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }

    private static boolean bfs(int i) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);

        while (!queue.isEmpty()){

        }

        return true;
    }

}
