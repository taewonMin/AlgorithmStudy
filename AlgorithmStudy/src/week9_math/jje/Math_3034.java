package week9_math.jje;

import java.util.Scanner;

public class Math_3034 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //성냥 개수
		int w = sc.nextInt(); //박스 가로 크기
		int h = sc.nextInt(); //박스 세로 크기		
		
		double diagonal = (double) Math.sqrt(w*w+h*h);
		
		for (int i = 0; i < n; i++) {
			int length = sc.nextInt();
			String dap = (length > diagonal)?"NE":"DA";
			System.out.println(dap);
		}
	
		sc.close();
		
	}
}
