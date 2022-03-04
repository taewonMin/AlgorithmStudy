package part4.week38.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class DivideConquer_6549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (numbers[0]==0) break;
            //System.out.println(divide(numbers,1,numbers.length-1));//	63984	628
            System.out.println(stack(numbers));
        }
    }

    private static long stack(int[] numbers) {// 오큰수럽다...
        Stack<Integer> stack = new Stack<>();
        int n = numbers.length-1;
        long max = 0;

        for (int i = 1; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] >= numbers[i]){
                long height = numbers[stack.pop()];
                long width = stack.isEmpty() ? i-1 : i - 2 - stack.peek();
                max = Math.max(max,height*width);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            long height = numbers[stack.pop()];
            long width = stack.isEmpty() ? n : n -1 - stack.peek();
            max = Math.max(max,width*height);
        }

        return max;
    }

    private static long divide(int[] numbers, int left, int right) {
        long max = numbers[left];

        if (left < right){
            int mid = (left+right)/2;
            long lMax = divide(numbers,left,mid);
            long rMax = divide(numbers,mid+1,right);
            max = Math.max(conquer(numbers,left,mid,right),Math.max(rMax,lMax));
        }

        return max;
    }

    private static long conquer(int[] numbers, int left, int mid, int right) {
        int lIdx = mid, rIdx = mid;
        long height = numbers[mid];
        long max = height;

        while (left < lIdx && rIdx < right){
            if (numbers[lIdx-1] < numbers[rIdx+1]){
                rIdx++;
                height = Math.min(height,numbers[rIdx]);
            }else {
                lIdx--;
                height = Math.min(height,numbers[lIdx]);
            }
            max = Math.max(max, height*(rIdx-lIdx +1));
        }

        while (rIdx < right){
            rIdx++;
            height = Math.min(height,numbers[rIdx]);
            max = Math.max(max,height *(rIdx-lIdx+1));
        }

        while (lIdx > left){
            lIdx--;
            height = Math.min(height,numbers[lIdx]);
            max = Math.max(max,height *(rIdx-lIdx+1));
        }

        return max;
    }
}
