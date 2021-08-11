package part1.week2_sort.bbg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sort_2752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		
		while(set.size() < 3) { // 3보다 작을 때 돈다
			int temp = sc.nextInt();
			if(1 <= temp && temp <= 1000000) {
				set.add(temp);
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
		
		System.out.println(list.get(0) + " " + list.get(1) + " " + list.get(2));
	}

}

/*
문제
동규는 세수를 하다가 정렬이 하고싶어졌다.

숫자 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어 졌다.

숫자 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.

입력
숫자 세 개가 주어진다. -> scanner nextInt로 3개 받기 (띄어쓰기?)
이 숫자는 1보다 크거나 같고, 1,000,000보다 작거나 같다. -> 1 <= nextInt 값 && nextInt값 <= 1000000   
이 숫자는 모두 다르다. -> 받은걸 바로 set에 넣어서 length = 3이 될때까지 받기.


->	set 객체 선언
	while문으로 set의 length가 3이 아니면 돌기.
	if( 1 <= nextInt 값 && nextInt값 <= 1000000 ){
		continue;
	}else{
		nextInt값을 set에 담기.
	}
	
	set객체를 Collections.sort해서 ??? set은 sort하려면 list로 변경 -> new ArrayList(set객체) 생성하기.
	sysoutprint(sort한거 idx대로 띄어쓰기 하나 넣어서 반복출력)
	

출력
제일 작은 수, 그 다음 수, 제일 큰 수를 차례대로 출력한다.


예문
3 1 2
답
1 2 3

*/