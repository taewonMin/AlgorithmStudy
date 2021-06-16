package week5_sort.bbg;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_15819 {
	
	public static String[] mySort (String[] strings) {
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.charAt(0) < o1.charAt(0)) { //  첫 번째 문자가 작다 == 사전순 앞에 
					return 1;
				}else if(o1.charAt(0) > o1.charAt(0)) {
					return -1;
				}else if(o1.charAt(0) == o1.charAt(0)) { //  첫글자가 같으면 계속 비교하다가 길이가 더 긴게 뒤로감
					
					
//					if() {
//						
//					}
				}
				return o1.compareTo(o2);
			}
		});
		return strings;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
		int N = 4;
//		int I = sc.nextInt();
		int I = 1;
		
		String[] memories = new String[N];
//		for(int i=0; i<N ; i++) {
//			memories[i] = sc.next(); // N개의 줄 수 만큼 입력이니까  line으로 주기?
//		}
		memories = new String[]{"acka1357", "spectaclehong", "mitslll", "luke0201"};
		
		
		
		
		
		sc.close();
	}
}