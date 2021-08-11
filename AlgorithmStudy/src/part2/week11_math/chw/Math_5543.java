package part2.week11_math.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Math_5543 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] burgers = new int[3];
		int[] drinks = new int[2];
		for(int i = 0; i < 5; i++) {
			if(i < 3) {
				burgers[i] = in.nextInt(); 
			}else {
				drinks[i-3] = in.nextInt();
			}
		}
		Arrays.sort(burgers);
		Arrays.sort(drinks);
		System.out.println(burgers[0] + drinks[0] - 50);
		in.close();
	}
}
