package part1.week7_sort.chw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort_15720 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int[] miniArr = new int[3];
		
		for(int i = 0; i < 3; i++) {
			miniArr[i] = in.nextInt();
		}
		
		int hamburgers = miniArr[0];
		int sides = miniArr[1];
		int drinks = miniArr[2];
		
		Integer[] hamburgerArr = new Integer[hamburgers];
		Integer[] sideArr = new Integer[sides];
		Integer[] drinkArr = new Integer[drinks];
		
		for(int i = 0; i < hamburgers; i++) {
			hamburgerArr[i] = in.nextInt();
		}
		for(int i = 0; i < sides; i++) {
			sideArr[i] = in.nextInt();
		}
		for(int i = 0; i < drinks; i++) {
			drinkArr[i] = in.nextInt();
		}
		Arrays.sort(miniArr);
		Arrays.sort(hamburgerArr, Collections.reverseOrder());
		Arrays.sort(sideArr, Collections.reverseOrder());
		Arrays.sort(drinkArr, Collections.reverseOrder());
		
		int minimum = miniArr[0];
		int price = 0;
		int salePrice = 0;
		price = Arrays.stream(hamburgerArr).reduce(0, Integer::sum)
				+ Arrays.stream(sideArr).reduce(0, Integer::sum)
				+ Arrays.stream(drinkArr).reduce(0, Integer::sum);
		
		for(int i = 0; i < hamburgers; i++ ) {
			 if(i < minimum) {
				 salePrice += (int) (hamburgerArr[i] * 0.9); 
			 }else {
				 salePrice += hamburgerArr[i];
			 }
		}
		for(int i = 0; i < sides; i++ ) {
			 if(i < minimum) {
				 salePrice += (int) (sideArr[i] * 0.9); 
			 }else {
				 salePrice += sideArr[i];
			 }
		}
		for(int i = 0; i < drinks; i++ ) {
			 if(i < minimum) {
				 salePrice += (int) (drinkArr[i] * 0.9); 
			 }else {
				 salePrice += drinkArr[i];
			 }
		}
		System.out.println(price);
		System.out.println(salePrice);
		in.close();
	}
}
