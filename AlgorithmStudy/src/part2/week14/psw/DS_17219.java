package part2.week14.psw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DS_17219 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			map.put(sc.next(), sc.next());
		}
		
		for (int i = 0; i < m; i++) {
			System.out.println(map.get(sc.next()));
		}
		
		sc.close();
	}
}
