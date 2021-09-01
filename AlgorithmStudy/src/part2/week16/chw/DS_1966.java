package part2.week16.chw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DS_1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for(int i = 0; i < cnt; i++) {
			int docuCnt = sc.nextInt();
			int order = sc.nextInt();
			Queue<Integer> queue = new LinkedList<Integer>();
			Integer[] arr = new Integer[docuCnt];
			for(int j = 0; j < docuCnt; j++) {
				int printNum = sc.nextInt();
				arr[j] = printNum; 
				queue.offer(printNum);
			}
			Arrays.sort(arr,Collections.reverseOrder());
			Iterator<Integer> iter = queue.iterator();
			int idx = 0; 
			while(iter.hasNext()) {
				int num = iter.next();
				if(arr[idx] != num) {
					queue.offer(queue.poll());
					order--;
					if(order < 0) order = docuCnt -1;
				}else {
					queue.poll();
					idx++;
				}
			}
			
			
			
		}
		sc.close();
	}
}
