package week3_sort.mtw;

import java.util.Scanner;

// 애너그램
public class Sort_6996 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		String[] arr = new String[2];
		for(int i=0; i<N; i++) {
			String str = sc.nextLine();
			arr[0] = str.split(" ")[0];
			arr[1] = str.split(" ")[1];
			
			String result = arr[0] + " & " + arr[1] + " are ";
			// 문자열 길이 비교
			if(arr[0].length() != arr[1].length()) {
				result += "NOT anagrams.";
			}else {	// 문자열 잘라서 정렬
				char[] sortArr0 = arr[0].toCharArray();
				char[] sortArr1 = arr[1].toCharArray();
				
				// 삽입 정렬
				for(int j=1; j<sortArr0.length; j++) {
					
					// 첫번째 문자열 정렬
					int k=j;
					while(k > 0 && sortArr0[k-1] > sortArr0[k]) {
						char temp = sortArr0[k-1];
						sortArr0[k-1] = sortArr0[k];
						sortArr0[k] = temp;
						k--;
					}
					
					// 두번째 문자열 정렬
					int m=j;
					while(m > 0 && sortArr1[m-1] > sortArr1[m]) {
						char temp = sortArr1[m-1];
						sortArr1[m-1] = sortArr1[m];
						sortArr1[m] = temp;
						m--;
					}
				}
				
				// 정렬된 문자열 만들기
				String str0 = "";
				String str1 = "";
				for(int j=0; j<sortArr0.length; j++) {
					str0 += sortArr0[j];
					str1 += sortArr1[j];
				}
				
				result += str0.equals(str1) ? "anagrams." : "NOT anagrams."; 
			}
			
			System.out.println(result);
		}
		
		sc.close();
	}
}
