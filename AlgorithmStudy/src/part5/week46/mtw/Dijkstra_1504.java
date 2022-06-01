package part5.week46.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

// 특정한 최단경로
public class Dijkstra_1504 {
    static class Node {
        int index;
        int distance; 
        Node(int index, int distance){
            this.index = index;
            this.distance = distance;
        }
    }
    public static ArrayList<Node>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        graph = new ArrayList[input[0]];
        for(int i=0; i<input[0]; i++){
            graph[i] = new ArrayList<Node>();
        }

        for(int i=0; i<input[1]; i++){
            int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph[info[0]-1].add(new Node(info[1]-1, info[2]));
            graph[info[1]-1].add(new Node(info[0]-1, info[2]));
        }

        int[] condition = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] start = dijkstra(0);
        int[] v1 = dijkstra(condition[0]-1);
        int[] v2 = dijkstra(condition[1]-1);
        int distance = Math.min(checkDistance(start[condition[0]-1], v1[condition[1]-1], v2[input[0]-1]), checkDistance(start[condition[1]-1], v2[condition[0]-1], v1[input[0]-1]));
        System.out.println(distance == Integer.MAX_VALUE ? -1 : distance);

        br.close();
    }

    public static int[] dijkstra(int start){
        boolean[] visited = new boolean[graph.length];
        int[] dp = new int[graph.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.distance - o2.distance);
        pq.offer(new Node(start, 0));

        while(!pq.isEmpty()){
            Node node = pq.poll();
            visited[node.index] = true;

            for(Node next : graph[node.index]){
                if(!visited[next.index] && dp[next.index] > dp[node.index] + next.distance){
                    dp[next.index] = dp[node.index] + next.distance;
                    pq.offer(new Node(next.index, dp[next.index]));
                }
            }
        }

        return dp;
    }

    public static int checkDistance(int d1, int d2, int d3){
        if(d1 == Integer.MAX_VALUE || d2 == Integer.MAX_VALUE || d3 == Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else{
            return d1 + d2 + d3;
        }
    }
}
