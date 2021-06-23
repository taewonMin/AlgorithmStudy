package week6_sort.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_18766 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int cnt = in.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			int count = in.nextInt();
			String[] firArr = new String[count];
			String[] secArr = new String[count];
			for(int j = 0; j < count; j++) {
				firArr[j] = in.next();
			}
			for(int j = 0; j < count; j++) {
				secArr[j] = in.next();
			}
			Arrays.sort(firArr);
			Arrays.sort(secArr);
			
			// 배열 --> 문자열
			String fir = Arrays.toString(firArr);
			String sec = Arrays.toString(secArr);
			
			if(fir.equals(sec)) {
				System.out.println("NOT CHEATER");
			}else {
				System.out.println("CHEATER");
			}
			
		}
		
		
	}
}
