package part1.week2_sort.jas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort_5576 {
	public static void main(String[] args) {
		
		Integer wArr[] = new Integer[10];
		Integer kArr[] = new Integer[10];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<10; i++) {
			wArr[i] = scan.nextInt();
		}
		for(int i=0; i<10; i++) {
			kArr[i] = scan.nextInt();
		}
		
		Arrays.sort(wArr, Collections.reverseOrder());
		Arrays.sort(kArr, Collections.reverseOrder());
		
		int wSum = 0;
		int kSum = 0;
		for(int i=0; i<3; i++) {
			wSum += wArr[i];
			kSum += kArr[i];
		}
		System.out.println(wSum + " " + kSum);
	}
}
