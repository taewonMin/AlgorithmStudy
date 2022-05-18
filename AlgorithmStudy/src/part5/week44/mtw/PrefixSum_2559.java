package part5.week44.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrefixSum_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] prefixSum = new int[input[0]+1];
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i=0; i<arr.length; i++){
            prefixSum[i+1] = prefixSum[i] + arr[i];
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<input[0]-input[1]+1; i++){
            int num = prefixSum[i+input[1]] - prefixSum[i];
            if(num > max){
                max = num;
            }
        }

        System.out.println(max);

        br.close();
    }
}
