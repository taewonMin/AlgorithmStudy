package part4.week35.psw;

import java.util.Scanner;
import java.util.Stack;

//	13456	136
public class Stack_1874 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char[] data = sc.next().toCharArray();
            Stack<Character> stack = new Stack<>();
            String answer = "YES";
            for (int j = data.length-1; j > -1; j--) {
                if (data[j]==')') {
                    stack.push(')');
                } else {
                    if (!stack.isEmpty()){
                        stack.pop();
                    }else {
                        answer="NO";
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) answer = "NO";
            System.out.println(answer);
        }
    }
}