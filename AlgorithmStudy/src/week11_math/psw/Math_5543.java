package week11_math.psw;

import java.util.Scanner;

public class Math_5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println( Math.min(sc.nextInt(), Math.min(sc.nextInt(), sc.nextInt())) + Math.min(sc.nextInt(), sc.nextInt()) - 50);
		sc.close();
	}
}
