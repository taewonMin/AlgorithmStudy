package part3.week25.chw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BackTracking_15651 {
	static int[] arr;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		arr = new int[M];
		dfs(N, M, 0);
		br.close();
		bw.flush();
		bw.close();
	}
	static void dfs(int N, int M, int depth) throws IOException {
		if(depth == M) {
			for(int i : arr) {
				bw.write(i + " ");
			}
			bw.write("\n");
			return;
		}
		for(int i = 1; i <= N; i++) {
			arr[depth] = i;
			dfs(N, M, depth + 1);
		}
	}
}