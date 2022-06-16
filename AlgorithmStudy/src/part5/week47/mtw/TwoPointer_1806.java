package part5.week47.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 부분합
public class TwoPointer_1806 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        // solution1();
        solution2();

        br.close();
    }
    
    // 누적합 이용
    public static void solution1() throws IOException{
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] prefixSum = new int[array.length+1];
        for(int i=0; i<array.length; i++){
            prefixSum[i+1] = prefixSum[i] + array[i];
        }

        int result = Integer.MAX_VALUE;
        int start = 0;
        int end = 1;

        while(start < prefixSum.length && end < prefixSum.length){
            if(input[1] <= prefixSum[end] - prefixSum[start]){
                if(result > end - start){
                    result = end - start;
                }
                start++;
            }else{
                end++;
            }
        }

        if(input[1]==0){
            System.out.println(1);
        }else{
            System.out.println(result==Integer.MAX_VALUE ? 0 : result);
        }
    }

    // 누적합 이용 x
    public static void solution2() throws IOException{
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int result = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = array[0];

        while(start <= end && end < array.length){
            if(sum < input[1]){
                if(end==array.length-1){
                    break;
                }
                sum += array[++end];
            }else{
                result = Math.min(result, end-start+1);
                sum -= array[start++];
            }
        }

        System.out.println(result==Integer.MAX_VALUE ? 0 : result);

    }
}
