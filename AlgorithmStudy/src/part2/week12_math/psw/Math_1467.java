package part2.week12_math.psw;

import java.util.Scanner;

public class Math_1467 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt(), s = sc.nextInt(), m = sc.nextInt();

		int a = 1, b = 1 ,c = 1;
		int answer = 1;
		while(true) {
			if( e == a && s == b && m == c) break;
			a = (a+1)%16 == 0 ? 1 : a+1 ;
			b = (b+1)%29 == 0 ? 1 : b+1 ;
			c = (c+1)%20 == 0 ? 1 : c+1 ;
			answer++;
		}
		System.out.println(answer);
		sc.close();
		
	}
}
