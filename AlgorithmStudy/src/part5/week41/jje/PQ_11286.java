package part5.week41.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) > Math.abs(o2)) return 1;
                else if (Math.abs(o1) == Math.abs(o2)) return o1-o2;
                else return -1;
            }
        });

        int x = 0;

        for (int i = 0; i < n; i++) {
            x = Integer.parseInt(br.readLine());
            if (x == 0) {
                if (maxQueue.isEmpty()) System.out.println(0);
                else System.out.println(maxQueue.poll());

            } else {
                maxQueue.add(x);
            }
        }
    }
}