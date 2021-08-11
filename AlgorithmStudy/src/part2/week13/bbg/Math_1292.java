package part2.week13.bbg;

import java.util.Scanner;
//쉽푸문
public class Math_1292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); // 시작 위치 (인덱스  A-1)
		int B = sc.nextInt(); // 마지막 위치 (인덱스 B-1)
		int num = 1; // 숫자 시작
		int sum = 0; // 합계
		for(int idx = 0 ; num < B ; idx++) { //인덱스 6까지 돈다
			int n = 0;
			for(;n < num; n++) {
				if(idx >= A-1) sum+= num;
			}
			if(n == num) num++;
			idx += n;
			
		}
		System.out.println(sum);
		sc.close();
	}
}
