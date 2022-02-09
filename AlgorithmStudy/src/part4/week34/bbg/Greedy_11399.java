package part4.week34.bbg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Greedy_11399 { // 12240KB 100ms 868B
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	int[] times = new int[N];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	for(int i=0 ; i < N ; i++) 
    		times[i] = Integer.parseInt(st.nextToken());
    	
    	Arrays.sort(times);
    	
    	int result = 0;
    	for(int i=0 ; i<times.length ; i++) {
    		for(int j=0 ; j<i+1 && j<times.length; j++) {
    			result += times[j];
    		}
    	}
    	
    	br.close();
    	bw.write(String.valueOf(result));
    	bw.flush();
    	bw.close();
    	
    }
}
//public class Greedy_11399 { // 19024KB 272ms 762B
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int N = Integer.parseInt(br.readLine());
//		String[] temp = br.readLine().split(" ");
//		int[] times = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();
//		Arrays.sort(times);
//		
//		int result = 0;
//		for(int i=0 ; i<times.length ; i++) {
//			for(int j=0 ; j<i+1 && j<times.length; j++) {
//				result += times[j];
//			}
//		}
//		
//		br.close();
//		bw.write(String.valueOf(result));
//		bw.flush();
//		bw.close();
//		
//	}
//}
