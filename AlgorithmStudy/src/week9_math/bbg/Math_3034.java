package week9_math.bbg;

import java.util.Scanner;

//앵그리
public class Math_3034 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();
		
		double daVal =  Math.sqrt(W*W + H*H);
		
		for(int cnt = 0 ; cnt < N ; cnt++) {
			int length = sc.nextInt();
			String result = "NE";
			if(length <= daVal) result = "DA";
			System.out.println(result);
		}
		
		
		sc.close();
	}
}
