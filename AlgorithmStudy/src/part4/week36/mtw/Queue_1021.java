package part4.week36.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// 회전하는 큐
public class Queue_1021 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
        
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        
        Deque<Integer> deque = new LinkedList<>();
    	for(int i=1; i<=N; i++) {
            deque.offerLast(i);
    	}

        int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        for(int i=0; i<numbers.length; i++){
            int frontCnt = 0;
            int backCnt = 0;
            int[] array = deque.stream().mapToInt(Integer::intValue).toArray();
            for(int j=0; j<array.length; j++){
                if(numbers[i] == array[j]){
                    frontCnt = j;
                    backCnt = array.length-j;
                    break;
                }
            }
            if(frontCnt < backCnt){
                for(int j=0; j<frontCnt; j++){
                    deque.offerLast(deque.pollFirst());
                }
            }else{
                for(int j=0; j<backCnt; j++){
                    deque.offerFirst(deque.pollLast());
                }
            }
            result += Math.min(frontCnt, backCnt);
            deque.pollFirst();
        }

        bw.write(result+"");

    	br.close();
    	bw.flush();
    	bw.close();
    }
}