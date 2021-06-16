package week5_sort.mtw;

import java.util.ArrayList;
import java.util.List;

public class Programmers_주식 {
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int[] arr = sol.solution(new int[] {1, 2, 3, 2, 3});
		
		for(int out : arr) {
			System.out.print(out + " ");
		}
	}
}

class Solution2 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i++) {
        	int cnt = 0;
        	for(int j=i+1; j<prices.length; j++) {
        		cnt++;
        		if(prices[i] > prices[j]) {
        			break;
        		}
        	}
        	answer[i] = cnt;
        }
        
        return answer;
    }
}
