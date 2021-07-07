package week8_sort.bbg;

import java.util.Scanner;

//평행선
public class Sort_2358 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 줄의 갯수
		int n = sc.nextInt();
		
		// 점의 좌표 x, y 가 x y 순으로 입력됨
		int[][] points = new int[n][2];
		
		for(int cnt=0 ; cnt<n ; cnt++) {
			points[cnt][0] = sc.nextInt();
			points[cnt][1] = sc.nextInt();
		}
		
		int result = 0;
		
		for(int idx = 0; idx < n ; idx++) {
			int subX = 0;
			int subY = 0;
			if(idx != n-1) {
				subX = Math.abs(points[idx][0] - points[idx+1][0]);
				subY = Math.abs(points[idx][1] - points[idx+1][1]);
			}else {
				subX = Math.abs(points[idx][0] - points[0][0]);
				subY = Math.abs(points[idx][1] - points[0][1]);
			}
			for(int index = 0; index < n ; index++) {
				result = points[index][0] == subX && points[index][1] == subY ? result+1 : result;
			}
		}
		System.out.println(result);
		sc.close();
	}
}
