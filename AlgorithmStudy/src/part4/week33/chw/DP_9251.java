package part4.week33.chw;

import java.io.*;

public class DP_9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int[][] arr = new int[str1.length()+1][str2.length()+1];
        
        for(int i = 1; i <= str1.length(); i++) {
        	for(int j = 1; j <= str2.length(); j++) {
        		if(str1.charAt(i-1) == str2.charAt(j-1)) {
        			arr[i][j] = arr[i-1][j-1] + 1; 
        		}else {
        			arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
        		}
        	}
        }
        bw.write(String.valueOf(arr[str1.length()][str2.length()]));
        br.close();
        bw.flush();
        bw.close();
    }
}