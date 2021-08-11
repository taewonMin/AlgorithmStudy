package part1.week3_sort.mtw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// 듣보잡
public class Sort_1764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> answer = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		
		int N = sc.nextInt();	// 듣도
		int M = sc.nextInt();	// 보도
		
		// 듣도 못한 자들
		for(int i=0; i<N; i++) {
			set.add(sc.next());
		}
		
		// 보도 못한 자들
		for(int i=0; i<M; i++) {
			String name = sc.next();
			if(set.contains(name)) {
				answer.add(name);
			}
		}
		
		answer.sort(null);
		
		// 출력
		System.out.println(answer.size());
		for(String name : answer) {
			System.out.println(name);
		}
		
		sc.close();
	}
}
