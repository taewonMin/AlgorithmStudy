package week4_sort.bbg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sort_18310 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] locations = new int[N];
		
		for(int cnt = 0; cnt < N ; cnt++) {
			locations[cnt] = sc.nextInt();
		}
		
		Map<Integer,Integer> antennaMap = new HashMap<Integer,Integer>();
		int antenna = 0;
		for(int temp = 0; temp < N ; temp++) {
			int sum = 0;
			for(int idx = 0; idx < N ; idx++) {
				sum += Math.abs((Math.abs(locations[temp]) - Math.abs(locations[idx])));
			}
			antennaMap.put(temp, sum);
		}
		
		List<Map.Entry<Integer, Integer>> entries = antennaMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
		
		for(Map.Entry<Integer, Integer> entry : entries) {
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}
		
		System.out.println(locations[entries.get(0).getKey()]);
		
		sc.close();
	}
	
}
