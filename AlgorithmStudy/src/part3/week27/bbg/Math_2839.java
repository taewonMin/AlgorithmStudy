package part3.week27.bbg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Math_2839 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	sc.close();
    	
    	List<Integer> list = new ArrayList<Integer>();
    	
    	int cnt = 0;
    	for(int i = N/5 ; i >= 0 ; i--) {
    		for(int j = 0 ; j < N/3 ; j++) {
    			if(5 * i + 3 * j == N) {
    				list.add(i+j);
    			}
    		}
    	}
    	if(list.size() == 0)
	    	for(int j = 0 ; j <= N/3 ; j++) {
				if(3 * j == N) 
					list.add(j);
			}
    	
    	list.sort(Comparator.reverseOrder());
    	
    	System.out.println(list.size() == 0 ? -1 : list.get(0));
    	
    }
}
