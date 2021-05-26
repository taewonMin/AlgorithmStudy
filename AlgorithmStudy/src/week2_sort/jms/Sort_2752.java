package week2_sort.jms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort_2752 {//
	public static void main(String[] args) {
		List<Long> listOfNum = new ArrayList<Long>();
		for (int i = 0; i < 3; i++) {
			listOfNum.add((long)(Math.random()*1000000+1));
		}
		
		listOfNum.sort(Comparator.naturalOrder());
		
		
		System.out.println(listOfNum.toString());
		
	}
}
