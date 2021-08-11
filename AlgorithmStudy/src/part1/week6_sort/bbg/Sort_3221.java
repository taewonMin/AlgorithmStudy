package part1.week6_sort.bbg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort_3221 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 테스트 케이스 수
		int T = sc.nextInt();
		
		for(int cnt = 0 ; cnt < T ; cnt++) {
			// 카드의 개수
			int n = sc.nextInt();
			
			// 카드놀이 전 기억하는 카드
			List<String> beforeGame = new ArrayList<String>();
			for(int idx = 0 ; idx < n ; idx++) {
				beforeGame.add(sc.next());
			}
			
			// 카드놀이 후 기억하는 카드
			List<String> afterGame = new ArrayList<String>();
			for(int idx = 0 ; idx < n ; idx++) {
				afterGame.add(sc.next());
			}
	
			// 병합정렬 써보고싶음
			beforeGame.sort(null);
			afterGame.sort(null);
			
			// while용 인덱스번호
			int index = 0;
			
			// 같으면 계속 돈다
			while(index < n && beforeGame.get(index).equals(afterGame.get(index))) { 
				 index++;
			}
			
			// 결과출력 단어
			String result = "CHEATER";
			
			if(index == n) {
				result = "NOT "+result;
			}
			
			System.out.println(result);
			
		}
		sc.close();
	}
}
