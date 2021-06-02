package week3_sort.mtw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programmers_H인덱스 {
	public static void main(String[] args) {
		Solution2 sol2 = new Solution2();
		int answer = sol2.solution(new int[] {3, 0, 6, 1, 5});
		System.out.println(answer);
	}
}

class Solution2 {
    public int solution(int[] citations) {
    	int answer = citations.length;
    	
    	// 방법 1) Collections.sort 로 정렬하기(내장함수)
//    	List<Integer> list = new ArrayList<Integer>();
//    	for(int num : citations) {
//    		list.add(num);
//    	}
//    	
//    	Collections.sort(list, Collections.reverseOrder());
//    	
//        while(answer > 0 && list.get(answer-1) < answer) {
//        	answer--;
//        }
        
    	
        // 방법 2) 삽입정렬
        for(int i=1; i<citations.length; i++) {
        	int j=i;
        	while(j > 0 && citations[j-1] < citations[j]) {
        		int temp = citations[j-1];
        		citations[j-1] = citations[j];
        		citations[j] = temp;
        		j--;
        	}
        }
        
        // H인덱스 계산
        while(answer > 0 && citations[answer-1] < answer) {
        	answer--;
        }
        
        return answer;
    }
}