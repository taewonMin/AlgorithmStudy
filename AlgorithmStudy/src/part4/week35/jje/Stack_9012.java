package part4.week35.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            Stack<String> stack = new Stack<>();
            String result = "";
            for (int j = 0; j < temp.length(); j++) {
                if(temp.charAt(j) == '('){
                    stack.push("(");
                } else if (stack.isEmpty()){
                    result = "NO";
                } else {
                    stack.pop();
                }
            }
            if (result.equals("")){
                result = stack.isEmpty() ? "YES" : "NO";
            }
            System.out.println(result);
        }
    }
}
