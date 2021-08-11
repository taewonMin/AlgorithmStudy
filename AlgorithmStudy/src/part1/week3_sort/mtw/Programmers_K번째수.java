package part1.week3_sort.mtw;

import java.util.Arrays;

public class Programmers_K번째수 {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] answer = sol.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
		
		for(int out : answer) {
			System.out.println(out);
		}
	}
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // 방법 1) 내장함수 사용
//        for(int i=0; i<commands.length; i++) {
//        	int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
//        	Arrays.sort(temp);
//        	answer[i] = temp[commands[i][2]-1];
//        }
        
        // 방법 2) 하드코딩! - 시간효율 더 좋음
        for(int i=0; i<commands.length; i++){
            int tempLen = commands[i][1] - commands[i][0] + 1; // 잘라진 배열 길이
            int move = commands[i][0]-1;	// 시작위치
            int[] temp = new int[tempLen];
            for(int j=0; j<tempLen; j++){   // temp에 삽입
                temp[j] = array[move++];
                
                // 삽입정렬
                int k=j;
                while(k > 0 && temp[k-1] > temp[k]) {
                	int num = temp[k-1];
                    temp[k-1] = temp[k];
                    temp[k] = num;
                    k--;
                }
            }
            answer[i] = temp[commands[i][2]-1];
        }
        
        return answer;
    }
}