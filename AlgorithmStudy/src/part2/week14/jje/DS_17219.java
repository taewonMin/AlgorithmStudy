package part2.week14.jje;

import java.util.HashMap;
import java.util.Scanner;

public class DS_17219 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		HashMap<String, String> passwordMap = new HashMap<String, String>();
		int n = sc.nextInt();
		int m = sc.nextInt();

		for(int i = 0; i < n; i++) {
			passwordMap.put(sc.next(), sc.next());
		}

		for (int i = 0; i < m; i++) {
			System.out.println(passwordMap.get(sc.next()));
		}
		sc.close();
	}
}
