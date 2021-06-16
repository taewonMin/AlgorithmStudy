package week5_sort.bbg;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_11497 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//int T = sc.nextInt();
		int T = 3;
		
		//case 반복하는 for문
		for(int cnt = 0; cnt < T ; cnt++) { 
			
			int N = sc.nextInt();
			Integer[] Li = new Integer[N];
			
			for(int idx = 0 ; idx < N ; idx++){
				Li[idx] = sc.nextInt();
			}
			
			Integer[] resultArr = new Integer[N];
			
			if(N%2 == 1) { // N 이 홀수이면
				Arrays.sort(Li,Collections.reverseOrder()); // 내림차순 정렬
				int whileCnt = 0;
				while(N%2-whileCnt >= 0) {
					if(whileCnt == 0) {
						resultArr[(int)N/2] = Li[whileCnt++];
					}else {
						resultArr[N%2-whileCnt] = Li[whileCnt];
						resultArr[N%2+whileCnt] = Li[++whileCnt];
					}
				}
			}else {
				
				
			}
			
			Integer[] difficulties = new Integer[resultArr.length];
			//난이도 구하는 for문
			for(int calCnt = 0 ; calCnt < resultArr.length ; calCnt++) {
				if(calCnt != resultArr.length-1 ) {
					difficulties[calCnt] = Math.abs(resultArr[calCnt] - resultArr[calCnt+1]);
				}else {
					difficulties[calCnt] = Math.abs(resultArr[calCnt] - resultArr[0]);
				}
			}
			
			Arrays.sort(difficulties,Comparator.reverseOrder());
			System.out.println(difficulties);
		}
		
		
		
		
		
	}
}
