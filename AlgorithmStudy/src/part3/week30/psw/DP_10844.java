package part3.week30.psw;


public class DP_10844 {
    public static void main(String[] args) {
        System.out.println(dp(new java.util.Scanner(System.in).nextInt()));
    }

    public static int dp(int n){
        int[][] DP = new int[n+1][12];
        for (int i = 2; i < 11; i++) {
            DP[1][i] = 1;
        }

        int answer = 0;
        for (int i = 2; i < n+1; i++) {
            for (int j = 1; j < 11; j++) {
                DP[i][j] = num(DP[i-1][j-1] + DP[i-1][j+1]);
                if (i==n) answer = num(answer + DP[i][j]);
            }
        }
        return n==1 ? 9: answer;
    }

    public static int dp2(int n){
        int[][] DP = new int[n+1][11];
        for (int i = 1; i < 10; i++) {
            DP[1][i] = 2;
            DP[0][i] = 1;
        }
        DP[1][9] = 1;

        int answer = 0;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < 10; j++) {
                DP[i][j] = (num(DP[i-1][j-1]) + num(DP[i-1][j+1]));
                if (j == 1) DP[i][j] += num(DP[i-2][j]);
                if (i==n-1) answer = num(answer + num(DP[i][j]));
            }
        }
        return n==1 ? 9 : n==2 ? 17 : answer;
    }

    public static int num(int num){
        return num%1000000000;
    }
}
