package part5.week44.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 구간 합 구하기 4
public class PrefixSum_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] prefixSum = new int[input[0]+1];
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i=0; i<arr.length; i++){
            prefixSum[i+1] = prefixSum[i] + arr[i];
        }

        for(int i=0; i<input[1]; i++){
            int[] range = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            bw.write(prefixSum[range[1]]-prefixSum[range[0]-1]+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
