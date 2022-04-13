package part5.week41.psw;

import java.util.Scanner;

/*
    @파일 합치기
    1. 합치는 비용 = 파일 크기의 합, 파일을 합치는데 드는 최소 비용 구하기
    2. 인접한 챕터만 병합 가능
 */
public class DP_11066 {
    static int[][] DP;
    static int[][] SUM;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            DP = new int[k][];
            SUM = new int[k][];

            for (int j = 0; j < k; j++) {
                DP[j] = new int[k-j];
                SUM[j] = new int[k-j];
                for (int l = 0; l < k-j; l++) {
                    if (j==0){
                        DP[j][l] = sc.nextInt();
                    }else if (j==1){
                        DP[j][l] = SUM[j][l]= DP[j-1][l]+DP[j-1][l+1];
                    }else {
                        DP[j][l] = DP[j-1][l] + DP[0][l+j];

                        if (j%2==0){ // 홀수일떄
                            SUM[j][l] = Math.min(SUM[j-1][l],SUM[j-1][l+1]) + DP[j][l];
                        }else {
                            SUM[j][l] = Math.min(SUM[j-2][l]+SUM[j-2][l+2],Math.min(SUM[j-1][l],SUM[j-1][l+1])) + DP[j][l];
                        }
                    }
                }
            }
            System.out.println(SUM[k-1][0]);
        }
    }
}
/*
C1   C2   C3            20 10 25
B1   B2                   30 35
----------85,90
A1(B2+C1 or B1+C3)
 */
/*
C1   C2   C3   C4
B1   B2   B3
-----------------------------------
A1   A2
(B1+C3orB2+C1), (B3+C2orB2+C4)

D1(B1+B3orA1+C4 or A2+C1)
 */
/*
C1   C2   C3   C4   C5
B1   B2   B3   B4
-----------------------------------
A1   A2   A3
 */
/*
C1   C2   C3   C4   C5   C6
B1   B2   B3   B4   B5
-----------------------------------
A1   A2   A3   A4
 */
/*
C1   C2   C3   C4   C5   C6   C7
B1   B2   B3   B4   B5   B6
-----------------------------------
A1   A2   A3   A4   A5
D1   D2   D3   D4


10 5 15 20 15 5 10
 */