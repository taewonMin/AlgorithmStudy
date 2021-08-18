package part2.week14.psw;

import java.util.Scanner;
import java.util.Stack;

public class DFS_2644 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int one = sc.nextInt()-1;
		int two = sc.nextInt()-1;
		int m = sc.nextInt();
		
		boolean[] visited = new boolean[n];
		boolean[][] graph = new boolean[n][n];
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			graph[x][y] = true;
		}
		
		// --------------------- 초기화 작업
		

		Stack<Integer> stack = new Stack<>();
		stack.add(one);
		visited[one] = true;
		
		int cnt = 0;
		boolean isFind = false;
		
		while(!stack.isEmpty()) {
			int nodeIdx = stack.pop();
			
			if(nodeIdx == two) {
				System.out.println(cnt);
				isFind = true;
				break;
			}
			
			for (int i = 0; i < n; i++) {
				if( graph[nodeIdx][i] && !visited[i] ) {
					stack.add(i);
					visited[i] = true;
					cnt++;
				}
			}
		}
		
		if(!isFind) System.out.println(-1);
		sc.close();
	}
}

