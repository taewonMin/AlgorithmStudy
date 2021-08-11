package part1.week4_sort.mtw;

import java.util.Arrays;
import java.util.Scanner;

// 거북이
public class Sort_2959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[4];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
			// 삽입정렬
			int j=i;
			while(j > 0 && arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		
		int result = arr[0] * arr[2];
		
		System.out.println(result);
		
		sc.close();
	}
}
