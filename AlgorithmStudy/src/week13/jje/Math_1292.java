package week13.jje;

import java.util.ArrayList;
import java.util.Scanner;

public class Math_1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		ArrayList<Integer> c = new ArrayList<Integer>();

		int d = 0;
		int dap = 0;
		int tempB = 0;
		for (int i = 0; i <= b; i++) {
			d+=i;
			if(d>=b) {
				tempB=i+1;
				break;
			}
		}

		for (int i = 0; i < tempB; i++) {
			for (int j = 1; j <= i; j++) {
				c.add(i);
			}
		}
		for (int i = a-1; i < b; i++) {
			dap+=c.get(i);
		}
		System.out.println(dap);
		
		sc.close();
	}
}
