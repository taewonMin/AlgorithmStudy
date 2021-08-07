package week13.chw;

import java.util.Scanner;

public class Queue_10845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		sc.close();
	}
}

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