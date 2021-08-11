package part1.week9_math.bbg;

import java.util.Scanner;

//와인
public class Math_16673 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		int K = sc.nextInt();
		int P = sc.nextInt();
		
		int totWine = 0;
		for(int cnt=0 ; cnt<= C ; cnt++) {
			totWine += K * cnt + P * cnt * cnt;
		}
		System.out.println(totWine);
		
		sc.close();
	}
}
