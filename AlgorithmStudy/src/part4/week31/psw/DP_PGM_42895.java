package part4.week31.psw;

import java.util.*;

public class DP_PGM_42895 {
    public static void main(String[] args) {
        int N = 1;
        int number = 11111111;
        int answer = dp2(N,number);
        System.out.println(answer);
    }

    public static int ssibal(int N,int number){
        int[][] dp = new int[9][];
        dp[1] = new int[]{N,-N};
        int answer = -1;
        int line = N;

        for (int i = 2; i < 9; i++) {
            dp[i] = new int[dp[i-1].length*4+2];
            for (int j = 0; j < dp[i-1].length; j++) {
                if (dp[i-1][j] == number) return i-1;
                dp[i][j*4]   = dp[i-1][j] + N;
                dp[i][j*4+1] = dp[i-1][j] - N;
                dp[i][j*4+2] = dp[i-1][j] * N;
                dp[i][j*4+3] = dp[i-1][j] / N;
            }
            line = line*10 + N;
            dp[i][dp[i].length-1] =  line;
            dp[i][dp[i].length-2] = -line;
        }

        return answer;
    }

    public static int ssibal3(int N,int number){
        int[][] dp = new int[10][];
        dp[1] = new int[]{N,-N};
        int answer = -1;
        int line = N;
        for (int i = 2; i < 9; i++) {
            int length = dp[i-1].length*4+2;
            dp[i] = new int[length];

            for (int j = 0; j <= dp[i-1].length; j++) {
                if (dp[i-1][j] == number) return i-1;
                dp[i][j*4]   = dp[i-1][j] + N;
                dp[i][j*4+1] = dp[i-1][j] - N;
                dp[i][j*4+2] = dp[i-1][j] * N;
                dp[i][j*4+3] = dp[i-1][j] / N;
            }
            line = line*10 + N;
            dp[i][dp[i].length-1] =  line;
            dp[i][dp[i].length-2] = -line;
        }
        return answer;
    }

    /*

       2~2,2~3,2~4,2~5,2~6
               3~3,3~4,3~5
                       4~4
        4   5   6   7   8
     */
    static Set<Integer> set = new HashSet<>();
    static List<Integer>[] dp = new List[10];
    public static int dp2(int N,int number){
        dp[1] = Arrays.asList(N,-N);
        set.addAll(dp[1]);
        int line = N;

        for (int i = 2; i <= 9; i++) {
            if (set.contains(number)) return i-1;
            dp[i] = new ArrayList<>();

            for (int j = 0; j < dp[i-1].size(); j++) {
                int preNum = dp[i-1].get(j);
                addNum(preNum+N,i);
                addNum(preNum-N,i);
                addNum(preNum*N,i);
                addNum(preNum/N,i);
            }

            line = line*10 + N;// N, NN, NNN
            addNum(line,i);
            addNum(-line,i);

            for (int j = 2; j <= i/2; j++) {
                for (int k = 0; k < dp[j].size(); k++) {
                    int num1 = dp[j].get(k);
                    for (int l = 0; l < dp[i-j].size(); l++) {
                        int num2 = dp[i-j].get(l);
                        addNum(num1-num2,i);
                        addNum(num1+num2,i);
                    }
                }
            }
        }
        return set.contains(number) ? 8 : -1;
    }

    private static void addNum(int num, int i) {
        if (set.add(num)) dp[i].add(num);
    }
}

/*
+N, -N

2N,N*N,N/N,(N-N)           4
-2N,-N*N,-N/N,(-N+N)       4
NN, -NN                    2

N+(10), N*(10), N-(10),N/(10)
NNN,-NNN
-> 40 + 2

3N,N+N*N,N+N/N,N-2N,
======================

NN+ -NN, 2N+(N/N)
 */