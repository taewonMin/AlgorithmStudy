package part2.week16.mtw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class DS_1966 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] answer = new int[num];
		
		for(int i=0; i<num; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			Queue<Integer> queue = new LinkedList<>(); 
			List<Integer> sortList = new ArrayList<>();
			for(int j=0; j<N; j++) {
				int importance = sc.nextInt();
				queue.offer(importance);
				sortList.add(importance);
			}
			sortList.sort((a,b) -> a.compareTo(b)*-1);
			
			int cnt = 0;
			while(queue.isEmpty() == false) {
				int firstNum = queue.poll();
				M--;
				if(sortList.get(0) == firstNum) {
					sortList.remove(0);
					cnt++;
					if(M == -1) {
						answer[i] = cnt;
						break;
					}
				}else {
					queue.offer(firstNum);
					if(M == -1) {
						M = queue.size()-1;
					}
				}
			}
		}
		
		for(int i : answer) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
