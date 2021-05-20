package week1_chw;

import java.util.Scanner;

public class Math1_1712 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("고정비용을 입력해주세요.");
		int fixPrice = in.nextInt();
		System.out.println("노트북 한 대의 생산가격을 입력해주세요.");
		int cost = in.nextInt();
		System.out.println("노트북 한 대의 판매가격을 입력해주세요.");
		int retailPrice = in.nextInt();
		
		// fixPrice + (cost * cnt) < retailPrice * cnt
		// fixPrice / (retailPrice - cost) < cnt
		
		int result = 0;
		if(cost >= retailPrice) {
			result = -1;
		}else {
			result = fixPrice / (retailPrice - cost) + 1; 
		}
		
		System.out.println("손익분기점은 " + result+ "개 입니다.");
		
	}
}
