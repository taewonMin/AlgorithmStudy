package week10_math.psw;

import java.util.Scanner;

public class Math_16395 {
	public static int progress;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		StringBuffer num = new StringBuffer(String.valueOf(sc.nextLong()));
		
		if(num.length() > 1) {
			progress = num.charAt(0) - num.charAt(1);
			for (int i = 0; i < num.length()-1; i++) {
				if(!isProgression(num.charAt(i), num.charAt(i+1))) flag = false;
			}
		}
		System.out.println(flag ? "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!" : "흥칫뿡!! <(￣ ﹌ ￣)>");
		sc.close();
	}
	public static boolean isProgression(char a, char b) {
		return a-b == progress ?  true : false;
	}
}
