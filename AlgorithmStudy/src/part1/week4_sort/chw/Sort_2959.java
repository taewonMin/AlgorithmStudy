package part1.week4_sort.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_2959 {
public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
       	
		int[] list = new int[4];
		for(int i = 0; i < 4; i++) {
			list[i] = in.nextInt();
		}
		Arrays.sort(list);
		
		System.out.println(list[0] * list[2]);
		
		in.close();
	}
}
