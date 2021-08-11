package part1.week9_math.chw;

import java.util.Scanner;

public class Math_15727 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int distance = in.nextInt();
		System.out.println(distance % 5 == 0 ? distance / 5 : distance / 5 + 1);
		in.close();
	}
}
