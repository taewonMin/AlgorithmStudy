package week4_sort.psw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort_18310 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			list.add(num);
			total += num;
		}
		sc.close();
		
		float avg = total/(float)n;
		
		
		
		list.sort(Collections.reverseOrder());
		
	}
}
