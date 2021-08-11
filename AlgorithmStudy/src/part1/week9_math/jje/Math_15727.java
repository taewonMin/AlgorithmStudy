package part1.week9_math.jje;

import java.util.Scanner;

public class Math_15727 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double l = sc.nextDouble();
		
		double minute = l/5; 
		
		int t = (int) Math.ceil(minute);
		
		System.out.println(t);

		sc.close();
	}
}
