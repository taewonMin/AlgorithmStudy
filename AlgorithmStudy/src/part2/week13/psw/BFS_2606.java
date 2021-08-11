package part2.week13.psw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_2606 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] box = new boolean[n][n];
		int line = sc.nextInt();
		
		for (int i = 0; i < line; i++) {
			int start = sc.nextInt()-1;
			int end = sc.nextInt()-1;
			box[start][end] = true;
			box[end][start] = true;
		}
		
		int answer = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean[] visited = new boolean[n];
		
		
		queue.add(0);
		visited[0] = true;
		
		while(!queue.isEmpty()) {
			int target = queue.poll();
			//System.out.println(target);
			for (int i = 1; i < box[target].length; i++) {
				if(box[target][i] && !visited[i]) {
					visited[i] = true;
					queue.add(i);
					answer++;
				}
			}
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
