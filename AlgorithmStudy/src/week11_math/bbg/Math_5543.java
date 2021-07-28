package week11_math.bbg;

import java.util.Arrays;
import java.util.Scanner;

//상근날드 17588KB 212ms
public class Math_5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] burgers = new int[3];
		int[] beverages = new int[2];
		
		for(int idx = 0 ; idx < burgers.length ; idx++) {
			burgers[idx] = sc.nextInt();
		}
		for(int idx = 0 ; idx < beverages.length ; idx++) {
			beverages[idx] = sc.nextInt();
		}
		
		Arrays.sort(burgers);
		Arrays.sort(beverages);
		
		System.out.println(burgers[0] + beverages[0] - 50);
		
		sc.close();
	}
}
