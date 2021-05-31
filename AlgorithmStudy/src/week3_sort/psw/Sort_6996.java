package week3_sort.psw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sort_6996 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = new ArrayList<String>();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String y = sc.nextLine();
			String[] x = y.split(" ");
			
			String a = x[0];
			String b = x[1];
			
			String answer = a + " & " + b + " are ";
			answer += isAnagram(a, b);
			list.add(answer);
		}
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}
	
	public static String isAnagram(String a, String b) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		for (int i = 0; i < a.length(); i++) {
			list1.add(a.charAt(i)+"");
		}
		for (int i = 0; i < b.length(); i++) {
			list2.add(b.charAt(i)+"");
		}
		list1.sort(null);
		list2.sort(null);
		
		if(list1.size() != list2.size()) return "NOT anagrams.";
		
		for (int i = 0; i < list1.size(); i++) {
			if (list1.size() != 0 && !list1.get(i).equals(list2.get(i))) {
				return "NOT anagrams.";
			}
		}
		return "anagrams.";
	}
}
