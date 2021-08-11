package part1.week5_sort.chw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sort_11497 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int testCnt = in.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> resultList = new ArrayList<Integer>();
		for(int i = 0; i < testCnt; i++) {
			int logCnt = in.nextInt();
			int[] logs = new int[logCnt];
			for(int j = 0; j < logCnt; j++) {
				logs[j] = in.nextInt();
			}
			Arrays.sort(logs);
			
			for(int k = 0; k < logs.length; k+=2) {
				list.add(logs[k]);
			}
			for(int x = logs.length-2; x > 0; x-=2) {
				list.add(logs[x]);
			}
			
			int temp = 0;
			for(int j = 0; j < list.size(); j++) {
				
				if(j == list.size() - 1) {
					if(temp < Math.abs(list.get(0) - list.get(list.size()-1))) {
						temp = Math.abs(list.get(0) - list.get(list.size()-1));
					}
					break;
				}
				
				if(temp == 0 || temp < Math.abs(list.get(j) - list.get(j+1))) {
					temp = Math.abs(list.get(j) - list.get(j+1));
				}
			}
			resultList.add(temp);
			list.clear();
		}
		
		for(int a : resultList) {
			System.out.println(a);
		}
		
		in.close();
	}
}
