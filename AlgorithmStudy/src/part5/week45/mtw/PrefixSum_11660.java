package part5.week45.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 구간 합 구하기 5
public class PrefixSum_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] prefixSum = new int[input[0]][input[0]];
        for(int i=0; i<input[0]; i++){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j=0; j<arr.length; j++){
                if(j==0){
                    prefixSum[i][j] = arr[j];
                }else{
                    prefixSum[i][j] = prefixSum[i][j-1] + arr[j];
                }
            }
        }

        // 세로로 더하기
        for(int i=0; i<input[0]; i++){
            for(int j=1; j<input[0]; j++){
                prefixSum[j][i] += prefixSum[j-1][i];
            }
        }

        for(int i=0; i<input[1]; i++){
            int[] coordinate = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x1 = coordinate[0]-1;
            int y1 = coordinate[1]-1;
            int x2 = coordinate[2]-1;
            int y2 = coordinate[3]-1;
            int result = prefixSum[x2][y2];
            int count=0;
            if(0 < x1){
                result -= prefixSum[x1-1][y2];
                count++;
            }
            if(0 < y1){
                result -= prefixSum[x2][y1-1];
                count++;
            }
            if(count==2){
                result += prefixSum[x1-1][y1-1];
            }
            bw.write(result+"\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
