package week4_sort.psw;

import java.util.ArrayList;
import java.util.List;

public class Programmers_기능개발 {
	public static void main(String[] args) {
		int[] answer = {};
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		
		List<Integer> proList = new ArrayList<>();
		List<Integer> speedList = new ArrayList<>();
		List<Integer> answerList = new ArrayList<>();

		for (int i = 0; i < progresses.length; i++) {
			proList.add(progresses[i]);
			speedList.add(speeds[i]);
		}

		int acnt = 0;
		while(proList.size() != 0) {

			if(proList.get(0) > 99) {
				proList.remove(0);
				speedList.remove(0);
				acnt++;
				continue;

			}else {
				if(acnt > 0) {
					answerList.add(acnt);
					acnt = 0;
				}

				for (int i = 0; i < proList.size(); i++) {
					proList.set(i, proList.get(i) + speedList.get(i));
				}
			}
		}
		answerList.add(acnt);

		answer = new int[answerList.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = answerList.get(i);
		}
	}
}

