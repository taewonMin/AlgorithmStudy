package part4.week35.psw;

import java.util.Scanner;
import java.util.Stack;
//	28756	316
public class Stack_4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer();
        while (!str.equals(".")){
            Stack<Character> stack = new Stack<>();
            String answer = "yes";
            for (int i = str.length()-1; i > -1 ; i--) {
                char ch = str.charAt(i);
                if (ch == ')' || ch == ']'){ stack.push(ch); }
                if (ch == '('){
                    if (!stack.isEmpty() && ')' == stack.peek()){
                        stack.pop();
                    }else {
                        answer = "no";
                    }
                }
                if (ch == '['){
                    if (!stack.isEmpty() && ']' == stack.peek()){
                        stack.pop();
                    }else {
                        answer = "no";
                    }
                }
            }
            if (!stack.isEmpty()) answer = "no";
            sb.append(answer+"\n");
            str = sc.nextLine();
        }

        System.out.println(sb);
    }
}
