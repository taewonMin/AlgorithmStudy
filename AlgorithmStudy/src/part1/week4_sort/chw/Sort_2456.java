package part1.week4_sort.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_2456 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		int stuCnt = 6;
//		int[] firstStuScore = {3,2,3,1,3,1}; 
//		int[] secondStuScore = {1,3,1,2,1,2}; 
//		int[] thirdStuScore = {2,1,2,3,2,3}; 
		
		int stuCnt = in.nextInt();
		int[] firstStuScore = new int[stuCnt]; 
		int[] secondStuScore = new int[stuCnt]; 
		int[] thirdStuScore = new int[stuCnt]; 
		
		
		for(int i = 0; i < stuCnt *3; i++) {
			
			switch (i % 3) {
			case 0:
				firstStuScore[i / 3] = in.nextInt();
				break;
			case 1:
				secondStuScore[i / 3] = in.nextInt();
				break;
			case 2:
				thirdStuScore[i / 3] = in.nextInt();
				break;
			}
		}
		
		Arrays.sort(firstStuScore);
		Arrays.sort(secondStuScore);
		Arrays.sort(thirdStuScore);
		
		int winner = 0;
		int totalScore = 0;
		for(int i = stuCnt - 1; i > 0; i--) {

			if(firstStuScore[i] > secondStuScore[i] && firstStuScore[i] > thirdStuScore[i]) {
				winner = 1;
				break;
			}
			if(secondStuScore[i] > firstStuScore[i] && secondStuScore[i] > thirdStuScore[i]) {
				winner = 2;
				break;
			}
			if(thirdStuScore[i] > firstStuScore[i] && thirdStuScore[i] > secondStuScore[i]) {
				winner = 3;
				break;
			}
		}

		switch (winner) {
		case 1:
			for(int score : firstStuScore) {
				totalScore += score;
			}
			break;
		case 2:
			for(int score : secondStuScore) {
				totalScore += score;
			}
			break;
		case 3:
			for(int score : thirdStuScore) {
				totalScore += score;
			}
			break;
		}
		
		System.out.println(winner +" " + totalScore);
		
		in.close();
	}
}