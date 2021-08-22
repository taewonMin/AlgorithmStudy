package part2.week15.psw;

import java.util.Scanner;

public class Math_16162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int start = sc.nextInt();
		int step = sc.nextInt();
		int answer = 0;
		
		for (int i = 0; i < n; i++) {
			if(sc.nextInt() == start) {
				answer++;
				start += step;
			}
		}

		System.out.println(answer);
		
		sc.close();
	}
}
