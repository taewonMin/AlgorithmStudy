package part1.week4_sort.psw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sort_2959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++) {
			list.add(sc.nextInt());
		}
		sc.close();
		list.sort(Collections.reverseOrder());
		int total = Math.min(list.get(0), list.get(1))*Math.min(list.get(2), list.get(3));
		System.out.println(total);
	}
}
