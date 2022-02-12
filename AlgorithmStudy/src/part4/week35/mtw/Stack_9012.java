package part4.week35.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

// 괄호
public class Stack_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> stack = new Stack<Character>();
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
        	for(char brace : br.readLine().toCharArray()) {
        		if(brace == '(') {
        			stack.push(brace);
        		}else {
        			if(stack.isEmpty()) {
        				stack.push(brace);
        				break;
        			}else if(stack.peek() == '(') {
        				stack.pop();
        			}else {
        				stack.push(brace);
        			}
        		}
        	}
        	bw.write(stack.isEmpty() ? "YES":"NO");
        	bw.newLine();
        	stack.clear();
        }
        
        br.close();
        bw.flush();
        bw.close();
    }
}
