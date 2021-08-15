package part2.week14.psw;

import java.util.LinkedList;
import java.util.Scanner;

public class DS_1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int answer = 0;
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 0; i < n; i++) queue.add(i+1); 
		
		
		for (int i = 0; i < m; i++) {
			Integer targetIdx = sc.nextInt();
			

			while (targetIdx != queue.peek()) {			
				if(queue.indexOf(targetIdx) <= queue.size()/2)  queue.addLast(queue.removeFirst()); // 2번 연산
 				else  queue.addFirst(queue.removeLast()); // 3번 연산
				answer++;
			}
			queue.poll();
			
		}
		System.out.println(answer);
		
		sc.close();
	}
}
