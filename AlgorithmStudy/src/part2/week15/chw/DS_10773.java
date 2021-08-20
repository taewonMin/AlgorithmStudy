package part2.week15.chw;

import java.util.Scanner;
import java.util.Stack;

public class DS_10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int cnt = sc.nextInt();
		int result = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i < cnt; i++) {
			int number = sc.nextInt();
			if(number == 0) {
				stack.pop();
			}else {
				stack.add(number);
			}
		}
		int l = stack.size();
		for(int i = 0; i < l; i++) {
			result += stack.pop();
		}
		System.out.println(result);
		sc.close();
	}
}
