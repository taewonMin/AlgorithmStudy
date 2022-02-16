package part4.week35.bbg;

import java.io.*;
import java.util.Stack;

/**
 * 괄호
 * @author BBG
 * @since 2022.02.16
 * 12700KB 104ms 922B
 */
public class Stack_9012 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	Stack<String> stack = new Stack<>();
    	final String NO = "NO"; 
    	final String YES = "YES"; 
    	final String l = "(";
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i = 0 ; i < n ; i++) {
    		String[] arr = br.readLine().split("");
    		for(int j = 0 ; j < arr.length ; j++) {
    			if(l.equals(arr[j])) {
    				stack.push(l);
    			} else if(!stack.empty()){
					stack.pop();
    			} else {
    				stack.push(l);
    				break;
    			}
    		}
    		bw.write(stack.empty() ? YES : NO);
    		bw.newLine();
    		stack.clear();
    	}
    	
    	bw.flush();
    	br.close();
    	bw.close();
    }
}
