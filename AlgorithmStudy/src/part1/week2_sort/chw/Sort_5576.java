package part1.week2_sort.chw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort_5576 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		Integer[] WUniversity = new Integer[10];
		Integer[] KUniversity = new Integer[10];
		for(int i = 0; i < 20; i++) {
			if(i < 10) {
				WUniversity[i] = in.nextInt();
			}else {
				KUniversity[i-10] = in.nextInt();
			}
		}
		
		Arrays.sort(WUniversity,Collections.reverseOrder());
		Arrays.sort(KUniversity,Collections.reverseOrder());
		
		int WUniversitySum = 0;
		int KUniversitySum = 0;
		
		for(int i = 0; i < 3; i++) {
			WUniversitySum += WUniversity[i];
			KUniversitySum += KUniversity[i];
		}
		
		System.out.println(WUniversitySum + " " + KUniversitySum);
		
	}
}
