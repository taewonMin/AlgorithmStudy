package part5.week46.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

// 미확인 도착지
public class Dijkstra_9370 {
    static class Node{
        int index;
        int distance;
        Node(int index, int distance){
            this.index = index;
            this.distance = distance;
        }
    }

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static ArrayList<Node>[] graph;
    public static void main(String[] args) throws IOException {
        soution2();

        br.close();
        bw.flush();
        bw.close();
    }

    // 다익스트라 3번 사용
    public static void solution1() throws IOException{
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] conditions = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph = new ArrayList[input[0]];
            for(int j=0; j<input[0]; j++){
                graph[j] = new ArrayList<Node>();
            }
            for(int j=0; j<input[1]; j++){
                int[] road = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                graph[road[0]-1].add(new Node(road[1]-1, road[2]));
                graph[road[1]-1].add(new Node(road[0]-1, road[2]));
            }

            int s = conditions[0]-1;
            int g = conditions[1]-1;
            int h = conditions[2]-1;
            int[] dpS = dijkstra(s);
            int[] dpG = dijkstra(g);
            int[] dpH = dijkstra(h);

            ArrayList<String> result = new ArrayList<>();
            for(int j=0; j<input[2]; j++){
                int target = Integer.parseInt(br.readLine())-1;
                int minDt = Math.min(getDistance(dpS[g], dpG[h], dpH[target]), getDistance(dpS[h], dpH[g], dpG[target]));
                if(minDt != Integer.MAX_VALUE && dpS[target] == minDt){
                    result.add(String.valueOf(target+1));
                }
            }
            result.sort((o1, o2) -> Integer.parseInt(o1) - Integer.parseInt(o2));
            bw.write(String.join(" ", result)+"\n");
        }
    }

    // 다익스트라 1번
    public static void soution2() throws IOException{
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] conditions = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int s = conditions[0]-1;
            int g = conditions[1]-1;
            int h = conditions[2]-1;

            graph = new ArrayList[input[0]];
            for(int j=0; j<input[0]; j++){
                graph[j] = new ArrayList<Node>();
            }

            // 필수도로: 가중치*2-1 , 나머지도로: 가중치*2
            for(int j=0; j<input[1]; j++){
                int[] road = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int a = road[0]-1;
                int b = road[1]-1;
                int d = (a==g && b==h) || (a==h && b==g) ? road[2]*2 - 1 : road[2]*2;
                graph[a].add(new Node(b, d));
                graph[b].add(new Node(a, d));
            }

            int[] dp = dijkstra(s);

            ArrayList<String> result = new ArrayList<>();
            for(int j=0; j<input[2]; j++){
                int target = Integer.parseInt(br.readLine())-1;
                if(dp[target] != Integer.MAX_VALUE && dp[target]%2==1){
                    result.add(String.valueOf(target+1));
                }
            }
            result.sort((o1, o2) -> Integer.parseInt(o1) - Integer.parseInt(o2));
            bw.write(String.join(" ", result)+"\n");
        }
    }

    public static int[] dijkstra(int start){
        int[] dp = new int[graph.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(((o1, o2) -> o1.distance - o2.distance));
        pq.offer(new Node(start, 0));

        while(!pq.isEmpty()){
            Node node = pq.poll();
            
            for(Node next : graph[node.index]){
                if(dp[next.index] > dp[node.index] + next.distance){
                    dp[next.index] = dp[node.index] + next.distance;
                    pq.offer(new Node(next.index, dp[next.index]));
                }
            }
        }

        return dp;
    }

    public static int getDistance(int dt1, int dt2, int dt3){
        if(dt1 == Integer.MAX_VALUE || dt2 == Integer.MAX_VALUE || dt3 == Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else{
            return dt1 + dt2 + dt3;
        }
    }
}
