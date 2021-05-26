package week2_sort.jas;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_2750 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();
		
		int arr[] = new int[cnt];
		
		for(int i=0; i<cnt; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i  : arr) {
			System.out.println(i);
		}
	}
}
