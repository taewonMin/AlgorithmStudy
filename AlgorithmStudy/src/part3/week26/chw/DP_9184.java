package part3.week26.chw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_9184 {
	static Integer[][][] dp = new Integer[21][21][21];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while(true) {
			String[] inputArr = br.readLine().split(" ");
			int a = Integer.parseInt(inputArr[0]);
			int b = Integer.parseInt(inputArr[1]);
			int c = Integer.parseInt(inputArr[2]);
			if(a == -1 && b == -1 && c == -1) break;
			if(a <= 0 || b <= 0 || c <= 0) {
				bw.write("w(" + a +", " + b + ", " + c + ") = 1\n");
			}else if(a > 20 || b > 20 || c > 20){
				bw.write("w(" + a +", " + b + ", " + c + ") = 1048576\n");
			}else {
				bw.write("w(" + a +", " + b + ", " + c + ") = "+ w(a, b, c) +"\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
	static int w(int a, int b, int c) {
		if(a <= 0 || b <= 0 || c <= 0) return 1;
		if(dp[a][b][c] == null) {
			if(a < b && b < c) {
				dp[a][b][c] = w(a,b,c-1) + w(a,b-1,c-1) - w(a,b-1,c);
			}else {
				dp[a][b][c] = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1);
			}
		}
		return dp[a][b][c];
	}
}



//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//public class DP_9184 {
//	static Integer[][][] dp = new Integer[51][51][51];
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		while(true) {
//			String[] inputArr = br.readLine().split(" ");
//			int a = Integer.parseInt(inputArr[0]);
//			int b = Integer.parseInt(inputArr[1]);
//			int c = Integer.parseInt(inputArr[2]);
//			if(a == -1 && b == -1 && c == -1) break;
//			bw.write("w(" + a +", " + b + ", " + c + ") = "+ w(a, b, c) +"\n");
//		}
//		br.close();
//		bw.flush();
//		bw.close();
//	}
//	static int w(int a, int b, int c) {
//		if(a <= 0 || b <= 0 || c <= 0) return 1;
//		if(dp[a][b][c] == null) {
//			if(a > 20 || b > 20 || c > 20) {
//				dp[a][b][c] = w(20,20,20);
//			}else if(a < b && b < c) {
//				dp[a][b][c] = w(a,b,c-1) + w(a,b-1,c-1) - w(a,b-1,c);
//			}else {
//				dp[a][b][c] = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1);
//			}
//		}
//		return dp[a][b][c];
//	}
//}