package part2.week15.bbg;
/** 제로 - 108796KB 904ms */
import java.util.Scanner;
import java.util.Stack;

public class DS_10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();

		int K = sc.nextInt();
		int result = 0;
		
		for(int cnt = 0 ; cnt < K ; cnt++) {
			int temp = sc.nextInt();
			if(temp != 0) {
				stack.push(temp);
			}else {
				stack.pop();
			}
		}
		sc.close();

		int size = stack.size();
		for(int cnt = 0; cnt < size ; cnt++) {
			result += stack.pop();
		}
		
		System.out.println(result);
	}
}
