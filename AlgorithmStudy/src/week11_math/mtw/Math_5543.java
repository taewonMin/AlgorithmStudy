package week11_math.mtw;

import java.util.Scanner;

// 상근날드
public class Math_5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int buggerMin = 2000;
		int drinkMin = 2000;
		for(int i=0; i<5; i++) {
			int price = sc.nextInt();
			if(i<3) {
				if(price < buggerMin) {
					buggerMin = price;
				}
			}else {
				if(price < drinkMin) {
					drinkMin = price;
				}
			}
		}
		
		System.out.println(buggerMin+drinkMin-50);
		
		sc.close();
	}
}
