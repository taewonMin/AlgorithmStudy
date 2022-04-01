package part4.week40.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class PQ_1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->-Integer.compare(a,b));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (maxHeap.size()==minHeap.size()){
                maxHeap.add(x);
            }else {
                minHeap.add(x);
            }

            if (!maxHeap.isEmpty() && !minHeap.isEmpty() && minHeap.peek() < maxHeap.peek()){
                int temp = minHeap.poll();
                minHeap.add(maxHeap.poll());
                maxHeap.add(temp);
            }

            sb.append(maxHeap.peek() +"\n");
        }



//        LinkedList<Integer> list = new LinkedList<>(); 이분 탐색으로는 시간초과
//        for (int i = 0; i < n; i++) {
//            int x = Integer.parseInt(br.readLine());
//            int idx = bs(x,list);
//            list.add(idx,x);
//            sb.append(list.get(i/2)+"\n");
//        }

        System.out.println(sb);
    }

    private static int bs(int x, LinkedList<Integer> list) {
        int start = 0, end = list.size()-1;
        while (start <= end){
            int mid = (start+end)/2;
            if (list.get(mid) <= x){
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return start;
    }
}
/*
1
1 5
1 2 5
1 2 5 10
-99 1 2 5 10
-99 1 2 5 7 10
-99 1 2 5 5 7 10


1                   // 1
1 5                 // 3
2 1 5               // 2
2 5 1 10            // 4
2 1 5 -99 10        // -16
5 2 5 1 7 -99 10    // -12
 */