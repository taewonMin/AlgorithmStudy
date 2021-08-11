package part1.week10_math.jje;

import java.util.Scanner;

public class Math_17294 {
	
	static String cute = "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!";
	static String uncute = "흥칫뿡!! <(￣ ﹌ ￣)>";
	
	public static void main(String[] args) {
		 
		//욱제는 귀여운 수~ε٩(๑> ₃ <)۶з를 좋아한다. 
		//귀여운 수~ε٩(๑> ₃ <)۶з는 수를 이루는 각 자릿수가 등차수열[*]을 이루는 수이다. 
		//당신은 욱제한테 귀여운 수~ε٩(๑> ₃ <)۶з 하나를 선물해주고 싶다. 수 하나가 주어졌을 때 이 수가 귀여운지 판단하는 프로그램을 짜 보자.
		
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		String dap = (num.length()==1)?cute:returnCute(num);
		System.out.println(dap);
		
		sc.close();
	}
	
	static String returnCute(String num) {
		
		int cha = num.charAt(0)-num.charAt(1);
		for (int i = 1; i < num.length(); i++) {
			if(cha!=(num.charAt(i-1)-num.charAt(i))) {
				return uncute;
			}
		}	
		return cute;
	}	
}
