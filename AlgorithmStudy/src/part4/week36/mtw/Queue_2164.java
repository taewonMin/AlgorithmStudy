package part4.week36.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

// 카드2
public class Queue_2164 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
    	for(int i=1; i<=N; i++) {
    		queue.offer(i);
    	}
        while(true){
            int num = queue.poll();
            if(queue.isEmpty()){
                bw.write(num+"");
                break;
            }
            queue.offer(queue.poll());
        }
    			
    	br.close();
    	bw.flush();
    	bw.close();
    }
}