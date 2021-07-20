package week10_math.bbg;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//귀여운 //다시커밋
public class Math_17294 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigDecimal num = new BigDecimal(sc.next());
		int length = num.precision();
		BigDecimal[] numArr = new BigDecimal[length]; // 정수만 준다는 가정 하에
		int idx = length-1;
		while(idx >= 0) {
			BigDecimal temp = num.remainder(new BigDecimal("10"));
			numArr[idx--] = temp;
			num = num.divide(new BigDecimal("10")).setScale(0, RoundingMode.FLOOR);
		}
		BigDecimal dist = BigDecimal.ZERO;
		if(length != 1)  dist = numArr[0].subtract(numArr[1]);
		boolean flag = true; 
		idx = 1;
		while(length != 1 && flag && idx < length-1) flag = numArr[idx].subtract(dist) == numArr[idx++ +1] ? true : false;

		System.out.println(length == 1 || (idx == length-1 && flag ) ? "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!" : "흥칫뿡!! <(￣ ﹌ ￣)>");
		
		sc.close();
	}
}

