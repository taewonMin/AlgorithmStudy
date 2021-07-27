package week11_math.phk;

import java.util.Scanner;

//17548kb	208ms
public class Math_2914 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int i = sc.nextInt();
		sc.close();
		
		int x = a * i;
		
		System.out.println(i==1? x: (x-a+1)); 
	}
}
