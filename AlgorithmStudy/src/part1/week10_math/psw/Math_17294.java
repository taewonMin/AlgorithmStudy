package part1.week10_math.psw;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Math_17294 {
	public static void main(String[] args) {
		// 파스칼 삼각형 공식 n!/r!*(n-r)!
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long answer = (long)1;
		sc.close();

		Function<Integer, Double> factorial = (num) -> {
			Double total = (double)1;
			while(num > 1) total *= num--; 
			return total;
		};
		
		BiFunction<Integer, Integer, Long> getAnswer = (N , K) -> (long)Math.round((factorial.apply(N)/(factorial.apply(K)*factorial.apply(N-K))));
		if(n > 2) answer = getAnswer.apply(n-1, k-1); 
		System.out.println(answer);
		
	}
}
