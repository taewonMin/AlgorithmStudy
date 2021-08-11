package part1.week9_math.phk;

import java.util.Scanner;

// 고려대학교에는 공식 와인이 있다
public class Math_16673 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt();
		int k = scan.nextInt();
		int p = scan.nextInt();
		
		int sum = 0;
		int n = 0;
		
		while (n <= c) {
			sum += k*n+p*Math.pow(n, 2);
			n++;
		}
		
		System.out.println(sum);
		scan.close();
	}
}
