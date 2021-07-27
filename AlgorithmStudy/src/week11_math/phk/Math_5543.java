package week11_math.phk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//17632kb	216ms
public class Math_5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> burger = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			burger.add(sc.nextInt());
		}
		
		List<Integer> drink = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			drink.add(sc.nextInt());
		}
		
		sc.close();
		
		Collections.sort(burger);
		Collections.sort(drink);
		
		int sum = burger.get(0) + drink.get(0) - 50;
		
		System.out.println(sum);
		
		
	}
}
