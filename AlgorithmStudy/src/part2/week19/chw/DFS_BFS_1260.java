package part2.week19.chw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS_1260 {
	static boolean[] visited;
	static int[][] checkArr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int V = sc.nextInt();
        checkArr = new int[N+1][N+1];
        
        for(int i = 0; i < M; i++) {
        	int firNum = sc.nextInt();
        	int secNum = sc.nextInt();
        	checkArr[firNum][secNum] = 1;
        	checkArr[secNum][firNum] = 1;
        }
        sc.close();
        
        visited = new boolean[N+1];
        dfs(V);
        System.out.println();
        visited = new boolean[N+1];
        bfs(V);
    }
    static void dfs(int v) {
    	visited[v] = true;
    	System.out.print(v + " ");
    	for(int i = 0; i < checkArr[v].length; i++) {
    		if(checkArr[v][i] == 1 && !visited[i]) {
    			dfs(i);
    		}
    	}
    }
    static void bfs(int v) {
    	Queue<Integer> queue = new LinkedList<Integer>();
    	visited[v] = true;
    	queue.offer(v);
    	while(!queue.isEmpty()) {
    		int a = queue.peek();
    		System.out.print(a +" ");
    		queue.remove();
    		for(int i = 0; i < checkArr[a].length; i++) {
    			if(checkArr[a][i] == 1 && !visited[i]) {
    				visited[i] = true;
    				queue.offer(i);
    			}
    		}
    	}
    }
}
