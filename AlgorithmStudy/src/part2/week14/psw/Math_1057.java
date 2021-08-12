package part2.week14.psw;

import java.util.Scanner;
import java.util.function.Function;

public class Math_1057 {
	static Function<Integer, Integer> divCeil = (n) -> (int)Math.ceil((float)n/2);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kimjimin = sc.nextInt();
		int imhansu  = sc.nextInt();
		
		int answer = 1;
		while( n > 0 ) {
			if( divCeil.apply(kimjimin) == divCeil.apply(imhansu) ) break;
			
			n = divCeil.apply(n);
			kimjimin = divCeil.apply(kimjimin);
			imhansu = divCeil.apply(imhansu);
			answer++;
		}
		
		System.out.println(answer);
		sc.close();
	}
}

//int answer = 0;
//while(kimjimin != imhansu) {
//	kimjimin = (kimjimin + 1)/2;
//	imhansu = (imhansu + 1)/2;
//	answer++;
//}
