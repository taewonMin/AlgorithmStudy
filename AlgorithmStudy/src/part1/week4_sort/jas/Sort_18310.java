package part1.week4_sort.jas;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_18310 {
	/**
	 * 
	 일직선 상의 마을에 여러 채의 집이 위치해 있다. 이중에서 특정 위치의 집에 특별히 한 개의 안테나를 설치하기로 결정했다. 
	 효율성을 위해 안테나로부터 모든 집까지의 거리의 총 합이 최소가 되도록 설치하려고 한다. 이 때 안테나는 집이 위치한 곳에만 설치할 수 있고, 
	 논리적으로 동일한 위치에 여러 개의 집이 존재하는 것이 가능하다.

	집들의 위치 값이 주어질 때, 안테나를 설치할 위치를 선택하는 프로그램을 작성하시오.
	
	예를 들어 N=4이고, 각 위치가 1, 5, 7, 9일 때를 가정하자.

	이 경우 5의 위치에 설치했을 때, 안테나로부터 모든 집까지의 거리의 총 합이 (4+0+2+4)=10으로, 최소가 된다.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();				// 총 집의 수
		int arr[] = new int[cnt];				// 집 위치 담을 배열 
		int sum = 0;
		//혹시 네개의 수의 평균값에 가장 가까운 집이 답일까?
		  
		for(int i =0; i<cnt; i++) {
			arr[i] = scan.nextInt();
			sum+= arr[i];
		}
		Arrays.sort(arr); 						//같다면 적은값해야하니까 오름차순
		
		int avg = sum/cnt;						//평균값
		
		int min = Math.abs(avg-arr[0]);			//첫번째 집이랑 평균값 차
		int minSpot = arr[0];					//일단 첫번쨰 집 답으로 해두고
		
		for (int i: arr) {
			int a = Math.abs(avg-i);			//평균값이랑 차이가
			if(min>a) {							//min보다 적으면 (같으면 그대로둘거임 오름차순)
				min = a;						//그값이 min가 되고
				minSpot = i;					//그 집이 답이됨
			}
		}
		
		System.out.println(minSpot);
	}
}
