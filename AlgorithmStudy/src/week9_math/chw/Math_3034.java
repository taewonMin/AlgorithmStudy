package week9_math.chw;

import java.util.Scanner;

public class Math_3034 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int cnt = in.nextInt();
		int width = in.nextInt();
		int height = in.nextInt();
		
		int limit = (int) (Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2)));
		for(int i = 0; i < cnt; i++) {
			if(limit >= in.nextInt()) {
				System.out.println("DA");
			}else {
				System.out.println("NE");
			}
		}
		
		in.close();
	}
}
