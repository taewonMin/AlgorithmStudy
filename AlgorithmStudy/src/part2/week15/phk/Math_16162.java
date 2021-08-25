package part2.week15.phk;

import java.util.Scanner;

// 39732kb	600ms
public class Math_16162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int d = sc.nextInt();
		
		int x = 0;
		int a_n = a;
		
		// int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			// arr[i] = sc.nextInt();
			if(sc.nextInt() == a_n) {
				x++;
				a_n += d;
			}
			
		}
		
		System.out.println(x);
		
		
		sc.close();
	}
}
