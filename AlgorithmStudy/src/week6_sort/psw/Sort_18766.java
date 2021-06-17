package week6_sort.psw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_18766 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			String[] firList = new String[n];
			for (int j = 0; j < firList.length; j++) {
				firList[j] = sc.next();
			}
			String[] secList = new String[n];
			for (int j = 0; j < secList.length; j++) {
				secList[j] = sc.next();
			}
			Arrays.sort(firList);
			Arrays.sort(secList);
			
			System.out.println(Arrays.equals(firList, secList) ? "NOT CHEATER" : "CHEATER");
		}
		
		sc.close();
	}
}
