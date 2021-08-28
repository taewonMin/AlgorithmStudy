package part2.week16.psw;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Math_1138 {
	static Stack<Integer[]> list = new Stack<>();
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.push(new Integer[] {sc.nextInt(), i+1});
 		}
		
		LinkedList<Integer[]> answer = new LinkedList<>();
		while(!list.isEmpty()) {
			Integer[] item = list.pop();
			for (int i = 0; i <= answer.size(); i++) {
				if(item[0] == i) answer.add(i, item);
			}
		}
		answer.forEach( (item) -> System.out.print(item[1] +" "));
		
		sc.close();
	}
}
