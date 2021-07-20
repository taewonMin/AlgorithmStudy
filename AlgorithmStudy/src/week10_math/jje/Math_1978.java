package week10_math.jje;

import java.util.Scanner;

public class Math_1978 {
	public static void main(String[] args) {
		
		//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int su = 0;
		int[] temp = new int[n];
		int dap = 0;
		
		for (int i = 0; i < n; i++) {
			su = sc.nextInt();
			if(su==1) continue;
			if(primeNumber(su)!=0) dap++;
		}
		
		System.out.println(dap);
		sc.close();
	}
	
	static int primeNumber(int su){
		for (int i = 2; i <= (int)Math.sqrt(su); i++) {
			if(su%i==0) return 0;
		}
		return su;
	}
}
