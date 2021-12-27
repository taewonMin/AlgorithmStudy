package part3.week30.phk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Math_4153 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	while (true) {
    		String arr[] = br.readLine().split(" ");
    		int a = Integer.parseInt(arr[0]);
    		int b = Integer.parseInt(arr[1]);
    		int c = Integer.parseInt(arr[2]);
    		
    		if(a == 0 && b == 0 && c == 0) break;
    		
			String result = a*a + b*b == c*c ? "right" : "wrong";
			bw.write(result);
			bw.newLine();
		}
    	
    	br.close();
        bw.flush();
        bw.close();
    }
}
