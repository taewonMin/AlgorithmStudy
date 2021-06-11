package week5_sort.psw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort_15819 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		int index = sc.nextInt()-1;
		
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < length; i++) {
			list.add(sc.next());
		}

		list.sort(null);
		System.out.println(list.get(index));
		
		sc.close();
	}
}
