package part2.week15.chw;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Search_1260 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int v = sc.nextInt();

		boolean visited[] = new boolean[n + 1];

		int[][] adjArray = new int[n+1][n+1];

		for(int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();

			adjArray[v1][v2] = 1;
			adjArray[v2][v1] = 1;
		}
		sc.close();
		dfs(v, adjArray, visited, true);
		Arrays.fill(visited, false);
		bfs(v, adjArray, visited);
	}

	public static void dfs(int v, int[][] adjArray, boolean[] visited, boolean flag) {
		int l = adjArray.length-1;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(v);
		visited[v] = true;
		System.out.print(v + " ");

		while(!stack.isEmpty()) {
			int w = stack.peek();
			flag = false; 

			for(int i = 1; i <= l; i++) {
				if(adjArray[w][i] == 1 && !visited[i]) {
					stack.push(i);
					System.out.print(i + " ");
					visited[i] = true;
					flag = true;
					break;
				}
			}

			if(!flag) {
				stack.pop();
			}
		}
		System.out.println();
	}
	public static void bfs(int v, int[][] adjArray, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<>();
		int n = adjArray.length - 1;

		queue.add(v);
		visited[v] = true;

		while (!queue.isEmpty()) {
			v = queue.poll();
			System.out.print(v + " ");

			for (int i = 1; i <= n; i++) {
				if (adjArray[v][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
}