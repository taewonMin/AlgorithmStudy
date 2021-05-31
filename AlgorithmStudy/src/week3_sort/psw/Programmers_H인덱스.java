package week3_sort.psw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programmers_H인덱스 {
	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		int answer = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < citations.length; i++) {
			list.add(citations[i]);
		}
		Collections.sort(list, new sort());
		for (int i = 0; i < list.size(); i++) {
			int h=list.get(i);
			if(h <= (1+i)) {
				answer = list.get(i);
				break;
			}
		}
	}
}

class sort implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}