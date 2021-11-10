package part3.week25.bbg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DP_1003 {

	static StringBuffer sb = new StringBuffer();
	
	public static void main(String[] args) throws IOException {
		StringBuffer result = new StringBuffer();
		long bfTime = System.currentTimeMillis();
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int totLength = 0;
        int subLength = 0;
        
        while(T-- > 0) {	
	        fibonacci(Integer.parseInt(br.readLine()));
        	
	        totLength = sb.length();
	        subLength = sb.toString().replaceAll("0", "").length();
//	        int subLength = new String(sb).split("0").length;
	        result.append((totLength-subLength)+" "+subLength+"\n");
	        sb.setLength(0);
		}
        
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result.toString());
        bw.flush();
        
        long afTime = System.currentTimeMillis();
        // 메모리 체크..
        Runtime.getRuntime().gc();
        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(usedMemory + " bytes");
        System.out.println((afTime - bfTime) + " ms"); // 250ms 최대
        
        bw.close();
        
        
    }
    
	// 붙이다가 시간 다 잡아먹는거같다.
    static int fibonacci(int n) {
    	if(n == 0) {
    		sb.append("0");
    		return 0;
    	} else if (n == 1) {
    		sb.append("1");
    		return 1;
    	} else {
    		return fibonacci(n-1) + fibonacci(n-2);
    	}
    }
}
//public class DP_1003 {
//	
//	static StringBuffer sb = new StringBuffer();
//	static StringBuffer result = new StringBuffer();
//	
//	public static void main(String[] args) throws IOException {
//		long bfTime = System.currentTimeMillis();
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(br.readLine());
//		for(int i = 0 ; i < T ; i++) { 
//			int N = Integer.parseInt(br.readLine());
//			
//			fibonacci(N);
//			
//			int totLength = sb.length();
//			String arr[] = new String(sb).split("");
//			int cnt = 0;
//			for(String item : arr) {
//				if("0".equals(item)) cnt++;
//			}
////	        result.append(cnt+" "+(totLength-cnt)+"\n");
//			result.append(cnt).append(" ").append(totLength-cnt).append("\n");
//			sb.setLength(0);
//		}
//		br.close();
//		System.out.println(result);
//		
//		long afTime = System.currentTimeMillis();
//		// 메모리 체크..
//		Runtime.getRuntime().gc();
//		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
//		System.out.println(usedMemory + " bytes");
//		System.out.println((afTime - bfTime) + " ms"); // 250ms 최대
//		
//	}
//	
//	static int fibonacci(int n) {
//		if(n == 0) {
//			sb.append("0");
//			return 0;
//		} else if (n == 1) {
//			sb.append("1");
//			return 1;
//		} else {
//			return fibonacci(n-1) + fibonacci(n-2);
//		}
//	}
//}
