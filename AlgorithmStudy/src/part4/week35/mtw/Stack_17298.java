package part4.week35.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;

// 오큰수 1148ms
public class Stack_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] answer = new int[N];
        Stack<NGE> stack = new Stack<>();
        for(int i=0; i<input.length; i++){
            if(!stack.isEmpty() && stack.peek().number < input[i]){
                while(!stack.isEmpty() && stack.peek().number < input[i]){
                    answer[stack.pop().index] = input[i];
                }
            }
            stack.push(new NGE(input[i], i));
        }

        while(!stack.isEmpty()){
            answer[stack.pop().index] = -1;
        }

        for(int ans : answer){
            bw.write(ans + " ");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}

class NGE{
    int number;
    int index;

    NGE(int number, int index){
        this.number = number;
        this.index = index;
    };
}