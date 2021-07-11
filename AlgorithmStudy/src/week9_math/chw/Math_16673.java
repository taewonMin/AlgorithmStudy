package week9_math.chw;

import java.util.Scanner;

public class Math_16673 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int years = in.nextInt();
		int attachment = in.nextInt();
		int addiction = in.nextInt();
		
		int total = 0;
		for(int i = 1; i <= years; i++) {
			total += i*(attachment + addiction*i);
		}
		System.out.println(total);
		in.close();
		
	}
}
