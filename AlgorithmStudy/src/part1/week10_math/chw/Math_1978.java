package part1.week10_math.chw;

import java.util.Scanner;

public class Math_1978 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cnt = in.nextInt();
		
		int[] decimalArr = new int[cnt];
		
		for(int i = 0; i < cnt; i++) {
			decimalArr[i] = in.nextInt();
		}
		
		int result = 0;
		for(int decimal : decimalArr) {
			if(decimal == 1) continue;
			if(decimal == 2 || decimal == 3) {
				result++;
				continue;
			}
			int limit = (int)Math.sqrt(decimal);
			boolean decimalCheck = true;
			for(int i = 2; i <= limit; i++) {
				if(decimal % i == 0) {
					decimalCheck = false;
					break;
				}
			}
			if(decimalCheck) result++;
		}
			
		System.out.println(result);
		
		
		in.close();
	}
}
