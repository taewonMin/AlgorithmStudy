package part2.week11_math.psw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Math_13270 {
	public static void main(String[] args) throws Exception {
		int num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int max = (num%3 == 2 ? 2*(num/3) + 1 : 2*(num/3));
		int min = (num%2 == 0 ? num/2 :  ((num-3)/2) + 2) ;
		
		System.out.println( min + " " + max );
	}
}