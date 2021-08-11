package part2.week12_math.chw;

import java.util.Scanner;

public class Math_3036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int firstRing = sc.nextInt();
		for(int i = 0; i < cnt-1; i++) {
			int ring = sc.nextInt();
			for(int j = ring; j > 0; j--) {
				if (firstRing % j == 0 && ring % j == 0) {
					System.out.println(firstRing / j + "/" + ring / j);
					break;
				}
			}
		}
		sc.close();
	}
}
