package part1.week5_sort.mtw;

import java.util.Arrays;
import java.util.Scanner;

// 통나무 건너뛰기
public class Sort_11497 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] answer = new int[T];
		
		for(int i=0; i<T; i++) {
			int logNum = sc.nextInt();
			int[] logArr = new int[logNum];
			for(int j=0; j<logNum; j++) {
				logArr[j] = sc.nextInt();
			}
			
			// 정렬
			Arrays.sort(logArr);
			
			// 최적 배치 리스트 - 앞 뒤 번갈아가며 삽입
			int[] best = new int[logNum];
			boolean isEven = true;
			int start = 0;
			int end = logNum - 1;
			for(int j=0; j<logNum; j++) {
				if(isEven) {
					best[start++] = logArr[j];
				}else {
					best[end--] = logArr[j];
				}
				isEven = !isEven;
			}
			
			// 난이도 구하기
			int level = 0;
			for(int j=0; j<logNum-1; j++) {
				int gap = Math.abs(best[j] - best[j+1]);
				if(level < gap) {
					level = gap;
				}
			}
			
			answer[i] = level;
		}
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		sc.close();
	}
}
