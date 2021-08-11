package part1.week9_math.phk;

import java.util.Scanner;

// 앵그리창영
public class Math_3034 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		int cm[] = new int[n];
		for (int i = 0; i < n; i++) {
			cm[i] = scan.nextInt();
		}
		
		int max = (int) Math.sqrt(Math.pow(w, 2)+Math.pow(h, 2));
		
		for (int i : cm) {
			
			System.out.println(i <= max? "DA": "NE");
		}
		
		scan.close();
		
	}

}
