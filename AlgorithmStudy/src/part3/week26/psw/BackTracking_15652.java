package part3.week26.psw;

import java.util.Scanner;

public class BackTracking_15652 {

	public static int[][][] dp = new int[51][51][51];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		dp[20][20][20] = 1048576;
		while (true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a == -1 && b == -1 && c == -1) break;
			System.out.printf("%s%d%s%d%s%d%s%d%s","w(",a,", ",b,", ",c,") = ",w(a,b,c),"\n");
		}
		sc.close();
	}

	public static int w(int a, int b, int c){
		if(a <= 0 || b <= 0 || c <= 0){ // 0보다 작은게 있으면 아예 볼 필요 없음
			return 1;
		}else if( a > 20 || b > 20 || c > 20){
			dp[a][b][c] = dp[20][20][20];
			return dp[a][b][c];
		}else if(a < b && b < c){ // 오름차순일떄
			if (dp[a][b][c-1] == 0) dp[a][b][c-1] = w(a,b,c-1);
			if (dp[a][b-1][c-1] == 0) dp[a][b-1][c-1] = w(a,b-1,c-1);
			if (dp[a][b-1][c] == 0) dp[a][b-1][c] = w(a,b-1,c);

			return dp[a][b][c-1] + dp[a][b-1][c-1] - dp[a][b-1][c];
		}else {
			if (dp[a-1][b][c] == 0) dp[a-1][b][c] = w(a-1,b,c);
			if (dp[a-1][b-1][c] == 0) dp[a-1][b-1][c] = w(a-1,b-1,c);
			if (dp[a-1][b][c-1] == 0) dp[a-1][b][c-1] = w(a-1,b,c-1);
			if (dp[a-1][b-1][c-1] == 0) dp[a-1][b-1][c-1] = w(a-1,b-1,c-1);

			return  dp[a-1][b][c] + dp[a-1][b-1][c] + dp[a-1][b][c-1] - dp[a-1][b-1][c-1];
		}
	}
}
