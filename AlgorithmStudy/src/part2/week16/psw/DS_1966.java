package part2.week16.psw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DS_1966 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int caseCnt = sc.nextInt();
		for (int i = 0; i < caseCnt; i++) {
			
			int n = sc.nextInt();
			int idx = sc.nextInt();
			
			Queue<Integer[]> priorities = new LinkedList<Integer[]>();
			for (int j = 0; j < n; j++) {
				priorities.offer(new Integer[]{j,sc.nextInt()});
			}
			
			int answer = 0;
			while(!priorities.isEmpty()) {
				Integer[] poll = priorities.poll();
				boolean isPrinted = true;
				for (Integer[] integer : priorities) {
					if(integer[1] > poll[1]) {
						isPrinted = false;
						priorities.offer(poll);
						break;
					}
				}
				
				if(isPrinted) answer++;
				if(isPrinted && poll[0] == idx) break;
			}
			
			System.out.println(answer);
		}
		
		sc.close();
	}
}
