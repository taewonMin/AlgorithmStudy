package part3.week23.psw;

import java.util.PriorityQueue;
import java.util.Scanner;
//156136kb	2720ms
public class Sort_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Object[]> queue = new PriorityQueue<Object[]>((x,y) -> {
            if ((int)x[0]==(int)y[0]) return Integer.compare((int)x[1],(int)y[1]);
            return Integer.compare((int)x[0],(int)y[0]);
        });

        for (int i = 0; i < n; i++) {
            queue.add(new Object[]{ sc.nextInt(),i, sc.next()});
        }

        while (!queue.isEmpty()) {
            Object[] item = queue.poll();
            System.out.println((int)item[0] +" "+ (String)item[2]);
        }

        sc.close();
    }
}
