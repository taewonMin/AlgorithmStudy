package part1.week5_sort.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_15819 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int cnt = in.nextInt();
		int location = in.nextInt();
		String[] handles = new String[cnt];
		
		for(int i = 0; i < cnt; i++) {
			handles[i] = in.next();
		}
		
		Arrays.sort(handles);
		
		System.out.println(handles[location - 1]);
		
		in.close();
	}
}

