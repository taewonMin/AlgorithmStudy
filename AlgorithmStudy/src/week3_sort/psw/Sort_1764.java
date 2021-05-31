package week3_sort.psw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort_1764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<String> list = new ArrayList<String>();
		List<String> answer = new ArrayList<String>();
		for (int i = 0; i < n+m; i++) {
			list.add(sc.next());
		}
		list.sort(null);
		for (int i = 1; i < list.size(); i++) {
			if(list.get(i-1).equals(list.get(i))) {
				answer.add(list.get(i));
			}
		}
		System.out.println(answer.size());
		for (int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
}
