package week11_math.bbg;

import java.util.Scanner;

//저작권 	17796KB	248ms 변수에 각각 담은 후 연산해서 출력
//		17700KB	232ms sysout에 한 번에 담아 출력
public class Math_2914 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println((int) Math.ceil((double) sc.nextInt() * (sc.nextInt() - 0.99)));		

		sc.close();
	}
}
