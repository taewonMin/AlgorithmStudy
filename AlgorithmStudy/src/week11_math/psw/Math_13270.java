package week11_math.psw;

import java.util.Scanner;

public class Math_13270 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = num%3 == 0 ? 2*(num/3) :(num%3 == 2 ? 2*(num/3) + 1 :  2*(num/3)) ;
		int min = num%2 == 0 ? num/2 :  ((num-3)/2) + 2;
		System.out.println(min + " " + max);
		sc.close();
	}
}