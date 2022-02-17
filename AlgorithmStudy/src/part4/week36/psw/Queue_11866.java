package part4.week36.psw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//	23820	156
public class Queue_11866 {
    public static void main(String[] args) {
        // 시간복잡도 2N으로 해결이 가능 할까? 몰겠는뎅
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        StringBuffer sb = new StringBuffer("<");

        while (queue.size() != 1){
            for (int i = 0; i < k-1; i++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll()+", ");
        }

        sb.append(queue.poll()+">");
        System.out.println(sb);
    }
}