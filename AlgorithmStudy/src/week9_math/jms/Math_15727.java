package week9_math.jms;

import java.util.Scanner;

public class Math_15727 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int way = sc.nextInt();
		//걷는 거리 최대 로하고 나눈다 아니면 거리 나누기 걸음에서 +1을 하면 무조건 도착
		if(way%5==0) System.out.println(way/5);
		else System.out.println(way/5+1);
	}
}
