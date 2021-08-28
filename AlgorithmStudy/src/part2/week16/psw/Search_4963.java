package part2.week16.psw;

import java.util.Scanner;

public class Search_4963 {
	static int[][] map;
	static boolean[][] visitied;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(init(sc)) {
			int answer = 0;
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if(map[i][j] == 1 && !visitied[i][j]) {
						dfs(i,j);
						answer++;
					}
				}
			}
			System.out.println(answer);
		}

		sc.close();
	}
	private static boolean init(Scanner sc) {
		int w = sc.nextInt(), h = sc.nextInt();
		if(w+h == 0) return false;
		
		visitied = new boolean[h][w];
		map = new int[h][w];
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		return true;
	}
	
	static void dfs(int i, int j) {
		visitied[i][j] = true;
		for (int h = -1; h <= 1; h++) { // 총 8번의 케이스 (8방위 검사)
			for (int w = -1; w <= 1; w++) {
				if(h == 0 && w == 0) continue;
				if(boundaryChk(i+h,j+w) && map[i+h][j+w] == 1 && !visitied[i+h][j+w]) dfs(i+h,j+w);
			}
		}
	}
	
	private static boolean boundaryChk(int i, int j) {
		if(i > -1 && j > -1 && i < map.length && j < map[0].length) return true;
		return false;
	}
}