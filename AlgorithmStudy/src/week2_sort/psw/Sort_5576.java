package week2_sort.psw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sort_5576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> wc = new ArrayList<Integer>();
		List<Integer> kc = new ArrayList<Integer>();	
		for (int i = 0; i < 10; i++) { wc.add(sc.nextInt()); }
		for (int i = 0; i < 10; i++) { kc.add(sc.nextInt()); }
		wc.sort(new Sort());
		kc.sort(new Sort());
		System.out.print((wc.get(0)+wc.get(1)+wc.get(2)) + " " + (kc.get(0)+kc.get(1)+kc.get(2)));
	}
}
class Sort implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2);
	}
	
}