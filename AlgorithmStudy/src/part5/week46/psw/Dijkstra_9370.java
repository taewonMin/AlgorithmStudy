package part5.week46.psw;

import java.util.*;
//302296	2212
public class Dijkstra_9370 {

    static class Node {
        int idx , dist;
        public Node(int idx, int dist) {
            this.idx = idx;
            this.dist = dist;
        }
    }

    static int g,h;
    static List<Node>[] graph;

    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt(), m = sc.nextInt(), t = sc.nextInt();
            int s = sc.nextInt();
            g = sc.nextInt();
            h = sc.nextInt();
            int[] dp = new int[n+1];
            graph = new List[n+1];
            for (int j = 1; j <= n; j++) {
                dp[j] = Integer.MAX_VALUE;
                graph[j] = new ArrayList<>();
            }
            for (int j = 0; j < m; j++) {
                int a = sc.nextInt(), b = sc.nextInt(), d = sc.nextInt();
                graph[a].add(new Node(b,d));
                graph[b].add(new Node(a,d));
            }
            // 입력 및 초기화

            List<Integer> answer = new ArrayList<>();
            for (int j = 0; j < t; j++) {
                int x = sc.nextInt();
                int[] first = dijkstra(s,x,dp.clone());
                h = first[g] > first[h] ? g : h;
                int[] second = dijkstra(h,x,dp.clone());
                if (first[x] == first[h] + second[x]) answer.add(x);
            }

            answer.sort(Integer::compare);

            if (!answer.isEmpty()){
                for (int a:answer) {
                    sb.append(a+" ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);

    }

    private static int[] dijkstra(int s, int x, int[] dp) {
        boolean[] visited = new boolean[dp.length];
        dp[s] = 0;
        PriorityQueue<Node> queue = new PriorityQueue<>((a1,a2) -> {return Integer.compare(a1.dist,a2.dist);});
        queue.add(new Node(s,0));

        while (!queue.isEmpty() && !visited[x]){
            Node poll = queue.poll();
            visited[poll.idx] = true;

            for (Node next : graph[poll.idx]) {
                if (!visited[next.idx] && dp[next.idx] > dp[poll.idx] + next.dist) {
                    queue.add(new Node(next.idx,dp[next.idx]= dp[poll.idx]+ next.dist));
                }
            }
        }

        return dp;
    }

}