package part2.week15.phk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//109716kb	908ms
public class DS_10773 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		//int[] arr = new int[k];
		

		for(int i = 0; i < k; i++) {
			int temp = sc.nextInt();
			if(temp == 0) list.remove(list.size()-1);
			else list.add(temp);
			
		}
		
		int sum = 0;
		for(int i : list) {
			sum += i;
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
