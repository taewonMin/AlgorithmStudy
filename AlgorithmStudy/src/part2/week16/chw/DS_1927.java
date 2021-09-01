package part2.week16.chw;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DS_1927 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < cnt; i++) {
			int input = sc.nextInt();
			if (input == 0 && list.size() == 0) {
				System.out.println(0);
			}else if(input == 0) {
				System.out.println(list.poll());
			}else {
				Iterator<Integer> iter = list.iterator();
				int idx = 0;
				while(iter.hasNext()) {
					if(iter.next() > input) {
						break;
					}
					idx++;
				}
				list.add(idx,input);
			}
		}
		sc.close();
	}
}
