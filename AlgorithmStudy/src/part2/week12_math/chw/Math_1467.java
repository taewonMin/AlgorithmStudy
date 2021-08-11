package part2.week12_math.chw;

import java.util.Scanner;

public class Math_1467 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int E = sc.nextInt();
		int S = sc.nextInt();
		int M = sc.nextInt();
		
		sc.close();
		
		int cnt = 0;
		while(true) {
			int result = 28 * cnt + S;
			int fir = result % 15;
			int sec = result % 19;
			
			if (fir == 0) fir = 15;
			if (sec == 0) sec = 19;
			
			if(fir == E && sec == M) {
				System.out.println(result);
				break;
			}
			cnt++;
		}
		
	}
}
