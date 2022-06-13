package part5.week46.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 두 수의 합
public class TwoPointer_3273 {
    public static int[] array;
    public static int x;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        x = Integer.parseInt(br.readLine());
        
        Arrays.sort(array);
        System.out.println(twoPointer());

        br.close();
    }

    public static int twoPointer(){
        int result = 0;
        int start = 0;
        int end = array.length-1;

        while(start!=end){
            if(array[start] + array[end] > x){
                end--;
            }else if(array[start] + array[end] == x){
                result++;
                start++;
            }else{
                start++;
            }
        }

        return result;
    }
}