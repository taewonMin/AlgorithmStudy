package part4.week32.psw;

import java.util.*;

public class DP_2565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Lis[] lines = new Lis[length];
        int[] dp = new int[length];
        for (int i = 0; i < length; i++) {
            lines[i] = new Lis(sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(lines,(a,b)->Integer.compare(a.start,b.start));
        for (int i = 0; i < length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (lines[i].end > lines[j].end && max < dp[j]){
                    max = dp[j];
                }
            }
            dp[i] = max +1;
        }
        System.out.println(length - Arrays.stream(dp).max().getAsInt());
        sc.close();
    }

    public void test1(){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt(), A = 0, B = 1;

        int[][] connectNumbers = new int[2][501], dp = new int[2][501];
        int[] test = new int[length];
        for (int i = 0; i < length; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            connectNumbers[A][a] = b;
            connectNumbers[B][b] = a;
            test[i] = a;
        }

        for (int i = 0; i < length; i++) {
            int maxA = 0;
            for (int j = 0; j < i; j++) {
                if (connectNumbers[B][connectNumbers[A][test[i]]] > connectNumbers[B][connectNumbers[A][test[j]]]
                        && maxA < dp[A][j]){
                    maxA = dp[A][j];
                }
            }
            dp[A][i] = maxA+1;
        }

        System.out.println(length - Arrays.stream(dp[A]).max().getAsInt());
        sc.close();
    }
}
class Lis{
    int start;
    int end;
    public Lis(int start,int end){
        this.start = start;
        this.end   = end;
    }
}
/*
    1   2   3   4   5   6   7   8   9   10
 A   --------------------------------------
    8   2   9   1   0   4   6   0   7   10


    1   2   3   4   5   6   7   8   9   10
B   --------------------------------------
    4   2   0   6   0   7   9   1   3   10


5
2 1
3 2
4 3
5 4
6 5

5
1 2
2 3
3 4
4 5
5 6

5
2 2
3 3
4 4
5 5
6 1

8
1 8
3 9
2 2
4 1
6 4
10 10
9 7
7 6
 */