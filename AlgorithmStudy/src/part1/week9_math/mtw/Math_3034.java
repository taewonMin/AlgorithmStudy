package part1.week9_math.mtw;

import java.util.Scanner;

// 앵그리 창영
public class Math_3034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();
		double diagonal = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));
		
		for(int i=0; i<N; i++) {
			int input = sc.nextInt();
			
			if(input <= diagonal) {
				System.out.println("DA");
			}else {
				System.out.println("NE");
			}
		}
		
		sc.close();
	}
}
