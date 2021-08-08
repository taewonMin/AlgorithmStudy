package week13.psw;

import java.util.Scanner;

public class Math_14916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int answer = -1;
		// i 의 최댓값을 구하는 문제이므로 최댓값부터 검증하며 개수를 줄여나간다. i = 0 일땐 2로만 나눠질수도 있으므로 i > -1 때도 체크 
		for (int i = total/5; i > -1; i--) {
			int remain = total - 5*i;
			if( remain%2 == 0) {
				answer = i +  remain/2;
				break;
			}
		}
		System.out.println( answer );
		sc.close();
	}
}
