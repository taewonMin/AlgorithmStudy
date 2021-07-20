package week10_math.bbg;

import java.util.Scanner;

//소수
public class Math_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[sc.nextInt()];
		
		int pNCount = 0;
		for(int cnt = 0 ; cnt < numbers.length ; cnt++) {
			if(isPrimeNumber(sc.nextInt())) pNCount++;
		}
		
		System.out.println(pNCount);
		
		sc.close();
	}
	
	public static boolean isPrimeNumber(int number) {
		if(number == 1) return false;
		int end = (int) Math.sqrt(number);
		
		for(int cnt = 2 ; cnt <= end ; cnt++) {
			if(number % cnt == 0) return false;
		}

		return true;
	}
}