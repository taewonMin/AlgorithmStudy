package week6_sort.chw;

import java.util.Scanner;
import java.util.Stack;

public class Sort_3221 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int length = in.nextInt();
		int seconds = in.nextInt();
		
		int antCnt = in.nextInt();
		int[] arr = new int[seconds];
		
		Stack<Integer> stack = new Stack<Integer>();
		
		
		for(int i = 0; i < antCnt; i++) {
			
			boolean change;
			int startPoint = in.nextInt();
			String direction = in.next();
			
			if("D".equals(direction)) {
				change = true;
			}else {
				change = false;
			}
			for(int j = 0; j < seconds; j++) {
				
				if(change) {
					arr[j] = ++startPoint;
				}else {
					arr[j] = --startPoint;
				}
				
				if(arr[j] == length+1) {
					arr[j] = length-1;
					startPoint = length-1;
					change = false;
				}else if(arr[j] < 0) {
					arr[j] = 1;
					startPoint = 1;
					change = true;
				}
				
			}
			stack.push(arr[seconds-1]);
			
		}
		for(int i = 0; i < antCnt; i++) {
			System.out.println(stack.peek());
			stack.pop();
		}
		in.close();
	}
}
