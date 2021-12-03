package part3.week26.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_9184 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[][][] dp = new int[21][21][21];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			if(a==-1 && b==-1 && c==-1) break;

			output(a, b, c, recursion(a, b, c));
		}

		br.close();
		bw.flush();
		bw.close();
	}

	static int recursion(int a, int b, int c) throws IOException{
		if(a <=0 || b <= 0 || c <= 0) {
			return 1;
		}
		if(a > 20 || b > 20 || c > 20){
			a = 20;
			b = 20;
			c = 20;
			dp[a][b][c] = recursion(a, b, c);
		}else if(dp[a][b][c] == 0){
			if(a < b && b < c){
				dp[a][b][c] = recursion(a, b, c-1) + recursion(a, b-1, c-1) - recursion(a, b-1, c);
			}else{
				dp[a][b][c] = recursion(a-1, b, c) + recursion(a-1, b-1, c) + recursion(a-1, b, c-1) - recursion(a-1, b-1, c-1);
			}
		}
		return dp[a][b][c];
	}

	static void output(int a, int b, int c, int result) throws IOException{
		bw.write("w("+a+", "+b+", "+c+") = "+result);
		bw.newLine();
	}
}