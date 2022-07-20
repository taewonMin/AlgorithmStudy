package part5.week50.jje;

import java.util.LinkedList;
import java.util.Scanner;

public class Tree_1967 {
    static int index = 0;
    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Edge> tree[] = new LinkedList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            tree[i] = new LinkedList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int root = sc.nextInt();
            int node = sc.nextInt();
            int length = sc.nextInt();
            tree[root].add(new Edge(node, length));
            tree[node].add(new Edge(root, length));
        }

        boolean[] visited = new boolean[n + 1];
        dfs(1, 0, visited, tree);
        visited = new boolean[n + 1];
        dfs(index, 0, visited, tree);
        System.out.println(max);
    }

    public static void dfs(int node, int weight, boolean[] visited, LinkedList<Edge> tree[]) {
        visited[node] = true;

        if (weight > max) {
            max = weight;
            index = node;
        }

        for (Edge next : tree[node]) {
            if (!visited[next.number])
                dfs(next.number, weight + next.weight, visited, tree);
        }
    }

    static class Edge {
        int number, weight;

        Edge(int n, int w) {
            number = n;
            weight = w;
        }
    }

}