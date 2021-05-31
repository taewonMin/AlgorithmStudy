package week3_sort.psw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Sort_13333 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		
		list.sort(null);
		
		for (int i = 0; i < n; i++) {
			int k = list.get(i);
			if(k <= n-i) {
				
				answer = k;
				
				if(i+1 < n) {
					int q = list.get(i+1);
					for (int j = 0; j < q-k; j++) {
						
						if(q - (j+1) < n-i) {
							answer = q - (j+1);
							break;
						}
					}
				}
			}
		}
		if(list.get(0) > n) answer = n;
		System.out.println(answer);
	}
}
