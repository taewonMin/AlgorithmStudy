package week4_sort.jas;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_2959 {
/**
 * 
거북이는 이제 어떤 것에도 흥미를 느끼지 않는다. 그 이유는 거북이가 300년동안 살았고, 그 동안 모든 것들을 다 해보았기 때문이다. 
거북이는 시간을 떼우는 무엇인가를 하려고 한다. 이번 주말에 거북이는 거북이 세계에서 매우 유명한 게임인 "가장 큰 직사각형 만들기"를 해보려고 한다.
이 게임을 시작하기 전에 거북이는 양의 정수 네 개를 머릿 속에 생각해야 한다. 한 방향으로 움직이기 시작하고 90도 회전한 뒤에 새로운 방향으로 움직인다.
이런 식으로 세 번 90도 회전을 하고, 네 번 앞으로 움직여서 선분 네 개를 만들어야 한다.

거북이가 선분을 그릴 때 움직여야 하는 걸음의 수는 생각해 놓은 네 정수중 하나이다. 
이때, 한 정수를 각각 한 번씩 사용해야 한다. 거북이가 정수를 사용하는 순서에 따라서 다양한 모양이 만들어진다. 
어떤 모양은 직사각형을 만들 수 없기도 한다.

거북이가 만들 수 있는 가장 큰 직사각형을 계산하는 프로그램을 작성하시오.

입력
첫째 줄에 거북이가 생각한 네 양의 정수 A, B, C, D가 주어진다. (0 < A, B, C, D < 100)

출력
첫째 줄에 거북이가 만들 수 있는 가장 큰 직사각형의 면적을 출력한다.

예제 입력 1 
1 2 3 4
예제 출력 1 
3
힌트 
아래와 같이 움직이면 면적이 3인 직사각형을 만들 수 있다.

앞으로 네 걸음간다.
오른쪽으로 방향을 바꾼다.
한 걸음 앞으로 간다.
오른쪽으로 방향을 바꾼다
세 걸음 걷는다.
방향을 다시 90도 회전한다.
두 걸음 앞으로 걷는다.
 */
	//사각형이 성립할라면 꼭지점이 만나거나 점을 지나야함.. 0이상
	//2 4 6 8 이라면 큰거 만드려면 2,4가 마주보고, 6이랑 8이 마주봐야 사각형이 만들어지고 낭비도 덜할것같음
	//즉 정렬을 해서 0,1번째랑 2,3번째 끼리 큰거-작은거 해서 곱하면 면적나오지않을까
	  
	public static void main(String[] args) {
		
		int num[] = new int[4];					//4개정수 담을 배열
		
		Scanner scan = new Scanner(System.in);	
		for(int i = 0; i<num.length; i++ ) {
			num[i] = scan.nextInt();
		};
		
		Arrays.sort(num);
	
		System.out.println(num[0]*num[2]);
		
	}
	
}
