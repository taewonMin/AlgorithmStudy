package part2.week15.bbg;
import java.util.Scanner;
/** 38992KB 564ms */
public class Math_16162 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 음의 개수
		int A = sc.nextInt(); // 첫 항
		int D = sc.nextInt(); // 공차

		int[] X = new int[N];
		int curr = 1;
		for(int cnt = 0 ; cnt < N ; cnt++) {
			int temp = sc.nextInt();
			if(temp == A) {
				X[0] = temp;
			}else if(X[0] != 0 && X[curr-1] + D == temp) {
				X[curr++] = temp;
			}
		}
		if(X[0] != A) curr = 0;
		
		sc.close();
		
		System.out.println(curr);
	}
}
/* 예제는 나오는데 틀린거
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 음의 개수
		int A = sc.nextInt(); // 첫 항
		int D = sc.nextInt(); // 공차

		Set<Integer> set = new HashSet<>();
		int curr = 0;
		for(int cnt = 0 ; cnt < N ; cnt++) {
			int temp = sc.nextInt();
			// 첫항과 같으면 curr값 update 하고, curr+ 공차 와 같으면 또  curr값 update
			// set에 넣어서 size 구하기?
			if(temp == A) {
				curr = temp;
				set.add(temp);
			}else if(temp == curr + D) {
				curr = temp;
				set.add(temp);
			}
		}
		
		sc.close();
		
		System.out.println(set.size());
*/