package part5.week49.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 트리의 부모 찾기
public class Tree_11725 {
    public static ArrayList<Integer>[] tree;
    public static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        tree = new ArrayList[N+1];
        parent = new int[N+1];
        for(int i=1; i<tree.length; i++){
            tree[i] = new ArrayList<>();
        }

        for(int i=0; i<N-1; i++){
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            tree[input[0]].add(input[1]);
            tree[input[1]].add(input[0]);
        }

        bfs(1);
        for(int i=2; i<parent.length; i++){
            System.out.println(parent[i]);
        }

        br.close();
    }

    public static void bfs(int root){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int child : tree[node]){
                if(parent[node] != child){
                    parent[child] = node;
                    queue.offer(child);
                }
            }
        }
    }
}
