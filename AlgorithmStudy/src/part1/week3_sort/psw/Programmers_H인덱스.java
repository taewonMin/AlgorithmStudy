package part1.week3_sort.psw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers_H인덱스 {
	public static void main(String[] args) {
		int[] citations = {10,11,12,13};
		int answer = citations.length;
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < citations.length; i++) {
			list.add(citations[i]);
		}
		
		list.sort(Collections.reverseOrder());
		
		while(answer > 0 && citations[answer-1] < answer) {
        	answer--;
        }
		
		/*
		 * answer = n == 1 ? (list.get(0) > 0 ? 1 : 0) : 0; for (int i = 0; i < n; i++)
		 * { int k = list.get(i); if(k <= n-i) { answer = k; if(i+1 < n) { int q =
		 * list.get(i+1); for (int j = 0; j < q-k; j++) {
		 * 
		 * if(q - (j+1) < n-i) { answer = q - (j+1); break; } } } } } if(list.get(0) >
		 * n) answer = n;
		 */
        
        
		System.out.println(answer);
	}
}

