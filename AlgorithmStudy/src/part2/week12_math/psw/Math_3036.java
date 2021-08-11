package part2.week12_math.psw;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Math_3036 {
	final static BiFunction<Integer,Integer, Integer> getMaxDivisor = (first, num) ->{
		int divisor = num;
		while (!(first%divisor == 0 && num%divisor == 0)) {	divisor--;}
		return divisor;
	};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int first = sc.nextInt();
		for (int i = 0; i < n-1; i++) {
			int next = sc.nextInt();
			int divisor = getMaxDivisor.apply(first, next);
			System.out.println(first/divisor +"/" + (next/divisor));
		}
		
		sc.close();
	}
}
