package week2_sort.bbg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_5576 {
	public static void main(String[] args) {
		Integer[] wArr = new Integer[10];
		Integer[] kArr = new Integer[10];
		Scanner sc = new Scanner(System.in);
		
		for(int cnt = 0; cnt < wArr.length + kArr.length; cnt++) {
			if(cnt < 10) {
				int temp = sc.nextInt();
				if(temp < 0 || temp > 100) {
					cnt--;
				}else {
					wArr[cnt] = temp;
				}
			}else {
				int temp = sc.nextInt();
				if(temp < 0 || temp > 100) {
					cnt--;
				}else {
					kArr[cnt-10] = temp;
				}
			}
			
		}

		Arrays.sort(wArr,Comparator.reverseOrder());
		Arrays.sort(kArr,Comparator.reverseOrder());
		
		int wScore = 0;
		int kScore = 0;
		
		for(int cnt = 0; cnt < 3 ; cnt++) {
			wScore += wArr[cnt];
			kScore += kArr[cnt];
		}
		System.out.println(wScore + " " + kScore);
	}

}
/*
문제
최근 온라인에서의 프로그래밍 콘테스트가 열렸다. W 대학과 K 대학의 컴퓨터 클럽은 이전부터 라이벌 관계에있어,이 콘테스트를 이용하여 양자의 우열을 정하자라는 것이되었다.

이번이 두 대학에서 모두 10 명씩이 콘테스트에 참여했다. 긴 논의 끝에 참가한 10 명 중 
득점이 높은 사람에서 3 명의 점수 -> 1~10번째 줄 int들 Collections.sort 내림차순 해서 3개 자름.
를 합산하여 대학의 득점으로하기로 했다. -> 자른 3개를 더함.

W 대학 및 K 대학 참가자의 점수 데이터가 주어진다. 이때, 각각의 대학의 점수를 계산하는 프로그램을 작성하라.

입력
입력은 20 행으로 구성된다. -> scanner 20번 enter로 구분해서 받기? 
1 번째 줄부터 10 번째 줄에는 W 대학의 각 참가자의 점수를 나타내는 정수가 
11 번째 줄부터 20 번째 줄에는 K 대학의 각 참가자의 점수를 나타내는 정수가 적혀있다. 
이 정수는 모두 0 이상 100 이하이다. -> 0 <= nextInt <= 100 

출력
W 대학 점수와 K 대학의 점수를 순서대로 공백으로 구분하여 출력하라. -> sysout( W대학점수 + " " + K대학점수 );

예문
23
23
20
15
15
14
13
9
7
6
25
19
17
17
16
13
12
11
9
5

답
66 61

예문
23
//103 103 - 23 = 80
23
20
15
15
14
13
9
7
6
25
19
17
17
16
13
12
11
9
5

답
66 61
*/