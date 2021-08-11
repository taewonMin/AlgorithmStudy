package part1.week5_sort.mtw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 단어퍼즐
public class Sort_9946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input1 = "";
		String input2 = "";
		List<String> answer = new ArrayList<String>();
		
		while(true) {
			input1 = sc.nextLine();
			input2 = sc.nextLine();
			
			if("END".equals(input1) && "END".equals(input2)) {
				break;
			}
			
			String[] arr1 = input1.split("");
			String[] arr2 = input2.split("");
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(arr1.length != arr2.length || !Arrays.deepEquals(arr1, arr2)) {
				answer.add("different");
			}else {
				answer.add("same");
			}
		}
		
		for(int i=0; i<answer.size(); i++) {
			System.out.println("Case " + (i+1) + ": " + answer.get(i));
		}
		
		sc.close();
	}
}
