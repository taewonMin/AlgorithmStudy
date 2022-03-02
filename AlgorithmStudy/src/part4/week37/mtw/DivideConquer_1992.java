package part4.week37.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 쿼드트리
public class DivideConquer_1992 {
    static int[][] tree;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        tree = new int[N][N];
        for(int i=0; i<N; i++){
            tree[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }

        devideConquer(0, 0, N);
        System.out.println(sb.toString());

        br.close();
    }

    static void devideConquer(int startX, int startY, int len){
        int color = tree[startX][startY];
        if(len==1){
            sb.append(color);
            return;
        }
        for(int i=startX; i<startX+len; i++){
            for(int j=startY; j<startY+len; j++){
                if(color != tree[i][j]){
                    int half = len/2;
                    sb.append("(");
                    devideConquer(startX, startY, half);
                    devideConquer(startX, startY+half, half);
                    devideConquer(startX+half, startY, half);
                    devideConquer(startX+half, startY+half, half);
                    sb.append(")");
                    return;
                }
            }
        }
        sb.append(color);
        return;
    }
}
