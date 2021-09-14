package part2.week18.psw;

import java.util.*;

public class Tree_9372 {
    static boolean[][] tree = null;
    static boolean[] visited = null;
    static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final byte T = sc.nextByte();
        for (int i = 0; i < T; i++) {
            answer = 0;
            final short N = sc.nextShort();
            final short M = sc.nextShort();

            tree = new boolean[N][N];
            visited = new boolean[N];
            // 끝노드의 개수
            for (int j = 0; j < M; j++) tree[sc.nextInt()-1][sc.nextInt()-1] = true;


            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if(tree[j][k] && !visited[j]){
                        //bfs(j);
                        dfs(j);
                    }
                }
            }
            System.out.println(answer-1);
        }

        sc.close();
    }

    private static void bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        while (!queue.isEmpty()){
            answer++;
            int parent = queue.poll();
            for (int i = 0; i < tree.length; i++) {
                if (tree[parent][i] && !visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    private static void dfs(int node){
        answer++;
        visited[node] = true;
        for (int i = 0; i < tree.length; i++) {
            if(tree[node][i] && ! visited[i]) dfs(i);
        }
    }

}
