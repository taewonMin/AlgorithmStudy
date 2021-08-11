package part1.week4_sort.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_18310 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int cnt = in.nextInt();
		int[] houses = new int[cnt];
		int answer = 0;
		for(int i = 0; i < cnt; i++) {
			houses[i] = in.nextInt();
		}
		
		Arrays.sort(houses);
		
		int idx = cnt % 2 == 0 ? cnt / 2 - 1 : cnt / 2;
		answer = houses[idx];
		System.out.println(answer);
	}
}

//다른풀이 -- 시간초과
//public class Sort_18310 {
//	public static void main(String[] args) {
//		
//		Scanner in = new Scanner(System.in);
//		
//		int cnt = in.nextInt();
//		int totalSum = 0;
//		int place = 1;
//		int[] houses = new int[cnt];
//		int answer = 0;
//		for(int i = 0; i < cnt; i++) {
//			houses[i] = in.nextInt();
//		}
//		
//		Arrays.sort(houses);
//		
//		int temp = 0;
//		while(place != houses[cnt -1]) {
//			for(int i = 0; i < cnt; i++) {
//				totalSum += Math.abs(houses[i] - place);
//			}
//
//			if(temp == 0) {
//				temp = totalSum;
//			}
//			
//			if(temp > totalSum) {
//				temp = totalSum;
//				answer = place;
//			}
//			
//			place++;
//			totalSum = 0;
//		}
//		
//		System.out.println(answer);
//	}
//}