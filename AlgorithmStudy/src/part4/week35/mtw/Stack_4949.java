package part4.week35.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Stack_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<>();

        while(true){
            char[] input = br.readLine().toCharArray();
            if(input.length == 1 && input[0] == '.'){
                break;
            }
            String result = "yes";
            for(int i=0; i<input.length; i++){
                if(input[i]=='(' || input[i]=='['){
                    stack.push(input[i]);
                }else if(input[i]==')'){
                    if(stack.isEmpty()){
                        result = "no";
                        break;
                    }else if(stack.peek()=='('){
                        stack.pop();
                    }else{
                        stack.push(input[i]);
                    }
                }else if(input[i]==']'){
                    if(stack.isEmpty()){
                        result = "no";
                        break;
                    }else if(stack.peek()=='['){
                        stack.pop();
                    }else{
                        stack.push(input[i]);
                    }
                }
            }

            if(result.equals("yes") && !stack.isEmpty()){
                result = "no";
            }
            bw.write(result+"\n");
            stack.clear();
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
