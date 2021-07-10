package week9_math.psw;

import java.util.Scanner;

public class Math_15727 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		System.out.println(l%5 > 0 ? l/5 + 1 : l/5);
		sc.close();
	}
}
