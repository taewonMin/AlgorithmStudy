package part1.week2_sort.mtw;

import java.util.Scanner;

// 콘테스트
public class Sort_5576 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] wArr = new int[10];
		int[] kArr = new int[10];
		
		for(int i=0; i<wArr.length; i++) {
			wArr[i] = sc.nextInt();
			
			// 삽입정렬
			int j = i;
			while(j > 0 && wArr[j-1] < wArr[j]) {
				int temp = wArr[j];
				wArr[j] = wArr[j-1];
				wArr[j-1] = temp;
				j--;
			}
		}
		
		for(int i=0; i<kArr.length; i++) {
			kArr[i] = sc.nextInt();
			
			// 삽입정렬
			int j = i;
			while(j > 0 && kArr[j-1] < kArr[j]) {
				int temp = kArr[j];
				kArr[j] = kArr[j-1];
				kArr[j-1] = temp;
				j--;
			}
		}

		int wSum = 0;
		int kSum = 0;
		for(int i=0; i<3; i++) {
			wSum += wArr[i];
			kSum += kArr[i];
		}
		
		System.out.println(wSum + " " + kSum);
		
		sc.close();
	}
}
