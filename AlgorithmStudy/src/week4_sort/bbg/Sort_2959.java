package week4_sort.bbg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 거북이
/*
 사각형이 되는 조건을 생각하다가 제일 큰변 - 제일 작은변 - 두번째 큰변 - 두번째 작은변 순으로 그리면 무조건 사각형이 나온다는걸 알았습니다.
이 때, 그 사각형의 넓이는 두 번째로 큰변과 제일 작은 변의 길이로 구해져서 네 점을 내림차순으로 정렬 후 1번, 3번방의 값을 곱했습니다. 
 */
public class Sort_2959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] points = new Integer[4];
		
		for(int idx=0 ; idx<points.length ; idx++) {
			points[idx] = sc.nextInt();
		}
		
		Arrays.sort(points, Comparator.reverseOrder());
		
		// 최대 차대 차소 최소 중 차대 * 최소 
		System.out.println(points[1] * points[3]);
	}
}
