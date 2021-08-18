package part2.week14.chw;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class DS_1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int cnt = sc.nextInt();
		int result = 0;
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i = 1; i <= size; i++) {
			deque.add(i);
		}
		
		for(int i = 0; i < cnt; i++) {
			int number = sc.nextInt();
			boolean reverse = true;
			Iterator<Integer> iter = deque.iterator();
			int checkOrder = 0;
			while(checkOrder <= deque.size() / 2) {
				int num = iter.next();
				if(number == num) {
					reverse = false;
					break;
				}
				checkOrder++;
			}
			
			while(true) {
				if(deque.peek() == number) {
					deque.removeFirst();
					break;
				}
				
				if(reverse) {
					deque.addFirst(deque.pollLast());
				}else {
					deque.addLast(deque.pollFirst());
				}
				result++;
			}
		}
		System.out.println(result);
		
		sc.close();
	}
}
