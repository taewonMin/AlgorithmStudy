package week3_sort.psw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 테스트 통과 하지만... 실패... 
public class Sort_13333 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		list.sort(null);
		for (int i = 0; i < n; i++) {
			int k = list.get(i);
			if(k <= n-i) {
				answer = k;
			}
		}
		System.out.println(answer);
	}
}
