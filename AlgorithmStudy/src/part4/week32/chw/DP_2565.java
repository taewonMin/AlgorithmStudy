package part4.week32.chw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class DP_2565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        int[] dp = new int[N];
        int result = 0;
        dp[0] = 1;
        for(int i = 0; i < N; i++) {
        	String[] numbers = br.readLine().split(" ");
        	arr[i][0] = Integer.parseInt(numbers[0]);
        	arr[i][1] = Integer.parseInt(numbers[1]);
        }
        
        // 정렬
        Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[0]));

        for(int i = 0; i < N; i++) {
        	dp[i] = 1;
        	for(int j = 0; j < i; j++) {
        		if(arr[i][1] > arr[j][1] && dp[i] < dp[j] + 1) {
        			dp[i] = dp[j] + 1;
        		}
        	}
        	result = Math.max(result, dp[i]);
        }
        bw.write(String.valueOf(N-result));
        br.close();
        bw.flush();
        bw.close();
    }
}
/*
8

1 8
3 9
2 2 or 4 1

6 4
7 6
9 7
10 10


1 8
2 2
3 9
4 1
6 4
7 6
9 7
10 10

8 2 9 1 4 6 7 10
1 1 2 1 2 3 4 5
3 2 2 1 1 1 1 1  max=3

*/