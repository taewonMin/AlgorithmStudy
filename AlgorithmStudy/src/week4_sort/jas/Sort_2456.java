package week4_sort.jas;

import java.util.Scanner;

public class Sort_2456 {
	/**
	 N명의 학생들이 모인 초등학교 반에서 학급회장 선거를 하려고 한다. 
	 그 중 3명이 회장후보로 나왔고, 이들에 대한 선호도를 N명의 학생들 각각에게 적어내도록 하였다. 
	 세 명의 후보는 후보 1번, 후보 2번, 후보 3번이라 한다.

	모든 학생은 3명의 후보 중에서 가장 선호하는 후보에게는 3점, 두 번째로 선호하는 후보에게는 2점, 
	가장 선호하지 않는 후보에게는 1점을 주어야 한다. 3명의 후보에 대한 한 학생의 선호 점수는 모두 다르며, 
	1점, 2점, 3점이 정확히 한 번씩 나타나야 한다. 

	후보의 최종 점수는 학생들로부터 받은 자신의 선호도 점수를 모두 더한 값이 된다. 그러면 3명의 후보 중 
	가장 큰 점수를 받은 후보가 회장으로 결정된다. 단, 점수가 가장 큰 후보가 여러 명인 경우에는 
	3점을 더 많이 받은 후보를 회장으로 결정하고, 3점을 받은 횟수가 같은 경우에는 2점을 더 많이 받은 
	후보를 회장으로 결정한다. 그러나 3점과 2점을 받은 횟수가 모두 동일하면, 1점을 받은 횟수도 같을 
	수밖에 없어 회장을 결정하지 못하게 된다.

	여러분은 선호도 투표를 통해 얻은 세 후보의 점수를 계산한 후, 유일하게 회장이 결정되는 경우에는 회장으로 
	결정된 후보의 번호(1, 2, 3 중 한 번호)와 최고 점수를 출력하고, 회장을 결정하지 못하는 경우에는 
	번호 0과 최고 점수를 출력하는 프로그램을 작성하시오. 
	
	 */
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		  
		int cnt = scan.nextInt();				//총학생수 입력
		
		int arr[] = new int[cnt*3];				//학생수*3표씩 행사
		
		int a = 0;
		int b = 0;
		int c = 0;								//후보3명
		for(int i =0; i<arr.length ; i++) {
			arr[i] = scan.nextInt();			//선호도 입력받음
			if(i/3 == 0) {
				a += arr[i];
			}else if(i/3 <2){
				b += arr[i];
			}else {
				c += arr[i];
			}
		}
		
		
		
		
		
	}
}
