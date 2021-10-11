package part3.week21.chw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Search_2206 {
	static boolean[][] visited;
	static String[][] map;
	static int N;
	static int M;
	static int[] dn = {1,-1,0,0};
	static int[] dm = {0,0,1,-1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		map = new String[N][M];
		int answer = -1;
		for(int i = 0; i < N; i++) {
			map[i] = br.readLine().split(""); 
		}
		List<Integer[]> wallCoordinate = checkWall();
		
		for(int i = 0; i < wallCoordinate.size(); i++) {
			map[wallCoordinate.get(i)[0]][wallCoordinate.get(i)[1]] = "0";
			int result = bfs();
			map[wallCoordinate.get(i)[0]][wallCoordinate.get(i)[1]] = "1";
			answer = result > answer ? result : answer;
		}
		System.out.println(answer);
	}
	static List<Integer[]> checkWall() {
		visited = new boolean[N][M];
		Queue<int[]> queue = new LinkedList<>();
		List<Integer[]> wallCoordinate = new ArrayList<>();
		queue.offer(new int[] {0,0});
		visited[0][0] = true;
		while(!queue.isEmpty()) {
			int[] coordinate = queue.peek();
			queue.poll();
			for(int i = 0; i < dn.length; i++) {
				int n = coordinate[0] + dn[i];
				int m = coordinate[1] + dm[i];
				if(boundaryCheck(n, m) && !visited[n][m]) {
					if("0".equals(map[n][m])) {
						queue.offer(new int[] {n,m});
						visited[n][m] = true;
					}else if("1".equals(map[n][m])){
						wallCoordinate.add(new Integer[] {n, m});
					}
				}
			}
		}
		return wallCoordinate;
	}
	static int bfs() {
		visited = new boolean[N][M];
		Queue<Node> queue = new LinkedList<>();
		queue.offer(new Node(0,0,1));
		visited[0][0] = true;
		while(!queue.isEmpty()) {
			Node node = queue.peek();
			if(node.x == N - 1 && node.y == M -1) return node.cost;
			queue.poll();
			for(int i = 0; i < dn.length; i++) {
				int n = node.x + dn[i];
				int m = node.y + dm[i];
				if(boundaryCheck(n, m) && !visited[n][m] && "0".equals(map[n][m])) {
					queue.offer(new Node(n, m, node.cost + 1));
				}
			}
		}
		return -1;
	}
	static boolean boundaryCheck(int n, int m) {
		return n > -1 && n < N && m > -1 && m < M;
	}
}
class Node {
	int x;
	int y;
	int cost;
	Node(int x, int y, int cost) {
		this.x = x;
		this.y = y;
		this.cost = cost;
	}
}


//package part3.week21.chw;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//public class Search_2206 {
//	static boolean[][] visited;
//	static String[][] map;
//	static ArrayList<String> list;
//	static int N;
//	static int M;
//	static int[] dn = {1,-1,0,0};
//	static int[] dm = {0,0,1,-1};
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] input = br.readLine().split(" ");
//		N = Integer.parseInt(input[0]);
//		M = Integer.parseInt(input[1]);
//		map = new String[N][M];
//		list = new ArrayList<String>();
//		int answer = -1;
//		for(int i = 0; i < N; i++) {
//			map[i] = br.readLine().split(""); 
//		}
//		int repeatCnt = checkWall(0,0);
//		for(int i = 0; i < repeatCnt; i++) {
//			int result = bfs(0, 0, false);
//			answer = result > answer ? result : answer;
//		}
//		System.out.println(answer);
//	}
//	static int checkWall(int x, int y) {
//		visited = new boolean[N][M];
//		Queue<int[]> queue = new LinkedList<>();
//		queue.offer(new int[] {x,y});
//		visited[x][y] = true;
//		int repeatCnt = 0;
//		while(!queue.isEmpty()) {
//			int[] coordinate = queue.peek();
//			queue.poll();
//			for(int i = 0; i < dn.length; i++) {
//				int n = coordinate[0] + dn[i];
//				int m = coordinate[1] + dm[i];
//				if(boundaryCheck(n, m) && !visited[n][m]) {
//					if("0".equals(map[n][m])) {
//						queue.offer(new int[] {n,m});
//						visited[n][m] = true;
//					}else if("1".equals(map[n][m])){
//						repeatCnt++;
//					}
//				}
//			}
//		}
//		return repeatCnt;
//	}
//	static int bfs(int x, int y, boolean broken) {
//		visited = new boolean[N][M];
//		Queue<Node> queue = new LinkedList<>();
//		queue.offer(new Node(x,y,1));
//		visited[x][y] = true;
//		while(!queue.isEmpty()) {
//			Node node = queue.peek();
//			if(node.x == N - 1 && node.y == M -1) return node.cost;
//			queue.poll();
//			for(int i = 0; i < dn.length; i++) {
//				int n = node.x + dn[i];
//				int m = node.y + dm[i];
//				if(boundaryCheck(n, m) && !visited[n][m]) {
//					String newCoordinate = n+""+m;
//					if("0".equals(map[n][m])) {
//						queue.offer(new Node(n, m, node.cost + 1));
//						visited[n][m] = true;
//					}else if("1".equals(map[n][m]) && !broken && !list.contains(newCoordinate)){
//						queue.offer(new Node(n, m, node.cost + 1));
//						visited[n][m] = true;
//						broken = true;
//						list.add(newCoordinate);
//					}
//				}
//			}
//		}
//		return -1;
//	}
//	static boolean boundaryCheck(int n, int m) {
//		return n > -1 && n < N && m > -1 && m < M;
//	}
//}
//class Node {
//	int x;
//	int y;
//	int cost;
//	Node(int x, int y, int cost) {
//		this.x = x;
//		this.y = y;
//		this.cost = cost;
//	}
//}








