package part5.week46.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

// 최단경로
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
    public static int[] distance;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        graph = new ArrayList[input[0]];
        for(int i=0; i<input[0]; i++){
            graph[i] = new ArrayList<>();
        }
        distance = new int[input[0]];
        visited = new boolean[input[0]];

        int start = Integer.parseInt(br.readLine())-1;
        for(int i=0; i<input[1]; i++){
            int[] info = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph[info[0]-1].add(new Node(info[1]-1, info[2]));
        }

        dijkstra(start);

        for(int i : distance){
            if(i == Integer.MAX_VALUE){
                bw.write("INF\n");
            }else{
                bw.write(i+"\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void dijkstra(int start){
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>((o1,o2) -> o1.distance - o2.distance);
        pq.offer(new Node(start, 0));

        while(!pq.isEmpty()){
            Node node = pq.poll();
            visited[node.index] = true;

            for(Node next : graph[node.index]){
                if(!visited[next.index] && distance[next.index] > distance[node.index] + next.distance){
                    distance[next.index] = distance[node.index] + next.distance;
                    pq.offer(new Node(next.index, distance[next.index]));
                }
            }
        }
    }
}
