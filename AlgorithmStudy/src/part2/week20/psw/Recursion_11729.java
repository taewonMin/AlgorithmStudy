package part2.week20.psw;

import java.util.Scanner;
import java.util.Stack;

public class Recursion_11729 {
    static Stack<Integer>[] stacks = new Stack[3];
    static int n = 0;
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = 2;
        for (int i = 0; i < stacks.length; i++) stacks[i] = new Stack<>();
        for (int i = 0; i < n; i++) stacks[0].add(n-i);

        sb.append(((int)Math.pow(2,n)-1)+"\n");
        recursion(n,1,2, 3);
        System.out.println(sb.toString());
        sc.close();
    }

    private static void recursion(int cnt, int a, int b, int c) {
        if(cnt == 1){
            move(a,c);
        }else {
            recursion(cnt-1,a, c, b);
            move(a,c);
            recursion(cnt-1,b, a, c);
        }
    }

    public static void move(int from, int to){
        stacks[to-1].add(stacks[from-1].pop());
        sb.append(from +" " +to+"\n");
    }
}
