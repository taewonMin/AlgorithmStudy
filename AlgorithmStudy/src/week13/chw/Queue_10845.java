package week13.chw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_10845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = Integer.parseInt(sc.nextLine());
		Queue<Integer> queue = new LinkedList<>();
		int lastQueue = 0;
		for(int i = 0; i < cnt; i++) {
			String action = sc.nextLine().trim();
			if (action.startsWith("push")) {
				queue.add(Integer.parseInt(action.split(" ")[1])); 
				lastQueue = Integer.parseInt(action.split(" ")[1]);
				continue;	
			}
			
			switch(action) {
				case "pop":
					System.out.println(queue.isEmpty() ? -1 : queue.poll());
					break;
				case "size":
					System.out.println(queue.size());
					break;
				case "empty":
					System.out.println(queue.isEmpty() ? 1 : 0);
					break;
				case "front":
					System.out.println(queue.isEmpty() ? -1 : queue.peek());
					break;
				case "back":
					System.out.println(queue.isEmpty() ? -1 : lastQueue);
					break;
			}
		}
		sc.close();
	}
}

//package week13.chw;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Queue_10845 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int cnt = sc.nextInt();
//		int idx = 0;
//		Queue<Integer> queue = new LinkedList<>();
//		while(idx < cnt) {
//			String action = sc.next();
//			switch(action) {
//				case "pop":
//					System.out.println(queue.isEmpty() ? -1 : queue.poll());
//					break;
//				case "size":
//					System.out.println(queue.size());
//					break;
//				case "empty":
//					System.out.println(queue.isEmpty() ? 1 : 0);
//					break;
//				case "front":
//					System.out.println(queue.isEmpty() ? -1 : queue.peek());
//					break;
//				case "back":
//					int back = 0;
//					for(int j = 0; j < queue.size(); j++) {
//						if(j == queue.size()-1) back = queue.peek(); 
//						queue.add(queue.poll());
//					}
//					System.out.println(queue.isEmpty() ? -1 : back);
//					break;
//				default :
//					queue.add(sc.nextInt());
//					break;
//			}
//			idx++;
//		}
//		
//		sc.close();
//	}
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