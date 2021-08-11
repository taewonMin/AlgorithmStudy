package part1.week8_sort.psw;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sort_18868 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IndexSize[][] planets = new IndexSize[sc.nextInt()][sc.nextInt()];
		for (int i = 0; i < planets.length; i++) {
			
			for (int j = 0; j < planets[i].length; j++) {
				planets[i][j] = new IndexSize(j, sc.nextInt());
			}
			
			Arrays.sort(planets[i],(IndexSize a, IndexSize b)-> a.size - b.size);
		}
		
		Map<String, Integer> answer = new HashMap<String, Integer>();
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < planets.length; i++) {
			for (int j = 0; j < planets[i].length; j++) {
				sb.append(planets[i][j].index);
			}
			answer.put(sb.toString(), answer.get(sb.toString()) == null? 1: answer.get(sb.toString()) +1);
			sb = new StringBuffer();
		}
		int s =0;
		for (String key : answer.keySet()) {
			if(answer.get(key) > 1) s++;
		}
		
		System.out.println(s);
		sc.close();
	}
}

class IndexSize{
	public int index = 0;
	public int size = 0;
	
	public IndexSize(int index, int size) {
		this.index = index;
		this.size = size;
	}
}