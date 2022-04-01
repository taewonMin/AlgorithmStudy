package part4.week40.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

//30136	440
public class PQ_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b)->{
            if (Math.abs(a) == Math.abs(b)){
                return Integer.compare(a,b);
            }
            return Integer.compare(Math.abs(a),Math.abs(b));
        });
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            if (x==0){
                sb.append((priorityQueue.isEmpty() ? 0 : priorityQueue.poll()) +"\n");
            }else {
                priorityQueue.add(x);
            }
        }
        System.out.println(sb);
    }
}
