package week13.chw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_10845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();  
		int idx = 0;
		int lastQueue = 0;
		Queue<Integer> queue = new LinkedList<>();
 		while(idx < cnt) {
			String action = sc.next();
			if("push".equals(action)) {
				lastQueue = sc.nextInt();
				queue.add(lastQueue);
			}else if("pop".equals(action)) {
				System.out.println(queue.isEmpty() ? -1 : queue.poll());
			}else if("size".equals(action)) {
				System.out.println(queue.size());
			}else if("empty".equals(action)) {
				System.out.println(queue.isEmpty() ? 1 : 0);
			}else if("front".equals(action)) {
				System.out.println(queue.isEmpty() ? -1 : queue.peek());
			}else if("back".equals(action)) {
				System.out.println(queue.isEmpty() ? -1 : lastQueue);
			}
			idx++;
		}
		sc.close();
	}
}
	
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	
//	int cnt = sc.nextInt();  
//	int idx = 0;
//	int lastQueue = 0;
//	Queue<Integer> queue = new LinkedList<>();
//		while(idx < cnt) {
//		String action = sc.next();
//		if("push".equals(action)) {
//			lastQueue = sc.nextInt();
//			queue.add(lastQueue);
//		}else if("pop".equals(action)) {
//			System.out.println(queue.isEmpty() ? -1 : queue.poll());
//		}else if("size".equals(action)) {
//			System.out.println(queue.size());
//		}else if("empty".equals(action)) {
//			System.out.println(queue.isEmpty() ? 1 : 0);
//		}else if("front".equals(action)) {
//			System.out.println(queue.isEmpty() ? -1 : queue.peek());
//		}else if("back".equals(action)) {
//			System.out.println(queue.isEmpty() ? -1 : lastQueue);
//		}
//		idx++;
//	}
//	sc.close();
//}



//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	
//	int cnt = sc.nextInt();  
//	int idx = 0;
//	int lastQueue = 0;
//	Queue<Integer> queue = new LinkedList<>();
//		while(idx < cnt) {
//		
//		switch(sc.next()) {
//			case "push":
//				lastQueue = sc.nextInt();
//				queue.add(lastQueue);
//				break;
//			case "pop":
//				System.out.println(queue.isEmpty() ? -1 : queue.poll());
//				break;
//			case "size":
//				System.out.println(queue.size());
//				break;
//			case "empty":
//				System.out.println(queue.isEmpty() ? 1 : 0);
//				break;
//			case "front":
//				System.out.println(queue.isEmpty() ? -1 : queue.peek());
//				break;
//			case "back":
//				System.out.println(queue.isEmpty() ? -1 : lastQueue);
//				break;
//		}
//		idx++;
//	}
//	sc.close();
//}



/*
파이썬 시간초과

from collections import deque

input_action = [input().strip() for _ in range(int(input()))]
queue = deque([])
for action in input_action:
    if action.startswith('push'):
        queue.append(action.split(' ')[1])
    elif action == 'pop':
        print(-1 if len(queue) == 0 else queue.popleft())
    elif action == 'size':
        print(len(queue))
    elif action == 'empty':
        print(1 if len(queue) == 0 else 0)
    elif action == 'front':
        print(-1 if len(queue) == 0 else queue[0])
    elif action == 'back':
        print(-1 if len(queue) == 0 else queue[len(queue)-1])
*/