package part4.week35.psw;

import java.util.Scanner;

public class Stack_10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String push = "push", top = "top", size = "size", empty = "empty";
        int n = Integer.parseInt(sc.nextLine()), idx = -1;
        int[] numbers = new int[n];
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            int out = 0;
            if (push.equals(command[0])){
                numbers[++idx] = Integer.parseInt(command[1]);
            }else if (top.equals(command[0])){
                out = idx==-1 ? -1 : numbers[idx];
            }else if (size.equals(command[0])){
                out = idx+1;
            }else if (empty.equals(command[0])){
                out = idx == -1 ? 1 : 0;
            }else {
                out = idx == -1 ? -1 : numbers[idx--];
            }
            if (!push.equals(command[0])) sb.append(out+"\n");
        }
        System.out.println(sb);
    }
}
