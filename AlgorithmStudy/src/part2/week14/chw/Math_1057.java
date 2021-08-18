package part2.week14.chw;

import java.util.Scanner;

public class Math_1057 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int jimin = sc.nextInt();
		int hansu = sc.nextInt();	

		sc.close();
		
		int result = 1;
		while(true) {
			if(cnt == 1 && result == 1) {
				result = -1;
				break;
			}
			// 큰 수가 짝수 and 뺀 절댓값이 1이면 대결
			if((jimin < hansu ? hansu % 2 == 0 : jimin % 2 == 0) && Math.abs(hansu - jimin) == 1) {
				break;
			}
			cnt = cnt % 2 == 0 ? cnt / 2 : cnt / 2 + 1;
			jimin = jimin % 2 == 0 ? jimin / 2 : jimin / 2 + 1;
			hansu = hansu % 2 == 0 ? hansu / 2 : hansu / 2 + 1;
			result++;
		}
		System.out.println(result);
		
	}
}
