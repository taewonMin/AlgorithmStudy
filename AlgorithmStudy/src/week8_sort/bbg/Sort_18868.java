package week8_sort.bbg;

import java.util.Scanner;

//멀티버스
public class Sort_18868 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 우주 개수
		int M = sc.nextInt();
		
		// 행성 개수
		int N = sc.nextInt();
		
		int[][] space = new int[M][N];
		for(int m = 0; m < M ; m++) {
			for(int n = 0; n < N ; n++) {
				space[m][n] = sc.nextInt();
			}
		}
		
		int result = 0;
		int cnt = 0;
		//test
		for(int i = 0 ; i < M-1 ; i++) {
			for(int j = 0; j < N-1 ; j++) {
				if(space[i][j] < space[i][j+1]) {
					cnt = space[i+1][j] < space[i+1][j+1] ? cnt+1 : cnt;
				}else if(space[i][j] == space[i][j+1]) {
					cnt = space[i+1][j] == space[i+1][j+1] ? cnt+1 : cnt;
				}else if(space[i][j] > space[i][j+1]) {
					cnt = space[i+1][j] > space[i+1][j+1] ? cnt+1 : cnt;
				}
				
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}
