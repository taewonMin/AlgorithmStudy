package part3.week21.jje;

import java.util.Scanner;
import java.util.Stack;

public class Recursion_10829 {

    static long result = 0;
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        recursion(n);
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            System.out.print(stack.pop());
        }

        sc.close();
    }


    static void recursion (long n) {
        result = n / 2;
        stack.push((int)n % 2);
        if (result > 0) {
            recursion(result);
        } else {
            return;
        }
    }
}
