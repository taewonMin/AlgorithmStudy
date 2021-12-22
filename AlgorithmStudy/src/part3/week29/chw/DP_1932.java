package part3.week29.chw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP_1932 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tSize = Integer.parseInt(br.readLine());
		int[][] arr = new int[tSize+1][tSize+1];
		int result = 0;
		for(int i = 1; i <= tSize; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int idx = 1;
			while(st.hasMoreTokens()) {
				arr[i][idx] = Math.max(arr[i-1][idx-1], arr[i-1][idx]) + Integer.parseInt(st.nextToken());;
				if(result < arr[i][idx]) result = arr[i][idx];
				idx++;
			}
		}
		System.out.println(result);
		br.close();
	}
}
