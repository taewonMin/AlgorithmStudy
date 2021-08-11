package part2.week13.psw;

import java.util.Scanner;

public class Math_13458 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sections = new int[n];
		
		for (int i = 0; i < sections.length; i++) {
			sections[i] = sc.nextInt();
		}
		int main = sc.nextInt();
		int sub = sc.nextInt();

		long answer = sections.length;
		
		for (int i = 0; i < sections.length; i++) {
			if(sections[i] > main) {
				int total = sections[i] - main;
				answer += Math.ceil((float)total/sub);
			}
		}
		
		System.out.println(answer);
		sc.close();
	}
}
