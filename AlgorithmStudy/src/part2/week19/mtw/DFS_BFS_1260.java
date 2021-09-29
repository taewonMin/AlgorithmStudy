package part2.week19.mtw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS_1260 {
    static List<String> dfsList = new ArrayList<>();
    static List<String> bfsList = new ArrayList<>();

    static boolean[][] graph;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();
        graph = new boolean[N][N];
        visited = new boolean[N];
        for(int i=0; i<M; i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(V-1);
        Arrays.fill(visited, false);
        bfs(V-1);

        System.out.println(String.join(" ", dfsList));
        System.out.println(String.join(" ", bfsList));

        sc.close();
    }

    public static void dfs(int node){
        dfsList.add(String.valueOf(node+1));
        visited[node] = true;
        for(int i=0; i<visited.length; i++){
            if(graph[node][i] && visited[i]==false){
                dfs(i);
            }
        }
    }

    public static void bfs(int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);

        while(!queue.isEmpty()){
            int number = queue.poll();
            bfsList.add(String.valueOf(number+1));
            visited[number] = true;

            for(int i=0; i<visited.length; i++){
                if(graph[number][i] && visited[i]==false){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
