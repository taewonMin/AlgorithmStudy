package part1.week10_math.mtw;

import java.util.Scanner;

// 귀여운 수~ε٩(๑> ₃ <)۶з
public class Math_17294 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		
		String result = "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!";
		if(num.length() > 1) {
			int interval = num.charAt(0) - num.charAt(1);
			for(int i=1; i<num.length()-1; i++) {
				int nextInterval = num.charAt(i) - num.charAt(i+1);
				if(interval != nextInterval) {
					result = "흥칫뿡!! <(￣ ﹌ ￣)>";
					break;
				}
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}
