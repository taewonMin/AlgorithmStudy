package part2.week14.chw;

import java.util.Scanner;
import java.util.Stack;

public class DFS_2644 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); 
		int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int m = sc.nextInt(); 

		boolean visited[] = new boolean[n + 1];

		int[][] adjArray = new int[n+1][n+1];

		for(int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();

			adjArray[v1][v2] = 1;
			adjArray[v2][v1] = 1;
		}

		sc.close();
		
		int result = dfs_array_stack(p1, p2, adjArray, visited, true);
		System.out.println(result);
	}
	
	public static int dfs_array_stack(int p1, int p2, int[][] adjArray, boolean[] visited, boolean flag) {
		int l = adjArray.length-1;
		int result = 1;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(p1);
		visited[p1] = true;

		while(!stack.isEmpty()) {
			int w = stack.peek();
			flag = false; 

			for(int i = 1; i <= l; i++) {
				if(adjArray[w][i] == 1 && !visited[i]) {
					if(i == p2) return result;
					result++;
					stack.push(i);
					visited[i] = true;
					flag = true;
					break;
				}
			}

			if(!flag) {
				stack.pop();
			}
		}
		return -1;
	}
	
}

