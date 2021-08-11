package part2.week11_math.mtw;

import java.util.Scanner;

// 저작권
public class Math_2914 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int avg = sc.nextInt();
		
		System.out.println(cnt*(avg-1)+1);
		
		sc.close();
	}
}
