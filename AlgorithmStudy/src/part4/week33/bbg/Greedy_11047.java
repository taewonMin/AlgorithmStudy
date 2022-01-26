package part4.week33.bbg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Greedy_11047 {// 동전 0 java 8 11592KB	84ms 1088B
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] coins = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		
		int quantity = 0;
		int nam = K;
		for(int i = N-1 ; i >= 0 && nam > 0 ; i--) {
			if(coins[i] > K) continue;
			quantity += nam / coins[i];
			nam %= coins[i];
		}
		
		bw.write(String.valueOf(quantity));
		bw.flush();
		br.close();
		bw.close();
	}
}
