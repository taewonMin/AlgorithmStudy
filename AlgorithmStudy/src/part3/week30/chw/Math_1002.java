package part3.week30.chw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine()); 
        for(int i = 0; i < testCase; i++) {
        	String[] coordinateArr = br.readLine().split(" ");
        	int x1 = Integer.parseInt(coordinateArr[0]);
        	int y1 = Integer.parseInt(coordinateArr[1]);
        	int r1 = Integer.parseInt(coordinateArr[2]);
        	int x2 = Integer.parseInt(coordinateArr[3]);
        	int y2 = Integer.parseInt(coordinateArr[4]);
        	int r2 = Integer.parseInt(coordinateArr[5]);
        	
        	if(x1 == x2 && y1 == y2) {
    			System.out.println(r1 == r2 ? -1 : 0);
        		continue;
        	}
        	
        	int dotLength = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        	
        	double d = Math.sqrt(dotLength);
        	if(r1 + r2 == d || Math.abs(r1 - r2) == d) {
        		System.out.println(1);
        	}else if(r1 + r2 > d && Math.abs(r1 - r2) < d) {
        		System.out.println(2);
        	}else {
        		System.out.println(0);
        	}
        }
        br.close();
    }
}
