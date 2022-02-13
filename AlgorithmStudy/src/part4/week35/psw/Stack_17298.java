package part4.week35.psw;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stack_17298 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
                numbers[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()){
            numbers[stack.pop()] = -1;
        }

        StringBuffer sb = new StringBuffer();
        Arrays.stream(numbers).forEach((a)->sb.append(a+" "));
        System.out.println(sb);
    }
}
