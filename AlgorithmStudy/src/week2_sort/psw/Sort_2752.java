package week2_sort.psw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort_2752 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) { list.add(sc.nextInt()); }
		list.sort(null);
		for (int i = 0; i < list.size(); i++) { System.out.println(list.get(i));}
	}
}
