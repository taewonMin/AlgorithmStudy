package part4.week37.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 색종이 만들기
public class DivideConquer_2630 {
    static int[][] confetti;
    static int[] result = new int[2];   // 하얀색, 파란색
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        confetti = new int[N][N];
        for(int i=0; i<N; i++){
            confetti[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        devideConquer(0, 0, N);
        bw.write(result[0]+"\n");
        bw.write(result[1]+"\n");

        br.close();
        bw.flush();
        bw.close();
    }

    static void devideConquer(int startX, int startY, int len){
        int color = confetti[startX][startY];
        if(len==1){
            result[color]++;
            return;
        }
        for(int i=startX; i<startX+len; i++){
            for(int j=startY; j<startY+len; j++){
                if(color != confetti[i][j]){
                    int half = len/2;
                    devideConquer(startX, startY, half);
                    devideConquer(startX+half, startY, half);
                    devideConquer(startX, startY+half, half);
                    devideConquer(startX+half, startY+half, half);
                    return;
                }
            }
        }
        result[color]++;
        return;
    }
}