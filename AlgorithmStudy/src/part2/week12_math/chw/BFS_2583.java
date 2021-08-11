package part2.week12_math.chw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BFS_2583 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt(); // 세로 길이
		int n = sc.nextInt(); // 가로 길이
		int cnt = sc.nextInt(); // 출력 개수
		int visitCnt = 0;
		
		boolean visited[][] = new boolean[n][m]; // 방문 여부를 검사할 배열 

		for(int i = 0; i < cnt; i++){
			int xmin = sc.nextInt();
			int ymin = sc.nextInt();
			int xmax = sc.nextInt();
			int ymax = sc.nextInt();
			
			// ex)[0][2] ~ [3][3]
			for(int j = xmin; j < xmax; j++) {
				for(int k = ymin; k < ymax; k++) {
					if(!visited[j][k]) {
						visited[j][k] = true;
					}else {
						visitCnt++;
					}
					 
				}
			}
		}
		List<int[]> list = new ArrayList<int[]>();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(!visited[i][j]) {
					int[] coordinate = {i,j};
					list.add(coordinate);
				}
			}
		}
		
		
		sc.close();
	}


}