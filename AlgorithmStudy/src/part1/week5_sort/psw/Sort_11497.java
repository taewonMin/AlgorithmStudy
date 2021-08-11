package part1.week5_sort.psw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort_11497 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			List<Integer> list = new ArrayList<Integer>();
			int length = sc.nextInt();
			for (int j = 0; j < length; j++) {
				list.add(sc.nextInt());
			}
			
			list.sort((Integer a, Integer b) -> -a.compareTo(b));
			int[] answerList = new int[list.size()];
			for (int j = 0; j < answerList.length; j++) {
				int index = j%2 == 0 ? j/2 : answerList.length-((j/2)+1);
				answerList[index] = list.remove(list.size()-1);
			}
			
			int answer = Math.abs(answerList[0]-answerList[answerList.length-1]);
			for (int j = 0; j < answerList.length-1; j++) {
				int temp = Math.abs(answerList[j]-answerList[j+1]);
				if(answer < temp) answer = temp;
			}
			
			System.out.println(answer);
		}
		
		sc.close();
	}
}
