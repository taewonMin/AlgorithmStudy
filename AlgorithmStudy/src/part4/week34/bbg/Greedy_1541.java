package part4.week34.bbg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Greedy_1541 { // 11648KB 76ms 1281B
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine(),"+|-",true);
    	String[] tokens = new String[st.countTokens()];
    	int[][] sums = new int[(tokens.length+1)/2][2]; // -연산자 있을 때마다 합계 담을 배열
    	int result = 0; // 결과 담을 변수
    	int idx = 0; // 인덱스 변수
    	
    	while(st.hasMoreTokens()) tokens[idx++] = st.nextToken();
    	
    	idx = 0;
    	for(int i=0 ; i<sums.length && idx<tokens.length ; i++) {
    		boolean flag = true;
    		for(int j = 0 ; idx<tokens.length && flag ; j++) {
    			if(j%2 == 0) {
    				sums[i][0] += Integer.parseInt(tokens[idx++]);
    			} else if("-".equals(tokens[idx++])) {
    				flag = false;
    				sums[i+1][1] = 1;
    			}
    		}
    	}
    	
    	for(int i=0 ; i<sums.length ; i++) {
    		result = sums[i][1] == 1 ? result - sums[i][0] : result + sums[i][0];
    	}
    	
    	br.close();
    	bw.write(String.valueOf(result));
    	bw.flush();
    	bw.close();
    }
}


