package part1.week5_sort.bbg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sort_9946 {
	public static void main(String[] args) {
		
//		String[] origins = {"testing"
//							,"abc"
//							,"abcabcbcc"
//							,"abc"
//		};
//		String[] news = {"intestg"
//				,"aabbbcccc"
//				,"aabbbcccc"
//				,"xyz"
//		};
		
		Scanner sc = new Scanner(System.in);
		
		List<String> origins = new ArrayList<String>();
		List<String> news = new ArrayList<String>();
		
		do {	
			origins.add(sc.next());
			news.add(sc.next());
		}while(!("END".equals(origins.get(origins.size()-1)) && "END".equals(news.get(news.size()-1))));
		
		
		for(int idx=0 ; idx < origins.size()-1 ; idx++) {
			
			boolean result = false;
			
			//길이비교
			if(origins.get(idx).length() == news.get(idx).length()) {
				String[] originTemp = origins.get(idx).split("");
				String[] newTemp = news.get(idx).split("");
				
				//같은지 비교 위해 정렬
				Arrays.sort(originTemp);
				Arrays.sort(newTemp);
				
				result = Arrays.equals(originTemp, newTemp);
			}
			
			if(result) {
				System.out.println("Case "+(idx+1)+": same");
			}else {
				System.out.println("Case "+(idx+1)+": different");					
			}
		}
		
	}
}
