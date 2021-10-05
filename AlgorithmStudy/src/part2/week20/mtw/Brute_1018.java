package part2.week20.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Brute_1018{
    public static String[] chess;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);

        chess = new String[N];
        for(int i=0; i<N; i++){
            chess[i] = br.readLine();
        }

        System.out.println(selectChessBoard(N, M));

        br.close();
    }

    // 체스판 고르기
    public static int selectChessBoard(int N, int M){
        int min = N*M;
        for(int i=0; i<N-7; i++){
            for(int j=0; j<M-7; j++){
                int cnt = redrawChess(i, j);
                if(cnt == 0) return 0;
                if(cnt < min){
                    min = cnt;
                }
            }
        }
        return min;
    }

    // 색깔 칠한 개수 구하기
    public static int redrawChess(int x, int y){
        int startWCnt = 0;
        int startBCnt = 0;
        for(int i=x; i<x+8; i++){
            for(int j=y; j<y+8; j++){
                if((i-x) % 2 == 0){ // 짝수행
                    if((j-y) % 2 == 0){ // 짝수열
                        if(chess[i].charAt(j) == 'B') startWCnt++;
                        else startBCnt++;
                    }else{ // 홀수열
                        if(chess[i].charAt(j) == 'W') startWCnt++;
                        else startBCnt++;
                    }
                }else{ // 홀수행
                    if((j-y) % 2 == 0){ // 짝수열
                        if(chess[i].charAt(j) == 'W') startWCnt++;
                        else startBCnt++;
                    }else{ // 홀수열
                        if(chess[i].charAt(j) == 'B') startWCnt++;
                        else startBCnt++;
                    }
                }
                
            }
        }
        return Math.min(startWCnt, startBCnt);
    }
}