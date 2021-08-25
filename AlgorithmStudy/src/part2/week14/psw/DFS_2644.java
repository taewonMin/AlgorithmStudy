package part2.week14.psw;

import java.util.Scanner;

public class DFS_2644 {
	static boolean[][] graph;
	static int answer = -1;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		graph = new boolean[n][n];
		
		int one = sc.nextInt() -1;
		int two = sc.nextInt() -1;
		int m = sc.nextInt();
		
		boolean[] visited = new boolean[n];

		for (int i = 0; i < m; i++) {
			int parent = sc.nextInt() - 1;
			int child = sc.nextInt() - 1;
			graph[parent][child] = true;
			graph[child][parent] = true;
		}
		// --------------------- 초기화 작업
		
		dfs(visited, one, two, 0);
		System.out.println(answer);
		sc.close();
	}
	
	static void dfs(boolean[] visited , int start , int target ,int cnt) {
		visited[start] = true;
		for (int i = 0; i < visited.length; i++) {
			if( graph[start][i] && !visited[i] ) {
				if( i == target) {
					answer = cnt+1;
					return;
				}
				dfs(visited, i, target, cnt+1);
			}
		}
	}
}

