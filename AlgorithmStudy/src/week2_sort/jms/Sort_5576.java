package week2_sort.jms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort_5576 {//
	public static void main(String[] args) {
		List<Integer> listOfScore = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) {
			listOfScore.add((int)(Math.random()*100+1));
		}
		
		Integer[] a = new Integer[10];
		Integer[] b = new Integer[10];
		int index = 0;
		
		for (int i = 0; i < 20; i++) {
			if (i <10) {
				a[i] = listOfScore.get(i);
			
			}else {
				b[index] = listOfScore.get(i);
				index++;
				
			}
		}

		Arrays.sort(a,Collections.reverseOrder());
		Arrays.sort(b,Collections.reverseOrder());

		int aScore = 0;
		int bScore = 0;

		
		for (int i = 0; i < 3; i++) {
			aScore += a[i];
			bScore += b[i];
		}
		System.out.println("a 값"+Arrays.toString(a));
		System.out.println("b 값"+Arrays.toString(b));
		System.out.println("a 값="+aScore);
		System.out.println("b 값="+bScore);
		
		
		
		
		
	}
	
}

