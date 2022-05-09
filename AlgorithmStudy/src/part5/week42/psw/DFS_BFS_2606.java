package part5.week42.psw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS_2606 {
    static boolean[][] nodes;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        nodes = new boolean[cnt+1][cnt+1];
        visited = new boolean[cnt+1];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            nodes[a][b] = true;
            nodes[b][a] = true;
        }
        System.out.println(bfs());
    }

    private static int dfs(){

        return 0;
    }

    private static int bfs() {
        int cnt = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()){
            int i = queue.poll();
            for (int j = 1; j < nodes.length; j++) {
                if (nodes[i][j] && !visited[j]){
                    queue.add(j);
                    visited[j] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
