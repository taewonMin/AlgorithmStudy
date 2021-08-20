package part2.week15.chw;

import java.util.Scanner;

public class Math_16162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int fir = sc.nextInt();
		int gongcha = sc.nextInt();
		int result = 0;
		for(int i = 0; i < cnt; i++) {
			int input = sc.nextInt();
			if(input != fir) continue;
			fir += gongcha;
			result++;
		}
		System.out.println(result);
		sc.close();
	}
}
