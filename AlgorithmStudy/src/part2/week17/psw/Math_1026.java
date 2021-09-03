package part2.week17.psw;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Math_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int answer = 0;
        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>((o1, o2) -> -Integer.compare(o1,o2));
        for (int i = 0; i < N; i++) {
            a.add(sc.nextInt());
        }
        for (int i = 0; i < N; i++) {
            b.add(sc.nextInt());
        }
        for (int i = 0; i < N; i++) {
            answer +=a .poll()*b.poll();
        }
        System.out.println(answer);
        sc.close();
    }
}