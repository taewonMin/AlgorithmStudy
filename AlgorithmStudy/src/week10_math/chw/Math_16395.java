package week10_math.chw;

import java.util.Scanner;

public class Math_16395 {
//	public static void main(String[] args) {
//
//		Scanner in = new Scanner(System.in);
//		
//		int n = in.nextInt(); // 5
//		int k = in.nextInt(); // 3
//
//		int[][] pasArr = new int[n][n]; 
//		
//		for(int i = 0; i < n; i++) {
//			for(int j = 0; j < n; j++) {
//				if(i + 1 == j) {
//					break;
//				}
//				
//				if(i == 0 || j == 0 || i == j) {
//					pasArr[i][j] = 1;
//				}else {
//					pasArr[i][j] = pasArr[i-1][j-1] + pasArr[i-1][j]; 
//				}
//				
//			}
//		}
//		for(int[] i : pasArr) {
//			for(int j : i) {
//				System.out.print(j +" ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println(pasArr[n-1][k-1]);
//		in.close();
//	}
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		// 5C3 = (5 * 4 * 3) / (3 * 2 * 1) 6 10
		// 6P3 = 10
		// 11P3 = 45 = 10C2
		
		// 5P3 = 4C2 + 3C2 + 2C2 = 6 + 3 + 1 = 10
		// 5C2 + 4C2 + 3C2 + 2C2 = 10 + 6 + 3 + 1
		
		// nCm = n-1Cm-1
		// n - 1 ... m-1개 / 1...m-1
		
		double numerator = 1;
		double denominator = 1;
		for(int i = 1; i < k; i++) {
			numerator *= n - i;
			denominator *=  i;
		}
		
		System.out.println((int)(numerator / denominator));
		
		in.close();
	}
	
}






