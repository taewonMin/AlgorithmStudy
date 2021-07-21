package week9_math.jje;

import java.util.Scanner;

public class Math_16673 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c =3; //sc.nextInt(); //와인을 모은 년수
		int k = 1;//sc.nextInt(); //고려대 애착 정도
		int p =1; //sc.nextInt(); //구매중독
		
		int result = 0;
		
		for (int i = 1; i <= c; i++) {
			result+=k*i+p*i*i;
		}
		
		System.out.println(result);
		
		sc.close();
	}
}
