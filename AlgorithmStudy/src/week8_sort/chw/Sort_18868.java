package week8_sort.chw;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sort_18868 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		int cnt = in.nextInt();
		int planetCnt = in.nextInt();
		int result = 0;
		
		for(int i = 0; i < cnt; i++) {
			
			int[] planet = new int[planetCnt];
			for(int j = 0; j < planetCnt; j++) {
				planet[j] = in.nextInt();
			}
			Arrays.sort(planet);
			Map<String, Integer> map = new HashMap<>();
			for(int j = 0; j < planetCnt; j++) {
				map.put(planet[j]+"", j+1);
			}
			
			
		}
		
		in.close();
	}
}
