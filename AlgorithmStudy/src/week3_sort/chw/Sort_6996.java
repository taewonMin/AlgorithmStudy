package week3_sort.chw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sort_6996 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int testCnt = in.nextInt(); 
		
		for(int test = 0; test < testCnt; test++) {
			String pre = in.next();
			String post = in.next();
			if(pre.length() == post.length()) {
				char[] preStringtoChar = pre.toCharArray();
				Arrays.sort(preStringtoChar);
				String preSortedString = new String(preStringtoChar);
				
				char[] postStringtoChar = post.toCharArray();
				Arrays.sort(postStringtoChar);
				String postSortedString = new String(postStringtoChar);
				
				if(preSortedString.equals(postSortedString)) {
					System.out.println(pre + " & "+ post + " are anagrams.");
				}else {
					System.out.println(pre + " & "+ post + " are NOT anagrams.");
				}
			}else {
				System.out.println(pre + " & "+ post + " are NOT anagrams.");
			}
		}
		
	}
}
