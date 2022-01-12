package part4.week31.chw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int cnt = Integer.parseInt(br.readLine());
        int[][] arr = new int[cnt+1][3];
        for(int i = 1; i <= cnt; i++) {
        	String[] rgbArr = br.readLine().split(" ");
        	arr[i][0] = Math.min(arr[i-1][1], arr[i-1][2]) + Integer.parseInt(rgbArr[0]);
        	arr[i][1] = Math.min(arr[i-1][0], arr[i-1][2]) + Integer.parseInt(rgbArr[1]);
        	arr[i][2] = Math.min(arr[i-1][0], arr[i-1][1]) + Integer.parseInt(rgbArr[2]);
        }
        int result = Math.min(arr[cnt][0], Math.min(arr[cnt][1], arr[cnt][2]));
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }
}
