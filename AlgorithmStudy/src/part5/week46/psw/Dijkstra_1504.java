package part5.week46.psw;

import java.util.*;

public class Dijkstra_1504 {

    static class Node{
        int idx , dist;
        public Node(int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }

    static List<Node>[] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), e = sc.nextInt();
        int[] dp = new int[n+1];
        graph = new List[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt(), v2 = sc.nextInt(), dist = sc.nextInt();
            graph[v1].add(new Node(v2,dist));
            graph[v2].add(new Node(v1,dist));
        }

        int v1 = sc.nextInt(), v2 = sc.nextInt();


    }

    private static int dijkstra(int start, int end, int[] dp) {
        boolean[] visited = new boolean[dp.length];
        dp[start] = 0;
        visited[start] = true;

        PriorityQueue<Node> queue = new PriorityQueue<Node>((a1,a2) -> { return Integer.compare(a1.dist,a2.dist);});
        queue.offer(new Node(start,0));

        while (!queue.isEmpty()){
            Node item = queue.poll();

            for (Node next : graph[item.idx]){
                int val = dp[item.idx] + next.dist;
                if (!visited[next.idx] && dp[next.idx] > val){
                    queue.offer(new Node(next.idx, dp[next.idx] = val));
                }
            }

            visited[item.idx] = true;
        }

        return dp[end];
    }
}
/*
4 6
1 2 3
2 3 3
3 4 1
1 3 5
2 4 5
1 4 4
2 3
 */