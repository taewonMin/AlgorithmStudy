package part1.week3_sort.bbg;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_6996 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCnt = sc.nextInt();
		String[][] testCase = new String[testCnt][2];
		
		for(int row=0 ; row < testCnt ; row++) {
			for(int col=0; col < 2 ; col++) {
				testCase[row][col] = sc.next();
			}
		}
		
		for(int row=0 ; row < testCnt ; row++) {
			String[] aArr = testCase[row][0].split("");
			String[] bArr = testCase[row][1].split("");
			if(aArr.length == bArr.length) {
				Arrays.sort(aArr);
				Arrays.sort(bArr);
				String sortedA = "";
				String sortedB = "";
				for(int idx=0 ; idx < aArr.length ; idx++) {
					sortedA += aArr[idx];
					sortedB += bArr[idx];
				}
				if(sortedA.equals(sortedB)) {
					System.out.println(testCase[row][0] + " & " + testCase[row][1] + " are anagrams.");
				}else {
					System.out.println(testCase[row][0] + " & " + testCase[row][1] + " are NOT anagrams.");
				}
			}else {
				System.out.println(testCase[row][0] + " & " + testCase[row][1] + " are NOT anagrams.");
			}
		}
	}
}



/*
문제
두 단어 A와 B가 주어졌을 때, A에 속하는 알파벳의 순서를 바꾸어서 B를 만들 수 있다면, A와 B를 애너그램이라고 한다.
=>1. 길이가 같은지 2.알파벳 정렬 후 일치

두 단어가 애너그램인지 아닌지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수(<100)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 100을 넘지 않는 단어가 공백으로 구분되어서 주어진다. 단어는 알파벳 소문자로만 이루어져 있다.

출력
각 테스트 케이스마다 애너그램인지 아닌지를 예체 출력과 같은 형식으로 출력한다. 

예제1
3
blather reblath
maryland landam
bizarre brazier


답1
blather & reblath are anagrams.
maryland & landam are NOT anagrams.
bizarre & brazier are anagrams.


*/
