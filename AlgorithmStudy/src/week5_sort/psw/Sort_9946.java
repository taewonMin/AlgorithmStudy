package week5_sort.psw;

import java.util.ArrayList;
import java.util.List;
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
			System.out.println("Case "+i+": "+answer);
			i++;
		}
		
		sc.close();
	}
	
	public static boolean isEquals(char[] list1, char[] list2) {
		List<String> list = new ArrayList<String>();
		List<String> mix = new ArrayList<String>();
		if(list1.length != list2.length) return false;
		
		for (int i = 0; i < list1.length; i++) {
			list.add(String.valueOf(list1[i]));
			mix.add(String.valueOf(list2[i]));
		}
		list.sort(null);
		mix.sort(null);
		for (int i = 0; i < list.size(); i++) {
			if(!list.get(i).equals(mix.get(i))) return false;
		}
		
		return true;
	}
	
	
}
