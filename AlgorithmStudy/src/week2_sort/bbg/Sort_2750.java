package week2_sort.bbg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Sort_2750 {
	public static void main(String[] args) {
		int N = (int)(Math.random() * 1000) + 1;
//		int N = 6;
		System.out.println("반복횟수 >> "+N);
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		
		for(int cnt = 0; cnt < N ; cnt++) {
			int temp = sc.nextInt();
			if(temp <= 1000 && !set.contains(temp)) {
				set.add(temp);
			}else {
				cnt--;
			}
		}
		
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		for(int cnt=0; cnt<list.size() ; cnt++) {
			System.out.println(list.get(cnt));
		}
	}

}
/*
문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. -> int N = random값? 범위가 1 이상 1000 이하인. 1~1001
 										-> (int)(Math.random() * 1000) + 1
둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. -> scanner로 N번만큼 enter로 구분하여 정수 N개 받기 . 받는 동시에 sysout 찍기
수는 중복되지 않는다. -> set에 넣는다. 중복된 값 넣느라 cnt 그냥 지나가버리면? -> 우리는 중복된 수를 주지 않을거야! 라는 의미.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
set을 Collections.sort를 이용하여 오름차순으로 정렬. -> set을 list에 담아서 sort

예문 // 스캐너로 입력하는 값. 
5
5
2
3
4
1
답
1
2
3
4
5

*/