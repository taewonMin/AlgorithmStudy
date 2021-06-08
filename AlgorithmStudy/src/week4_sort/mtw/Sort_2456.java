package week4_sort.mtw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 나는 학급회장이다
public class Sort_2456 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] totalScore = new int[3]; // 총점 저장 배열
		int[][] score = new int[3][3]; // 점수 개수 저장 배열
		
		int N = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<N; i++) {
			String input = sc.nextLine();
			for(int j=0; j<3; j++) {
				int index = Integer.parseInt(input.split(" ")[j]);
				score[j][index-1]++;
				totalScore[j] += index;
			}
		}
		
		// 최고점수 후보 찾기
		int max = totalScore[0];
		List<Integer> winnerList = new ArrayList<Integer>();
		
		winnerList.add(0);
		for(int i=1; i<3; i++) {
			if(max < totalScore[i]) {
				max = totalScore[i];
				winnerList.clear();
				winnerList.add(i);
			}else if(max == totalScore[i]) {
				winnerList.add(i);
			}
		}
		
		// 회장 선출
		int winner = 0;
		if(winnerList.size() > 1) { // 동점자가 여러명이면
			for(int i=2; i>0; i--) {	// 3점 개수부터 비교
				// 최대값 찾기
				int maxScoreCnt = 0;
				List<Integer> removeList = new ArrayList<Integer>();
				for(int j=0; j<winnerList.size(); j++) {
					int candidate = winnerList.get(j);
					if(maxScoreCnt < score[candidate][i]) {
						maxScoreCnt = score[candidate][i];
					} else if(maxScoreCnt > score[candidate][i]){ // 최대값보다 개수가 적은 후보 삭제
						removeList.add(candidate);
					}
				}
				// 후보 탈락자 삭제
				for(int j=0; j<removeList.size(); j++) {
					winnerList.remove(removeList.get(j));
				}
			}
		}
		
		// 최종 결과
		if(winnerList.size() == 1) {
			winner = winnerList.get(0)+1;
		}
		
		System.out.println(winner + " " + totalScore[winnerList.get(0)]);
		
		sc.close();
	}
}
