package part1.week9_math.mtw;

import java.util.Scanner;

// 조별과제를 하려는데 조장이 사라졌다
public class Math_15727 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int t = L % 5 == 0 ? L/5 : L/5 + 1;
		
		System.out.println(t);
		
		sc.close();
	}
}
