package week1.mtw;

import java.util.Scanner;

public class Math1_1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fix = sc.nextInt();		// 고정비용
		int var = sc.nextInt();		// 가변비용
		int prise = sc.nextInt();	// 가격
		int result = 0;	// 손익 분기점 / 판매 대수
		
		if(var >= prise) {
			result = -1;
		}else {
			result = fix / (prise - var) + 1;
		}
		
		System.out.println(result);
		sc.close();
	}
}
