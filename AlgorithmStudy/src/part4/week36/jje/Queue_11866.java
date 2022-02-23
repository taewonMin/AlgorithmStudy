package part4.week36.jje;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        sb.append("<");
        while (queue.size() != 1) {
            for (int i = 0; i < k-1; i++) {
                int first = queue.poll();
                queue.add(first);
            }
            sb.append(queue.poll() + ", ");
        }
        sb.append(">");

        System.out.println(sb);
    }
}
