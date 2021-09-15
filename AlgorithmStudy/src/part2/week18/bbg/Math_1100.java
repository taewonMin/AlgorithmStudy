package part2.week18.bbg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 하얀칸 12828kb 124ms */
public class Math_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        for(int x = 0 ; x < 8 ; x++) { // line
        	char[] arr = br.readLine().toCharArray();
        	for(int y = 0 ; y < arr.length ; y++) {
        		if((x%2 == 0 && y%2 == 0)||x%2 == 1 && y%2 == 1) if(arr[y] == 'F') cnt++;
        	}
        }
        System.out.println(cnt);
        br.close();

    }
}
