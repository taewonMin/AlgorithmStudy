package week2_sort.mtw;

import java.util.Scanner;

// 세 수 정렬
public class Sort_2752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 선택정렬
		for(int i=0; i<arr.length; i++) {
			int min = arr[i];
			int index = i;
			for(int j=i+1; j<arr.length; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}

		for(int out : arr) {
			System.out.printf("%d ", out);
		}
		sc.close();
	}
}
