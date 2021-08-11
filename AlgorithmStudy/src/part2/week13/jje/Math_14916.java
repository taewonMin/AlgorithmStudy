package part2.week13.jje;

import java.util.Scanner;

public class Math_14916 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		if(money==1||money==3)System.out.println("-1");
		else countChange(money);

		sc.close();
		//만약 거슬러 줄 수 없으면 -1을 출력한다.

		//13 -> 5
		//14 -> 4
		//5의 배수가 될 때까지 2를 뺀다 빼면서 개수 세기
	}

	static int num = 0;

	static void countChange(int money) {
		if(money%5==0) {
			System.out.println(money/5+num); return;
		}
		money-=2;
		num++;
		countChange(money);
	}

}

