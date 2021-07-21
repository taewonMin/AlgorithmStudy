package week10_math.chw;

import java.util.Scanner;

public class Math_17294 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		char[] input = in.next().toCharArray();
		boolean result = true;
		int temp = 0;
		if(input.length > 1) {
			temp = input[0] - input[1];
		}
		
		for(int i = 0; i < input.length; i++) {
			if(i > 0 && input[i-1] - input[i] != temp) {
				result = false;
				break;
			}
		}
		System.out.println(result ? "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!" : "흥칫뿡!! <(￣ ﹌ ￣)>");
		in.close();
	}
}
