package part3.week22.chw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_7562 {
	static int[] dn = {-2, -2, -1, -1, 1, 1, 2, 2};
	static int[] dm = {1, -1, 2, -2, 2 ,-2, 1, -1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for(int i = 0; i < cnt; i++) {
			int length = sc.nextInt();
			int[] start = new int[]{sc.nextInt(), sc.nextInt()};
			int[] destination = new int[]{sc.nextInt(), sc.nextInt()};
			int[][] board = new int[length][length];
			boolean[][] visited = new boolean[length][length];
			System.out.println(bfs(start, destination, board, visited, 0));
		}
		sc.close();
	}
	static int bfs(int[] start, int[] destination, int[][] board, boolean[][] visited, int depth) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.offer(new int[] {start[0], start[1], depth});
		visited[start[0]][start[1]] = true;
		while(!queue.isEmpty()) {
			int[] nowCoordinate = queue.peek();
			queue.remove();
			if(nowCoordinate[0] == destination[0] && nowCoordinate[1] == destination[1]) return nowCoordinate[2];
			for(int i = 0; i < dn.length; i++) {
				int x = nowCoordinate[0] + dn[i];
				int y = nowCoordinate[1] + dm[i];
				depth = nowCoordinate[2];
				if(checkBoundary(x, y, visited.length) && !visited[x][y]) {
					queue.offer(new int[] {x, y, depth + 1});
					visited[x][y] = true;
				}
			}
		}
		return 0;
	}
	static boolean checkBoundary(int x, int y, int length) {
		return x > -1 && y > -1 && x < length && y < length;
	}
}
