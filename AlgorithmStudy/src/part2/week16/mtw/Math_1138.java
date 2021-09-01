package part2.week16.mtw;

import java.util.Scanner;

public class Math_1138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] arr = new String[N];
		int height = 1;
		for(int i=0; i<N; i++) {
			int left = sc.nextInt();
			for(int j=0; j<left; j++) {
				if(arr[j] != null) {
					left++;
				}
			}
			while(true) {
				if(arr[left] == null) {
					arr[left] = String.valueOf(height++);
					break;
				}
				left++;
			}
		}
		
		System.out.println(String.join(" ", arr));
		
		sc.close();
	}
}
