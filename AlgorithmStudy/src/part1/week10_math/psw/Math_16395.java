package part1.week10_math.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math_16395 {
	final static String cute = new String("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
	final static String mad = new String("흥칫뿡!! <(￣ ﹌ ￣)>");

	public static int progress;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		StringBuffer num = new StringBuffer(br.readLine());
		
		if(num.length() > 1) {
			progress = num.charAt(0) - num.charAt(1);
			for (int i = 0; i < num.length()-1; i++) {
				if(!isProgression(num.charAt(i), num.charAt(i+1))) flag = false;
			}
		}
		
		System.out.println(flag ? cute : mad);
	}
	public static boolean isProgression(char a, char b) {
		return a-b == progress ?  true : false;
	}
}
