package part5.week46.jje;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra_1753 {

    static final int INF = 10000000;
    static ArrayList<Pair> graph[] = null;
    static int[] d = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int k = sc.nextInt();

        d = new int[v + 1];

        for (int i = 1; i <= v; i++) {
            d[i] = INF;
        }

        graph = new ArrayList[v + 1];

        for(int i = 0; i <= v; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            graph[sc.nextInt()].add(new Pair(sc.nextInt(),sc.nextInt()));
        }
        dijkstra(k);

        for (int i = 1; i <= v ; i++) {
            System.out.println(d[i] == INF ? "INF" : d[i]);
        }
    }

    static void dijkstra(int start) {
        d[start] = 0;

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.y - o2.y;
            }
        });

        priorityQueue.offer(new Pair(start, 0));

        while (!priorityQueue.isEmpty()) {
            Pair tempPair = priorityQueue.poll();
            int current = tempPair.x;
            int distance = tempPair.y;
            if(d[current] < distance) continue;
            for (int i = 0; i < graph[current].size(); i++) {
                int next = graph[current].get(i).x;
                int nextDistance = distance + graph[current].get(i).y;
                if (nextDistance < d[next]) {
                    d[next] = nextDistance;
                    priorityQueue.offer(new Pair(next, nextDistance));
                }
            }
        }
    }

}

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
