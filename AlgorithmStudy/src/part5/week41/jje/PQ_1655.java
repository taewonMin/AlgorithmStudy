package part5.week41.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ_1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());

            if(maxQueue.size() == minQueue.size()) {
                maxQueue.add(a);

                if(!minQueue.isEmpty() && maxQueue.peek() > minQueue.peek()) {
                    minQueue.add(maxQueue.poll());
                    maxQueue.add(minQueue.poll());
                }
            } else {
                minQueue.add(a);

                if (maxQueue.peek() > minQueue.peek()) {
                    minQueue.add(maxQueue.poll());
                    maxQueue.add(minQueue.poll());
                }
            }
            System.out.println(maxQueue.peek());
        }
    }
}