package part3.week26.chw;

import java.util.Scanner;

public class BackTracking_15652 {
	static int N;
	static int M;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		dfs(0);
		sc.close();
	}	
	static void dfs(int depth) {
		if(depth == M) {
			for(int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(depth == 0) {
				arr[depth] = i + 1;
				dfs(depth + 1);
			}else if(arr[depth-1] <= i + 1){
				arr[depth] = i + 1;
				dfs(depth + 1);
			}
		}
	}
}


//import java.util.Scanner;
//
//public class BackTracking_15652 {
//	static int[] arr;
//	static boolean[] visited;
//	static int N;
//	static int M;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		N = sc.nextInt();
//		M = sc.nextInt();
//		sc.close();
//		
//		arr = new int[M];
//		dfs(1, 0);
//	}
//	static void dfs(int input, int depth) {
//		if(depth == M) {
//			for(int i : arr) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//			return;
//		}
//		for(int i = input; i <= N; i++) {
//			arr[depth] = i;
//			dfs(i, depth + 1);
//		}
//	}
//}
