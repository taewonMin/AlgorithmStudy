package week5_sort.psw;

import java.util.ArrayList;
import java.util.List;

public class Programmers_주식 {
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
        
        int[] answer = new int[prices.length];
		for (int i = 0; i < prices.length-1; i++) {
			List<Integer> list = new ArrayList<>();
			int x = prices[i];
			list.add(prices[i]);
			for (int j = i+1; j < prices.length; j++) {
				if(x <= prices[j]) {
					list.add(prices[j]);
				}else {
					answer[i] = list.size();
					break;
				}
				answer[i] = list.size()-1;
			}
		}
	}
}

