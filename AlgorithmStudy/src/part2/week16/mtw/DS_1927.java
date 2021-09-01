package part2.week16.mtw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DS_1927 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] minimumHeap = new int[N];
		int minimumHeapSize = 0;
		List<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			if(x == 0) {
				if(minimumHeapSize == 0) {
					answer.add(0);
				}else {
					answer.add(minimumHeap[--minimumHeapSize]);
				}
			}else {
				minimumHeap[minimumHeapSize] = x;
				// 삽입 정렬
				int j = minimumHeapSize;
				while(j > 0 && minimumHeap[j-1] < minimumHeap[j]) {
					int temp = minimumHeap[j-1];
					minimumHeap[j-1] = minimumHeap[j];
					minimumHeap[j] = temp;
					j--;
				}
				minimumHeapSize++;
			}
		}
		
		for(int i : answer) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
