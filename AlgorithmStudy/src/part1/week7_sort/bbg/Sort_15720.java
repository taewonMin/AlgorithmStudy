package part1.week7_sort.bbg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort_15720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 최소값 담아서 최대 세트 개수 얻기
		int mCnt = 0;
		List<Integer> counts = new ArrayList<Integer>();
		List<Integer> prices = new ArrayList<Integer>();
		List<List<Integer>> allPrices = new ArrayList<List<Integer>>();
		
		// 메뉴별 갯수 담음
		for(int idx = 0; idx < 3 ; idx++) {
			int temp = sc.nextInt();
			if(idx == 0 || idx > 0 && temp < mCnt) mCnt = temp;
			counts.add(temp);
		}
		
		// 할인 전 합계
		int oriSum = 0;
		
		for(int row = 0; row < counts.size() ; row++) {
			prices = new ArrayList<Integer>();
			for(int col=0; col < counts.get(row) ; col++) {
				int temp = sc.nextInt();
				prices.add(temp);
				oriSum += temp;
			}
			Collections.sort(prices, Collections.reverseOrder());
			allPrices.add(prices);
//			prices.clear(); // clear 사용 시  allPrices 안에 추가된 prices도 초기화되어 원하는 값이 나오지 않음. 
			// clear => 내부배열 모두 null, size 0으로 변경
		}
		
		// 할인값
		int disValue = 0;
		
		//세트 갯수만큼 할인
		for(int row = 0; row < allPrices.size() ; row++) {
			for(int col = 0 ; col < mCnt ; col++) {
				int temp = (allPrices.get(row)).get(col);
				disValue += temp*0.1;
			}
		}

		System.out.println(oriSum);
		System.out.println(oriSum - disValue);
	}
}
