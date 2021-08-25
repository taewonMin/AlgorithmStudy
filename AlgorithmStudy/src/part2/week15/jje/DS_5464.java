package part2.week15.jje;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class DS_5464 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;

		ArrayList<Integer> nArray = new ArrayList<Integer>();
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		int[] mArray = new int[m];
		LinkedList<Integer> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			nArray.add(sc.nextInt());
			resultList.add(0);
		}

		for (int i = 0; i < m; i++) {
			mArray[i] = sc.nextInt();
		}

		for (int i = 0; i < m*2; i++) {
			int car = sc.nextInt();
			int temp = 0;
			if(car<0) {
				temp = resultList.indexOf(Math.abs(car));
				resultList.remove(temp);
				if (!queue.isEmpty()) {
					int popCar = queue.pop();
					resultList.add(temp, popCar);
					result += (mArray[popCar - 1] * nArray.get(temp));
				} else {
					resultList.add(temp, 0);
				}
			}else {
				temp = resultList.indexOf(0);
				if(temp==-1){
					queue.offerLast(car);
				}else {
					resultList.remove(temp);
					if (!queue.isEmpty()) {
						int popCar = queue.pop();
						resultList.add(temp, popCar);
						result += (mArray[popCar - 1] * nArray.get(temp));
						queue.offerLast(car);
					} else {
						resultList.add(temp, car);
						result += (mArray[(car - 1)] * nArray.get(temp));
					}
				}
			}
		}
		System.out.println(result);
		sc.close();
	}
}
