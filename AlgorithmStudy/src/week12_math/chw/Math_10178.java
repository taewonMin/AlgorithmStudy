package week12_math.chw;

import java.util.Scanner;

public class Math_10178 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			int candy = sc.nextInt();
			int child = sc.nextInt();
			System.out.println("You get " + candy/child + " piece(s) and your dad gets " + candy%child + " piece(s).");
		}
		
		sc.close();
	}
}
