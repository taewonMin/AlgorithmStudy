package part4.week35.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

// 스택 수열
public class Stack_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int nextNum = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(stack.isEmpty() || stack.peek() < num){
                int loopCount = num-nextNum+1;
                for(int j=0; j<loopCount; j++){
                    stack.push(nextNum++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }else if(stack.peek() == num){
                stack.pop();
                sb.append("-\n");
            }else{
                bw.write("NO");
                bw.flush();
                return;
            }
        }
        bw.write(sb.toString());

        br.close();
        bw.flush();
        bw.close();
    }
}
