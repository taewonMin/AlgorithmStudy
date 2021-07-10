package week9_math.psw;

import java.util.Scanner;

public class Math_16673 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(),k = sc.nextInt(), p = sc.nextInt(),total = 0;
		for (int i = 1; i <= c; i++) {
			total += i*(k+i*p);
		}
		System.out.println(total);
		sc.close();
	}
}
