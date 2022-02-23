package part4.week36.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// AC
public class Queue_5430 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            char[] input = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            int[] array = new int[n];
            if(n>0){
                array = Arrays.stream(br.readLine().replaceAll("\\[|\\]", "").split(",")).mapToInt(Integer::parseInt).toArray();
            }else{
                br.readLine();
            }
            Deque<Integer> deque = new LinkedList<>();
            for(int j=0; j<array.length; j++){
                deque.offerLast(array[j]);
            }
            boolean isError = false;
            boolean isFront = true;
            for(int j=0; j<input.length; j++){
                if(input[j] == 'R'){
                    isFront = !isFront;
                }else{
                    if(deque.isEmpty()){
                        bw.write("error\n");
                        isError = true;
                        break;
                    }
                    if(isFront){
                        deque.pollFirst();
                    }else{
                        deque.pollLast();
                    }
                }
            }
            if(isError) continue;

            ArrayList<String> result = new ArrayList<>();
            while(!deque.isEmpty()){
                if(isFront){
                    result.add(deque.pollFirst()+"");
                }else{
                    result.add(deque.pollLast()+"");
                }
            }

            bw.write("["+String.join(",", result)+"]\n");
        }
        
    	br.close();
    	bw.flush();
    	bw.close();
    }
}