package part4.week33.chw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DP_12865 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];
        int max = 0;
        
        for(int i = 0; i < N; i++) {
        	StringTokenizer st1 = new StringTokenizer(br.readLine());
        	int W = Integer.parseInt(st1.nextToken());
        	int V = Integer.parseInt(st1.nextToken());
        	arr[i][0] = W;
        	arr[i][1] = V;
        }
        
        
        br.close();
        bw.flush();
        bw.close();
    }
}
