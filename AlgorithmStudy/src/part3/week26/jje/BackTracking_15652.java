package part3.week26.jje;

import java.util.Scanner;

public class BackTracking_15652 {

	static int n = 0;
	static int m = 0;
	static int[] arr = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[m];
		dfs(1, 0);
		sc.close();
	}

	static void dfs(int index, int depth){
		if(depth == m){
			for(int result : arr){
				System.out.print(result+" ");
			}
			System.out.println();
			return;
		}

		for (int i = index; i <= n ; i++) {
			arr[depth] = i;
			dfs(i, depth + 1);
		}
	}
}