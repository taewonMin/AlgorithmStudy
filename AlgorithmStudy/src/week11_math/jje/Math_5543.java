package week11_math.jje;

import java.util.Scanner;

public class Math_5543 {
	public static void main(String[] args) {
		
		//상근날드

		Scanner sc = new Scanner(System.in);
		int burger = sc.nextInt();
		for (int i = 0; i < 2; i++) {
			int tempBurger = sc.nextInt();
			if(burger>tempBurger) burger = tempBurger;
		}
		
		int beverage = sc.nextInt();
		int tempBeverage = sc.nextInt();
		if (beverage>tempBeverage) beverage = tempBeverage;
		
		System.out.println(burger+beverage-50);
		

	}
}
