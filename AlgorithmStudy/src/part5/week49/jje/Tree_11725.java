package part5.week49.jje;

import java.net.HttpRetryException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree_11725 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> tree[] = new LinkedList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            tree[i] = new LinkedList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int root = sc.nextInt();
            int node = sc.nextInt();
            tree[root].add(node);
            tree[node].add(root);
        }
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        int[] parent = new int[n + 1];
        visited[1] = true;
        queue.add(1);

        while (!queue.isEmpty()) {
            int parentNum = queue.poll();
            for (int i = 0; i < tree[parentNum].size(); i++) {
                int treeNum = tree[parentNum].get(i);
                if(!visited[treeNum]) {
                    visited[treeNum] = true;
                    parent[treeNum] = parentNum;
                    queue.add(treeNum);
                }
            }
        }

        for (int i = 2; i < parent.length; i++) {
            System.out.println(parent[i]);
        }

    }

}
