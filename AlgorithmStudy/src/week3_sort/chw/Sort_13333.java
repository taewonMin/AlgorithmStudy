package week3_sort.chw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort_13333 {
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// 하드코딩 테스트
		int noHeardPeopleCnt = 3;
		int noSeePeopleCnt = 4;

//		int noHeardPeopleCnt = in.nextInt();
//		int noSeePeopleCnt = in.nextInt();
		
		int totalCnt = 0;

		
		
		
		List<String> noHeardPeople = new ArrayList<String>(); 
		List<String> noSeePeople = new ArrayList<String>(); 
		List<String> totalPeople = new ArrayList<String>(); 
		
//		for(int i = 0; i < noHeardPeopleCnt; i++) {
//			noHeardPeople.add(in.next());
//		}
//		for(int i = 0; i < noSeePeopleCnt; i++) {
//			noSeePeople.add(in.next());
//		}
		
		
		// 하드코딩 테스트
		noHeardPeople.add("ohhenrie");
		noHeardPeople.add("charlie");
		noHeardPeople.add("baesangwook");
		noSeePeople.add("obama");
		noSeePeople.add("baesangwook");
		noSeePeople.add("ohhenrie");
		noSeePeople.add("clinton");
		
		
		for(int i = 0; i < noSeePeople.size(); i++) {
			for(int j = 0; j < noHeardPeople.size(); j++) {
				if(noSeePeople.get(i).equals(noHeardPeople.get(j))) {
					totalCnt += 1;
					totalPeople.add(noSeePeople.get(i));
				}
			}
		}
		
		System.out.println(totalCnt);
		for(String people : totalPeople) {
			System.out.println(people);
			
		}
		
	}
}
