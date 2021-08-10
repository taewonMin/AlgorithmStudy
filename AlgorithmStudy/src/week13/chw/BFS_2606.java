package week13.chw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_2606 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int computer = sc.nextInt();
		int network = sc.nextInt();
		int start = 1;
		int[][] arr2d = new int[computer+1][computer+1];
		boolean[] visit = new boolean[computer+1];
		
		for(int i = 0; i < network; i++) {
			int fir = sc.nextInt();
			int sec = sc.nextInt();
			arr2d[fir][sec] = 1;
			arr2d[sec][fir] = 1;
		}
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		visit[start] = true;
		int idx = 0;
		while(queue.size() != 0) { 
			int temp = queue.poll();
			if(temp != 1) idx++;
			for(int j = 1; j < computer + 1; j++) {
				if(arr2d[temp][j] == 1 && visit[j] == false) {
					queue.offer(j);
					visit[j] = true;
				}
			}
		}
		sc.close();
		System.out.println(idx);
	}
}
