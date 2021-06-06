package week4_sort.psw;

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
		int a,b,c,d;
		a = list.get(0);
		b = list.get(1);
		c = list.get(2);
		d = list.get(3);
		int total = Math.min(a, b)*Math.min(c, d);
		System.out.println(total);
	}
}
