package part3.week25.chw;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BackTracking_2580 {
	static int N;
	static int[][] map;
	static int[][] areaMap;
	static List<int[]> list = new LinkedList<int[]>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		map = new int[9][9];
		areaMap = new int[9][9];
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				map[i][j] = sc.nextInt();
				if(map[i][j] == 0) {
					list.add(new int[] {i, j});
					N++;
				}
				
				int idx = j * 3 + i / 3;
				
				
				
				
			}
		}
		
		dfs(0);
		sc.close();
	}
	static void dfs(int depth) {
		if(depth == N) {
			for(int[] arr : map) {
				for(int i : arr) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
			return;
		}
		
		for(int i = 1; i <= 9; i++) {
			int[] coordinate = list.get(depth);
			if(checkSudoku(coordinate, i)) {
				dfs(depth + 1);
			}
		}
	}
	static boolean checkSudoku(int[] coordinate, int input) {
		int x = coordinate[0];
		int y = coordinate[1];
		// map만들때 영역 9개로 만들어서 하나의 포문으로 체크
		for(int i = 0; i < 9; i++) {
			// x 고정
			if(map[x][i] == input) return false;
			// y 고정
			if(map[i][y] == input) return false;
			// 영역 체크 후 3x3체크
			int area = 3 * (y / 3) + (x / 3);
			
			
		}
		
		return true;
	}
}
/*
4,7

0 ~ 2	3 ~ 5	6 ~ 8  



*/