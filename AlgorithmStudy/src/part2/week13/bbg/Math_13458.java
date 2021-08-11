package part2.week13.bbg;

import java.util.Scanner;
//감독
public class Math_13458 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int cnt = 0 ; cnt < N ; cnt++) {
			A[cnt] = sc.nextInt();
		}
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		// 각 시험장에 배치할 감독 수 구하기
		double sum = 0;
		for(int cnt = 0 ; cnt < N ; cnt++) {
			sum += Math.ceil((double)(A[cnt]-B)/C)/*부감 수*/ + 1/*총감 수*/;
		}
		
		System.out.println((int)sum);
		
		sc.close();
	}
}
