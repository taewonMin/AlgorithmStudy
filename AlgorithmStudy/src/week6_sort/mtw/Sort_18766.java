package week6_sort.mtw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 카드 바꿔치기
public class Sort_18766 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String[] answer = new String[T];
		
		for(int i=0; i<T; i++) {
			int n = sc.nextInt();	// 카드 개수
			Map<String, Integer> cardMap = new HashMap<String, Integer>();
			
			sc.nextLine();
			// 시작 카드 Map에 집어넣기
			String[] startCard = sc.nextLine().split(" ");
			for(int j=0; j<startCard.length; j++) {
				int cnt = cardMap.get(startCard[j]) == null ? 1 : cardMap.get(startCard[j])+1;
				cardMap.put(startCard[j], cnt);
			}
			
			// 종료 카드 체크
			answer[i] = "NOT CHEATER";
			String[] endCard = sc.nextLine().split(" ");
			for(int j=0; j<endCard.length; j++) {
				if(cardMap.get(endCard[j]) == null) {
					answer[i] = "CHEATER";
					break;
				}else {
					int cardCount = cardMap.get(endCard[j]);
					if(cardCount == 1) {
						cardMap.remove(endCard[j]);
					}else {
						cardMap.put(endCard[j], cardCount-1);
					}
				}
			}
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		sc.close();
	}
}
