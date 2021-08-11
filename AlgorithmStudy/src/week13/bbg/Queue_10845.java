package week13.bbg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_10845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		
		for(int cnt = 0 ; cnt < N ; cnt++) {
			switch (sc.next()) {
			case "push":
//				que.add(sc.nextInt());
				que.offer(sc.nextInt());
				break;
			case "pop":
				if(que.poll() != null && !"".equals(que.poll())) {
					System.out.println(-1);
				}else {
					System.out.println(que.poll());
				}
				break;
			case "size":
				System.out.println(que.size());
				break;
			case "empty":
				if(que.isEmpty()) { // 없으면 true
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "front": // 먼저 넣은거
//				for() {
//					
//				}
//				break;
			case "back": // 나중에 넣은거
				if(que.peek() != null && !"".equals(que.peek())) {
					System.out.println(que.peek());
				}else {
					System.out.println(-1);
				}
				break;
			}
			
		}
		
		sc.close();
	}
}
