package part1.week2_sort.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_2750 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int cnt = in.nextInt();
		
		int[] numbers = new int[cnt];
		
		for(int i = 0; i < cnt; i++) {
			numbers[i] = in.nextInt();
		}
		
		Arrays.sort(numbers);
		
		for (int number : numbers) {
			System.out.println(number);
		}
	}
}
