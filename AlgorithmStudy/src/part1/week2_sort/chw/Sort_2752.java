package part1.week2_sort.chw;

import java.util.Scanner;

public class Sort_2752 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[] arr = {in.nextInt(), in.nextInt(), in.nextInt()};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) { //오름차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i+1 != arr.length) {
				System.out.print(" ");
			}
		}
	}
}
