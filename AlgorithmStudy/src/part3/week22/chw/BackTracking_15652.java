package part3.week22.chw;

import java.util.Scanner;

public class BackTracking_15652 {
	static int[] arr;
	static boolean[] visited;
	static int N;
	static int M;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		sc.close();
		
		arr = new int[M];
		dfs(1, 0);
	}
	static void dfs(int input, int depth) {
		if(depth == M) {
			for(int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}
		for(int i = input; i <= N; i++) {
//			if(arr[depth] <= arr[depth + 1]) {
//				arr[depth] = i + 1;
//				dfs(N, M, depth + 1);
//			}
			arr[depth] = i;
			dfs(i, depth + 1);
		}
	}
}
