package part2.week15.psw;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Math_16162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long start = sc.nextLong();
		long step = sc.nextLong();
		
		long answer = 0;
		
		Set<Long> list = new HashSet<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextLong());
		}
		
		while(true) {
			if(list.contains(start)) {
				start += step;
				answer++;
			}else {
				break;
			}
		}
		System.out.println(answer);
		
		sc.close();
	}
}
