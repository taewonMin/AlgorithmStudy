package part2.week13.psw;

import java.util.Scanner;
import java.util.function.Consumer;

public class Math_1292 {
	static int num = 1;
	static int maxIndex = 1;
	
	static Consumer<Integer> setNumber = (index) -> {
		while(index > maxIndex) {
			maxIndex += ++num;
		}
	};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 0;
		
		for (int i = a; i <= b; i++) {
			setNumber.accept(i);
			answer += num;
		}
		
		System.out.println(answer);
		sc.close();
	}
}
