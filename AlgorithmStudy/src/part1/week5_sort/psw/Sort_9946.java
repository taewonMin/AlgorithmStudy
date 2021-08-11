package part1.week5_sort.psw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_9946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (true) {
			String listStr = sc.next();
			String mixStr = sc.next();
			if("END".equals(listStr) && "END".equals(mixStr)) break;
			String answer = isEquals(listStr.toCharArray(),mixStr.toCharArray()) ? "same" : "different";
			// toCharArray가 파일용량도 줄여주면서 속도도 빠르다고 하셨다.
			System.out.println("Case "+i+": "+answer);
			i++;
		}
		sc.close();
	}
	
	public static boolean isEquals(char[] list1, char[] list2) {
		if(list1.length != list2.length) return false;
		
		Arrays.sort(list1);
		Arrays.sort(list2);
		
		if (!Arrays.equals(list1, list2)) return false;
		
		return true;
	}
	
	
}
