package part4.week38.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 종이의 개수
public class DivideConquer_1780 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int[][] paper;
    public static int[] result;
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        result = new int[3];
        for(int i=0; i<N; i++){
            paper[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        divideConquer(0, 0, N);

        for(int i=0; i<result.length; i++){
            bw.write(result[i]+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void divideConquer(int row, int col, int len){
        int num = paper[row][col];
        for(int i=row; i<row+len; i++){
            for(int j=col; j<col+len; j++){
                if(num != paper[i][j]){
                    for(int k=row; k<row+len; k+=len/3){
                        for(int m=col; m<col+len; m+=len/3){
                            divideConquer(k, m, len/3);
                        }
                    }
                    return;
                }
            }
        }
        result[num+1]++;
    }
}
