package part2.week14.jje;

import java.util.LinkedList;
import java.util.Scanner;

public class DS_1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		// 10 3 / 1 2 3 -> 0

		// 10 3 / 2 9 5 -> 8
		LinkedList<Integer> queue = new LinkedList<Integer>();

		int[] inputArray = new int[m];
		int num = 0;

		for (int i = 0; i < m; i++) {
			inputArray[i]=sc.nextInt();
		}
		for (int i = 1; i <= n ; i++) {
			queue.addLast(i);
		}

		int middleNum=0;

		if(queue.size() % 2 == 0){
			middleNum= queue.size()/2-1;
		}else{
			middleNum=queue.size()/2;
		}

		for (int i = 0; i < m; i++) {

			if(queue.indexOf(inputArray[i])<=middleNum) {
				for (int j = 0; j < n; j++) {
					if(queue.getFirst()==inputArray[i]) {
						break;
					}
					queue.addLast(queue.pollFirst());
					num++;
				}
			}else {
				for (int j = 0; j < n; j++) {
					if(queue.getFirst()==inputArray[i]) {
						break;
					}
					queue.addFirst(queue.pollLast());
					num++;
				}
			}
		}

		System.out.println(num);

		sc.close();
	}
}
