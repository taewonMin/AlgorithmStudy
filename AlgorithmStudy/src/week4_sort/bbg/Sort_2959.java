package week4_sort.bbg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_2959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] points = new Integer[4];
		
		for(int idx=0 ; idx<points.length ; idx++) {
			points[idx] = sc.nextInt();
		}
		
		Arrays.sort(points, Comparator.reverseOrder());
		
		// 최대 차대 차소 최소 중 차대 * 최소 
		System.out.println(points[1] * points[3]);
	}
}
