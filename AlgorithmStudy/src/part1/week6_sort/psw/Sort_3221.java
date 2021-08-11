package part1.week6_sort.psw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_3221 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int time = sc.nextInt();
		int count = sc.nextInt();
		int[] list = new int[count];
		
		for (int i = 0; i < count; i++) {
			int now = sc.nextInt();
			boolean direction = "D".equals(sc.next()) ? true : false;
			
			int cycle = time/length;
			int run = time%length;
			
			if(!direction && now - run < 0) { // 왼쪽 벽
				now = Math.abs(now - run);
			}else if(direction && now + run > length) { // 오른쪽 벽
				now = length - Math.abs(length - (now + run));
			}else {
				now = direction ? now + run : now - run;
			}
			
			if(cycle%2 != 0) now = Math.abs(length - now);
			
			list[i] = now;
		}
		
		Arrays.sort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] +" ");
		}
		sc.close();
	}
	
}

