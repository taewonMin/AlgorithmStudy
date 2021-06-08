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
		List<Integer> list = new ArrayList<Integer>();
		for(int prioritie : priorities) {
			queue.add(prioritie);
			list.add(prioritie);
		}
		
		
		
//		Collections.sort(list,Collections.reverseOrder());
//		
//		for(int i = 0; i < priorities.length; i++) {
//			if(priorities[i] >= list.get(0)){
//				queue.remove();
//				list.remove(0);
//			}else {
//				
//			}
//		}
		int temp = 0;
		for(int i = 0; i < location; i++) {
			temp = priorities[i];
		}
	}
}