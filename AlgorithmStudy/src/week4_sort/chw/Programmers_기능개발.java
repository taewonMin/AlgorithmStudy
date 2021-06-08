package week4_sort.chw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Programmers_기능개발 {
	public static void main(String[] args) {
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		int j = 0;
		int cnt = 0;
		Queue<Integer> queue = new LinkedList<>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int progresse : progresses) {
			queue.add(progresse);
		}
		
		for(int i = 0; i < speeds.length; i++) {
			if(j > 0) {
				if(queue.peek() + speeds[i] * j >= 100) {
					cnt++;
					queue.remove();
					if(queue.isEmpty()) {
						list.add(cnt);
					}
					continue;
				}else {
					list.add(cnt);
					j = 0;
					cnt = 0;
					i--;
				}
			}else {
				j = (100 - queue.peek()) % speeds[i] == 0 
						? (100 - queue.peek()) / speeds[i] : (100 - queue.peek()) / speeds[i] +1;
				cnt++;
				queue.remove();
				if(queue.isEmpty()) {
					list.add(cnt);
				}
			}
		}

		int[] answer = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
			System.out.println(answer[i]);
		}
	}
}

