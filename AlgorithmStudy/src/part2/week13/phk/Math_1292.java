package part2.week13.phk;

import java.util.Scanner;

public class Math_1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			
		}
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		for(int i = 0; i < a.length; i++){
            if(a[i] <= b) continue;
			a[i] -= b;
			n += Math.ceil((double)a[i]/c);
		}
		
		System.out.println(n);
	}
}
