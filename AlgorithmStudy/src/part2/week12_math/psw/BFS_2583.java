package part2.week12_math.psw;

import java.util.Scanner;

public class BFS_2583 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int N = sc.nextInt();
		final int M = sc.nextInt();
		final int K = sc.nextInt();

		int[][] map = new int[N][M];
		for (int i = 0; i < K; i++) {
			int y1 = N - sc.nextInt()-1;
			int x1 = M - sc.nextInt()-1;
			int y2 = N - sc.nextInt()-1;
			int x2 = M - sc.nextInt()-1;

			for (int j = x1; j < x2; j++) {
				for (int k = y1; k < y2; k++) {

				}
			}
		}

		sc.close();
	}
}
