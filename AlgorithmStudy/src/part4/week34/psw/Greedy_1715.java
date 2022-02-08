package part4.week34.psw;

import java.util.PriorityQueue;
import java.util.Scanner;
//	91452	844
public class Greedy_1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        int answer = 0;
        while (queue.size() > 2){
            int a = queue.poll(), b = queue.poll();
            queue.add(a+b);
            answer += a+b;
        }

        while (!queue.isEmpty()) answer += queue.poll();;
        if (n==1) answer = 0;
        System.out.println(answer);
    }
}
