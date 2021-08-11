package part1.week9_math.psw;

import java.util.Scanner;

public class Math_3034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = (int)Math.sqrt(Math.pow(sc.nextInt(), 2)+Math.pow(sc.nextInt(), 2));
		for (int i = 0; i < n; i++) {
			System.out.println(sc.nextInt() <= max ? "DA" : "NE"); 
		}
		sc.close();
	}
}
