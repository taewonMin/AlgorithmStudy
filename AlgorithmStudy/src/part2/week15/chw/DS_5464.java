package part2.week15.chw;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class DS_5464 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] Rs = new int[N];
		int[] Wk = new int[M];
		for(int i = 0; i < N; i++) {
			Rs[i] = sc.nextInt();
		}
		for(int i = 0; i < M; i++) {
			Wk[i] = sc.nextInt();
		}
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		int[] checkArr = new int[N];
		for(int i = 0; i < M*2; i++) {
			list.add(sc.nextInt());
		}
		
		while(list.isEmpty()) {
			int num = list.poll();
			if(Arrays.asList(checkArr).contains(0)) {
				checkArr[Arrays.asList(checkArr).indexOf(0)] = num;
			}
		}
		
		
		sc.close();
	}
}
