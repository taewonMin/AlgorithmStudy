package week8_sort.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_2358 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int cnt = in.nextInt();
		int[] xArr = new int[cnt];
		int[] yArr = new int[cnt];
		int resultCnt = 0;
		
		for(int i = 0; i < cnt; i++) {
			xArr[i] = in.nextInt();
			yArr[i] = in.nextInt();
		}
		
		Arrays.sort(xArr);
		Arrays.sort(yArr);
		
		for(int i = 0; i < cnt; i++) {
			if(i > 0 && xArr[i] == xArr[i-1]) {
				resultCnt++;
			}
			if(i > 0 && yArr[i] == yArr[i-1]) {
				resultCnt++;
			}
		}
		
		System.out.println(resultCnt);
		in.close();
	}
}


//// 시간초과
//package week8;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class sort_2358 {
//	public static void main(String[] args) {
//
//		Scanner in = new Scanner(System.in);
//		
//		int cnt = in.nextInt();
//		List<Integer> xList = new ArrayList<Integer>();
//		List<Integer> yList = new ArrayList<Integer>();
//		int resultCnt = 0;
//		
//		for(int i = 0; i < cnt; i++) {
//			int x = in.nextInt();
//			int y = in.nextInt();
//			if(xList.contains(x)) {
//				resultCnt++;
//			}else {
//				xList.add(x);
//			}
//			if(yList.contains(y)) {
//				resultCnt++;
//			}else {
//				yList.add(y);
//			}
//		}
//		System.out.println(resultCnt);
//		in.close();
//	}
//}