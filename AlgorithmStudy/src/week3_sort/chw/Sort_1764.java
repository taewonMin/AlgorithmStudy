package week3_sort.chw;

import java.util.Scanner;

public class Sort_1764 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		int n = in.nextInt();
		int n = 6;
		
//		int[] arr = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			arr[i] = in.nextInt();
//		}
		int[] arr = {12, 7, 6, 8, 9, 10};
		
		for(int k = 0; k <= n; k++) {
			int kUp = 0;
			int kDown = 0;
			for(int i : arr) {
				if(i >= k) {
					kUp += 1;
				}else {
					kDown += 1;
				}
			}
			
			
			if(kUp >= k && kDown >= (n-k) ) {
				System.out.println(k);
				break;
			}
		}
		
		
		// 논문의 개수 = cnt
		// 출력값 = k
		// k이상인 논문수  = kUp
		// kDown
		
		
		
		
		
		
	}
}
