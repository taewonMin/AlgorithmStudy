package part5.week47.psw;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoPointer_1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()[1];
        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);

        int start = numbers.length/2, end = (numbers.length/2)+1,  min = Integer.MAX_VALUE, sum  = 0;

        while (start > -1 && end < numbers.length){


        }

        System.out.println(min);
    }
}
