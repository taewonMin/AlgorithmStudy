package part1.week3_sort.bbg;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_13333 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int paperCnt = sc.nextInt();
		int[] qtCnts = new int[paperCnt];
		int qIndex = 0;
		
		
		
		for(int cnt=0 ; cnt < paperCnt ; cnt++) {
			qtCnts[cnt] = sc.nextInt();
		}
		
		Arrays.sort(qtCnts);
		
		
		for(int k = 1; k < paperCnt+1 ; k++) {
			for(int idx=0 ; idx < paperCnt ; idx++) {
				//죄송합니다...
				
			}
			if(paperCnt - k <= k) {
					qIndex = k;
			}
		}
		
		
		
	}
}


/*
문제
ICPC 대학의 모든 박사과정 학생은 자신이 발표한 논문과 그 논문들의 인용횟수를 고려한 학위 취득 조건을 만족해야 한다. 
이를 위해, ICPC 대학은 q-인덱스라는 값을 정의했다. 이 인덱스는 논문들의 중요도를 측정하기 위해, 가장 많이 인용된 논문들의 개수와 그 논문들의 인용횟수를 이용하여 다음과 같이 정의된다. 
한 학생이 발표한 총 n ≥ 1 편의 논문 중에서, k번 이상 인용된 논문이 k편 이상이고 나머지 n − k 편의 논문들 인용회수가 각각 k 번 이하라면, 해당 학생의 q-인덱스는 k이다.
-> 인용횟수 배열 정렬해서 논문수 활용..
k번 이상 인용된 논문 ==> k보다 큰 값이 k개 이상 -> 0번방부터 k랑 비교해서 가장 처음으로 k보다 큰 값의 idx가 a이면, length-a 가 (5-0 = 5) >= k
n-k개의 논문 인용 횟수 는 k보다 작거나 같다.

예를 들어, 한 학생이 발표한 논문이 총 5 편이고, 각 논문의 인용횟수가 8, 4, 5, 3, 10 이라 하자. 한 번 이상 인용된 논문이 1 편 이상이지만 나머지 4 편의 논문 중에는 한 번 보다 
더 많이 인용된 논문이 존재하기 때문에 q-인덱스는 1 이 아니다. 그리고 모든 논문이 5 번 이상 인용되지 않았기 때문에, 인덱스 값이 5 가 될 수도 없다. 
이 학생의 q-인덱스는 결국 4 가 되는 데, 그 이유는 4 번 이상 인용된 논문 4 편이 있고, 나머지 1 편은 4 번 이하의 인용횟수를 갖기 때문이다.

한 학생의 논문들의 인용횟수가 주어지면, 이 학생의 q-인덱스를 계산하는 프로그램을 작성하시오.

입력
프로그램의 입력은 표준 입력으로 받는다. 입력의 첫 줄에는 학생이 발표한 논문의 수 n (1 ≤ n ≤ 1,000)이 주어진다. 
다음 줄에는 n 개의 논문들에 대한 인용횟수가 빈 칸을 사이에 두고 차례로 주어진다. 각 인용횟수는 0 이상 10,000 이하의 정수 값이다.

출력
표준 출력으로 답을 출력한다. 주어진 입력에 대한 q-인덱스 (음이 아닌 정수) 값 하나를 출력한다.


*/