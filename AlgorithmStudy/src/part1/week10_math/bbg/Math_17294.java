package part1.week10_math.bbg;

import java.util.Scanner;

//귀여운
public class Math_17294 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		
		String[] arr = num.split("");
		float dist = 0;
		if(arr.length != 1) dist = (float) (Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]));
		boolean flag = true;
		int count = 0;
		while(arr.length != 1 && flag && count < arr.length-1) flag = Integer.parseInt(arr[count]) - dist == Integer.parseInt(arr[count++ +1]) ? true : false;
			
		System.out.println(arr.length == 1 || (count == arr.length-1 && flag ) ? "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!" : "흥칫뿡!! <(￣ ﹌ ￣)>");
		
		sc.close();
	}
}

