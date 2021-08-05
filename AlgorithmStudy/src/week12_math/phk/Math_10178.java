package week12_math.phk;

import java.util.Scanner;

//18356kb	252ms
public class Math_10178 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int c = sc.nextInt();
			int v = sc.nextInt();
			System.out.println("You get " + c/v + " piece(s) and your dad gets " +c%v+ " piece(s).");
			
		}
		sc.close();
	}
}
