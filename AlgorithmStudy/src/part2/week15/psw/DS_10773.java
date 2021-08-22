package part2.week15.psw;

import java.util.Scanner;
import java.util.Stack;

public class DS_10773 {
	static long answer = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < k; i++) {
			int num = sc.nextInt();
			if(num == 0) stack.pop();
			else stack.push(num);
		}
		
		stack.forEach( (num) -> answer += num );
		
		System.out.println(answer);
		sc.close();
	}
}

