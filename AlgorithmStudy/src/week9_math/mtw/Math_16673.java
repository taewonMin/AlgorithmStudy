package week9_math.mtw;

import java.util.Scanner;

// 고려대학교에는 공식 와인이 있다
public class Math_16673 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		int K = sc.nextInt();
		int P = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=C; i++) {
			sum += calcWineNum(i,K,P);
		}
		System.out.println(sum);
		
		sc.close();
	}
	
	static int calcWineNum(int c, int k, int p) {
		return (int)(k*c + p*Math.pow(c, 2));
	}
}
