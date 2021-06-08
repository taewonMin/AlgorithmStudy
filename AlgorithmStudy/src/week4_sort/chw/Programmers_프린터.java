package week4_sort.chw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Programmers_프린터 {
	public static void main(String[] args) {
		int[] priorities = {1, 1, 2, 5};
		int location = 2;
		int answer = 0;
		
		Queue<Integer> queue = new LinkedList<>();
//		List<Integer> list = new ArrayList<Integer>();
		for(int prioritie : priorities) {
			queue.add(prioritie);
//			list.add(prioritie);
		}
		
		Arrays.sort(priorities);
		
		for(int i = priorities.length - 1; i != 0; i-- ) {
			while(queue.peek() != priorities[i]) {
				if(priorities[i] != queue.peek()) {
					queue.add(queue.peek());
					queue.remove();
				}
			}
			answer++;
			queue.remove();
		}
		
	}
}