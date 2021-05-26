package week2_sort.mtw;

import java.util.Scanner;

// 수 정렬하기
public class Sort_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			
			// 삽입 정렬
			int j = i;
			while(j > 0 && arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		
		for(int out : arr) {
			System.out.println(out);
		}
		
		sc.close();
	}
}
