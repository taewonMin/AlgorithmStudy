package part4.week35.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;


public class Stack_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int K = Integer.parseInt(br.readLine());
        for(int i=0; i<K; i++){
            int number = Integer.parseInt(br.readLine());
            if(number == 0){
                stack.pop();
            }else{
                stack.push(number);
            }
        }

        // sum 252ms
        bw.write(stack.stream().mapToInt(Integer::intValue).sum()+"");

        // reduce 256ms
        // bw.write(stack.stream().reduce(0, Integer::sum)+"");

        // loop 252ms
        // int sum = 0;
        // for(int num : stack){
        //     sum += num;
        // }
        // bw.write(sum+"");

        br.close();
        bw.flush();
        bw.close();
    }
}
