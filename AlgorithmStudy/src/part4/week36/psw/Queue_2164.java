package part4.week36.psw;

import java.util.LinkedList;
import java.util.Queue;

//44280	164
public class Queue_2164 {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1){
            queue.poll();
            if (queue.size()==1) break;
            queue.add(queue.poll());
        }
        System.out.println(queue.peek());
    }
}
