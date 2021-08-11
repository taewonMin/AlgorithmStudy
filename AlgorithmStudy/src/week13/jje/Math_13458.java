package week13.jje;

import java.util.Scanner;

public class Math_13458 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] examinee = new int[n];

		for (int i = 0; i < n; i++) {
			examinee[i]=sc.nextInt();
		}

		double b = sc.nextInt();
		double c = sc.nextInt();
		long dap=0;

		for (int i = 0; i < examinee.length; i++) {
			dap+=Math.ceil((examinee[i]-b)/c+1);
		}
		System.out.println(dap);
		
		sc.close();
	}
}
