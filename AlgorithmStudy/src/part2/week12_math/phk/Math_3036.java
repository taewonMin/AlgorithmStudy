package part2.week12_math.phk;

import java.util.Scanner;

//18508kb	280ms
public class Math_3036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 1; i < n; i++) {
			int g = gcd(arr[0],arr[i]);
			int a = arr[0]/g;
			int b = arr[i]/g;
			System.out.println(a + "/" + b);
		}
		
		
	}
	
	// 유클리드 호제법으로 최대공약수 구하기
	// 나머지가 0이 될때까지 나머지로 나눈다.
	public static int gcd(int a, int b) {
		
		while (b!=0) {
			int r = a%b;
			a = b;
			b = r;
			
		}
		
		return a;
	}
}
