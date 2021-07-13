package week9_math.phk;

import java.util.Scanner;

// 조별과제를 하려는데 조장이 사라졌다
public class Math_15727 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int L = scan.nextInt();
		
		System.out.println(L/5 + (L%5 == 0? 0 : 1));
		
		scan.close();
	}
}
