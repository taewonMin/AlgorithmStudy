package part1.week5_sort.chw;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_9946 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int caseCnt = 1;
		while(true) {
			String result = "same";
			String firstWord = in.next();
			String returnWord = in.next();
			
			String[] firstWordArr = firstWord.split("");
			String[] returnWordArr = returnWord.split("");
			
			Arrays.sort(firstWordArr);
			Arrays.sort(returnWordArr);
			
			if(firstWord.length() != returnWord.length()) {
				result = "different";
			}else {
				if("END".equals(firstWord) && "END".equals(returnWord)) {
					break;
				}
				
				for(int i = 0; i < firstWordArr.length; i++) {
					if(!firstWordArr[i].equals(returnWordArr[i])){
						result = "different";
					}
				}
			}
			
			System.out.println("Case " + caseCnt +": " + result);
			caseCnt++;
		}
		
		in.close();
	}
}