package part2.week12_math.jje;

import java.util.Scanner;

public class Math_3036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();

		int n = sc.nextInt();
		int c1 = sc.nextInt();
		for (int i = 0; i < n - 1; i++) {
			int r = sc.nextInt();
			System.out.println(c1 / GCD(c1, r) + "/" + r / GCD(c1, r));
		}
	}

	static int GCD(int a, int b) { // 최대공약수
		if (a % b == 0) {
			return b;
		}
		return GCD(b, a % b);
	}
}
