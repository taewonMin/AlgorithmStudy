package part1.week10_math.mtw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 소수 찾기
public class Math_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 방법 1
		List<Integer> inputList = new ArrayList<Integer>();
		int N = sc.nextInt();
		int max = 0;
		for(int i=0; i<N; i++) {
			int input = sc.nextInt();
			inputList.add(input);
			if(max < input) {
				max = input;
			}
		}
		
		boolean[] primeArr = new boolean[max+1];
		Arrays.fill(primeArr, true);
		for(int i=2; i<=Math.sqrt(max); i++) {
			if(primeArr[i]) {
				for(int j=i*2; j<=max; j+=i) {
					if(primeArr[j]) {
						primeArr[j] = false;
					}
				}
			}
		}
		
		int result = 0;
		for(int i : inputList) {
			if(i > 1 && primeArr[i]) {
				result++;
			}
		}
		
		System.out.println(result);
		
		
		// 방법 2
//		int N = sc.nextInt();
//		int cnt = 0;
//		
//		for(int i=0; i<N; i++) {
//			int num = sc.nextInt();
//			if(num == 1) {
//				continue;
//			}
//			
//			boolean check = true;
//			for(int j=2; j<=Math.sqrt(num); j++) {
//				if(num%j == 0) {
//					check = false;
//					break;
//				}					
//			}
//			
//			if(check) {
//				cnt++;
//			}
//		}
//		
//		System.out.println(cnt);
		
		
		sc.close();
	}
}
