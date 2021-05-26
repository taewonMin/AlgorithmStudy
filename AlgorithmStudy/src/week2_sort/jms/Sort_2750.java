package week2_sort.jms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort_2750 {
	public static void main(String[] args) {
		
		int arr[] = {1,6,2,3,4,5,5};
		
		List<Integer> rowOfNum =new ArrayList<Integer>();
		
		for (Integer num : arr) {
			boolean exist = false;
			for (int i = 0; i < rowOfNum.size(); i++) {
				if(num == rowOfNum.get(i)) exist=true;
			}
				if (!exist) rowOfNum.add(num);	
			}
		rowOfNum.sort(Comparator.naturalOrder());
		
		System.out.println(rowOfNum.toString());
	
	}
}
