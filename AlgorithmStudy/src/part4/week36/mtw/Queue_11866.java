import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// 요세푸스 문제 0
public class Queue_11866 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
        String[] input = br.readLine().split(" ");
    	int N = Integer.parseInt(input[0]);
    	int K = Integer.parseInt(input[1]);

        Queue<String> queue = new LinkedList<>();
    	for(int i=1; i<=N; i++) {
    		queue.offer(i+"");
    	}
        
        ArrayList<String> result = new ArrayList<>();
        while(!queue.isEmpty()){
            for(int i=0; i<K-1; i++){
                queue.offer(queue.poll());
            }
            result.add(queue.poll());
        }
        
        bw.write("<"+String.join(", ", result)+">");
    			
    	br.close();
    	bw.flush();
    	bw.close();
    }
}