package part2.week16.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Math_1138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		for(int i = 0; i < cnt; i++) {
			 int num = sc.nextInt();
			 if(i == 0) {
				 arr[num] = 1; 
			 }else if(num == 0) {
				 arr[0] = cnt;
			 }else {
				 if(arr[num] > 0) {
					 arr[cnt-num] = i + 1;
				 }else {
					 arr[num] = i + 1;
				 }
			 }
		}
		for(int i : arr) {
			System.out.println(i);
		}
		sc.close();
	}
}

