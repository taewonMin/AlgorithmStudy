package part2.week15.psw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Search_1260 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m  = sc.nextInt();
		int start = sc.nextInt()-1;
		boolean[][] graph = new boolean[n][n];	

		for (int i = 0; i < m; i++) {
			int point1 = sc.nextInt()-1;
			int point2 = sc.nextInt()-1;
			graph[point1][point2] = true;
			graph[point2][point1] = true;
		}
		
		dfs(graph, start);
		bfs(graph, start);
		
		sc.close();
	}

	
	static void dfs(boolean[][] graph , int start) {
		boolean[] visitied = new boolean[graph.length];
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		visitied[start] = true;
		System.out.print((start+1)+" ");
		
		while (!stack.isEmpty()) {
			int node = stack.peek();
			boolean flag = false;
			
			for (int i = 0; i < graph.length; i++) {
				if(graph[node][i] && !visitied[i]) {
					stack.push(i);
					visitied[i] = true;
					flag = true;
					System.out.print( (i+1)+" ");
					break;
				}
			}
			
			if(!flag) stack.pop();
		}
		
		System.out.println();
	}
	
	
	
	static void bfs(boolean[][] graph, int start) {
		boolean[] visitied = new boolean[graph.length];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		visitied[start] = true;
		
		while (!queue.isEmpty()) {
			int node = queue.poll();
			for (int i = 0; i < graph.length; i++) {
				if( graph[node][i] && !visitied[i]  ) {
					queue.offer(i);
					visitied[i] = true;
				}
			}
			System.out.print(queue.isEmpty() ? ++node : ++node+" " );
		}
		
	}
}
