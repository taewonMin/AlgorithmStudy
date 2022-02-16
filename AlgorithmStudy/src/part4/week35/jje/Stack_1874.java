package part4.week35.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int last = 0;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input > last) {
                for (int j = last + 1; j <= input; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                last = input;
            } else {
                if (stack.peek() != input)   { //peek : 스택의 가장 위에 있는 항목을 반환
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            sb.append("-\n");
        }
        System.out.println(sb);
    }
}

/*
1234   -> 4 ++++-
123    -> 3 -
1256    -> 6 ++-
 */