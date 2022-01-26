package part4.week33.chw;

import java.io.*;

public class Greedy_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int K = Integer.parseInt(arr[1]);
        int[] coin = new int[N];
        int result = 0;
        int idx = 0;
        for(int i = 0; i < N; i++) {
        	coin[i] = Integer.parseInt(br.readLine());
        	if(coin[i] > K) {
        		idx = i - 1;
        		coin[i] = 0;
        		break;
        	}
        }
        for(int j = idx; j >= 0; j--) {
        	if(coin[j] <= K) {
				result += (K / coin[j]);
				K = K % coin[j];
			}
        }
//        for(int j = idx; j >= 0; j--) {
//        	if(K == 0) break;
//        	result += K / arr[j];
//        	K -= (K / arr[j]) * arr[j];
//        }
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }
}
/*
10 4269
1
5
10
50
100
500
1000
5000
10000
50000
*/