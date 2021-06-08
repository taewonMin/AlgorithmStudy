package week4_sort.mtw;

import java.util.Arrays;
import java.util.Scanner;

// 안테나
public class Sort_18310 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int mid = arr[(arr.length - 1) / 2];
		
		System.out.println(mid);
		
		sc.close();
	}
}
