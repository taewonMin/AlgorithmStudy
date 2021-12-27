package part3.week30.chw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Math_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
        	int[] arr = new int[3];
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int idx = 0;
        	while(st.hasMoreTokens()) {
        		arr[idx] = Integer.parseInt(st.nextToken());
        		idx++;
        	}
        	Arrays.sort(arr);
        	if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;
        	System.out.println(arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2] ? "right" : "wrong");
        }
        br.close();
    }
}