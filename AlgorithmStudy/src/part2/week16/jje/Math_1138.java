package part2.week16.jje;

import java.util.ArrayList;
import java.util.Scanner;

public class Math_1138 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int humanNum = sc.nextInt();
		ArrayList<Integer> line = new ArrayList<>();
		int[] reverseLine = new int[humanNum];
		for (int i = 0; i < humanNum ; i++) {
			reverseLine[i] = sc.nextInt();
		}
		 for (int i = humanNum; i >= 1 ; i--) {
		 	line.add(reverseLine[i-1], i);
		 }

		for (int result:line) {
			System.out.println(result);
		}
		/**
		 for (int i = 1; i <= humanNum ; i++) {
		 int count = 0;
		 int num = sc.nextInt();
		 for (int j = 0; j < humanNum; j++) {
		 if (line[j] > i) {
		 count++;
		 }
		 int temp = j+1;
		 if(temp == humanNum){
		 temp = 0;
		 }
		 if (count == num && line[temp] == humanNum) {
		 line[temp] = i;
		 break;
		 }else if(count == num){
		 count--;
		 }
		 }
		 }
		 for (int result:line) {
		 System.out.println(result);
		 }
		 **/
		sc.close();
	}
}
