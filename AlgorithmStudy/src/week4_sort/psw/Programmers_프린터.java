package week4_sort.psw;

import java.util.ArrayList;
import java.util.List;

public class Programmers_프린터 {
	public static void main(String[] args) {
		int answer = 0;
		int[] priorities = {2, 1, 3, 2};
		int location = 2;
		
		List<Integer> documentList = new ArrayList<>();
		List<Integer> prioritiesList = new ArrayList<>();
		
		for (int i = 0; i < priorities.length; i++) {
			documentList.add(i);
			prioritiesList.add(priorities[i]);
		}

		
		boolean chk = false;
		int i = 0;
		while(i != priorities.length) {
			int temp = prioritiesList.get(i);
			while(true) {
				if(temp > 8) break;
				
				if(prioritiesList.lastIndexOf(++temp) > i) {
					prioritiesList.add(prioritiesList.remove(i));
					documentList.add(documentList.remove(i));
					i = 0;
					chk = true;
					break;
				}
			}
			
			if(chk && i == 0) {
				chk = false;
				continue;
			}
			
			i++;
		}
		
		answer = documentList.indexOf(location) + 1;
		
		System.out.println(answer);
	}
}

