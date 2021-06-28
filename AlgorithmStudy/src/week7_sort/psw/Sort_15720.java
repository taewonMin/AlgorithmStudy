package week7_sort.psw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort_15720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] bugger = new int[sc.nextInt()];
		int[] side = new int[sc.nextInt()];
		int[] drink = new int[sc.nextInt()];
		int total = 0;
		
		for (int i = 0; i < bugger.length; i++) {
			bugger[i] = sc.nextInt();
			total += bugger[i];
		}
		for (int i = 0; i < side.length; i++) {
			side[i] = sc.nextInt();
			total += side[i];
		}
		for (int i = 0; i < drink.length; i++) {
			drink[i] = sc.nextInt();
			total += drink[i];
		}
		
		Arrays.sort(bugger);
		Arrays.sort(side);
		Arrays.sort(drink);
		int min = Math.min(bugger.length, Math.min(side.length, drink.length));
		System.out.println(total);
		
		for (int i = 0; i < min; i++) {
			total -= ( bugger[bugger.length - (i+1)] + side[side.length - (i+1)] + drink[drink.length - (i+1)])*0.1;
		}
		System.out.println(total);
		sc.close();
	}
}
