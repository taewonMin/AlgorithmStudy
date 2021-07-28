package week11_math.chw;

import java.util.Scanner;

public class Math_2914 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int musicCnt = in.nextInt();
		int avg = in.nextInt();
		
		System.out.println(musicCnt * (avg - 1) + 1);
		
		in.close();
	}
}
