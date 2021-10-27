package part3.week23.chw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Search_10816 {
  public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    Map<String, Integer> map = new HashMap<String, Integer>();
    String[] numbers = br.readLine().split(" ");
    for(String num : numbers) {
    	if(map.get(num) == null) {
    		map.put(num, 1);
    	}else {
    		map.put(num, map.get(num) + 1);
    	}
    }
    int M = Integer.parseInt(br.readLine());
    String[] numArr = br.readLine().split(" ");
    for(String num : numArr) {
    	System.out.print((map.get(num) == null ? 0 : map.get(num)) + " ");
    }
}
}
