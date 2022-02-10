package part4.week35.psw;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

//	101660	1060
public class Stack_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0, idx = 0;
        int[] numbers = Arrays.stream(new int[n]).map((a) -> sc.nextInt()).toArray();
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        while (cnt++ < n){
            stack.push(cnt);
            sb.append("+\n");

            while (!stack.isEmpty() && stack.peek() == numbers[idx]){
                stack.pop();
                sb.append("-\n");
                idx++;
            }
        }
        System.out.println(idx==n ? sb.toString() : "NO");
    }
}
