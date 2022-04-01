package part4.week40.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
//37412	432
public class PQ_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->-Integer.compare(a,b));
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x==0){
                sb.append((maxHeap.isEmpty() ? 0 : maxHeap.poll()) +"\n");
            }else {
                maxHeap.add(x);
            }
        }
        System.out.println(sb);
    }
}
