package part4.week36.psw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        StringBuffer sb = new StringBuffer("<");
        int idx = 1;
        while (!queue.isEmpty()){
            if (idx == k){
                sb.append(queue.poll()+", ");
                idx=1;
            }

            queue.add(queue.poll());
            idx++;
            if (queue.size()==1) sb.append(queue.poll()+">");
        }
        System.out.println(sb);
    }
}