package part5.week47.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 두 용액
public class TwoPointer_2470 {
    public static int[] sol;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        sol = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(sol);

        int[] result = twoPointer();
        System.out.println(result[0]+" "+result[1]);

        br.close();
    }

    public static int[] twoPointer(){
        int[] result = new int[2];
        int start = 0;
        int end = sol.length-1;
        int min = Integer.MAX_VALUE;

        while(start!=end){
            int sum = sol[start]+sol[end];
            if(min > Math.abs(sum)){
                min = Math.abs(sum);
                result[0] = sol[start];
                result[1] = sol[end];
            }

            if(sum < 0){
                start++;
            }else if(sum > 0){
                end--;
            }else{
                break;
            }
        }

        return result;
    }
}
