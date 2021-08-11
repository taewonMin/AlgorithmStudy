package part1.week3_sort.mtw;

import java.util.Scanner;

// Q-인덱스
public class Sort_13333 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 삽입정렬
		for(int i=1; i<arr.length; i++) {
			int j=i;
			while(j > 0 && arr[j-1] < arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		
		// q-인덱스 계산
		int qIndex = arr.length;
		while(qIndex > 0 && arr[qIndex-1] < qIndex) {
			qIndex--;
		}
		
		System.out.println(qIndex);
		
		sc.close();
	}
}
