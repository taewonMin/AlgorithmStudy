package week9_math.bbg;

import java.util.Scanner;

//조별과제
public class Math_15727 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int t = L/5;
		if(L%5 > 0) t++;
		
		System.out.println(t);
		
		sc.close();
	}
}
