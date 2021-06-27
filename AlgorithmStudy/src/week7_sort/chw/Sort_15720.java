package week7_sort.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_15720 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int hamburgers = in.nextInt();
		int sides = in.nextInt();
		int drinks = in.nextInt();
		
		int[] hamburgerArr = new int[hamburgers];
		int[] sideArr = new int[sides];
		int[] drinkArr = new int[drinks];
		
		for(int i = 0; i < hamburgers; i++) {
			hamburgerArr[i] = in.nextInt();
		}
		for(int i = 0; i < sides; i++) {
			sideArr[i] = in.nextInt();
		}
		for(int i = 0; i < drinks; i++) {
			drinkArr[i] = in.nextInt();
		}
		
		Arrays.sort(hamburgerArr);
		Arrays.sort(sideArr);
		Arrays.sort(drinkArr);
		
		
		
		in.close();
	}
}
