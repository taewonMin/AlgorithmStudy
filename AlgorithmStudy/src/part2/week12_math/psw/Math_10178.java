package part2.week12_math.psw;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Math_10178 {
	
	public final static BiConsumer<Integer, Integer> printAnswer = (x, y) -> System.out.println("You get "+x/y+" piece(s) and your dad gets "+x%y+" piece(s).");
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) { printAnswer.accept(sc.nextInt(), sc.nextInt()); }
		sc.close();
	}
}
