package part2.week14.bbg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DS_1021 {
	int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> cirque = new ArrayList<Integer>();
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] locations = new int[M]; 
		
		for(int cnt = 1 ; cnt <= N ; cnt ++) cirque.add(cnt);
		for(int cnt = 0 ; cnt < M ; cnt ++) {
			locations[cnt] = sc.nextInt();
		}
		
		sc.close();
	}
	
	public void pick(List<Integer> list) {
		list.remove(0);
	}
	public void left(List<Integer> list) {
		int removed = list.remove(0);
		list.add(removed);
		count++;
	}
	public void right(List<Integer> list) {
		List<Integer> tempList = list.subList(0, list.size()+1);
		for(int cnt = 0 ; cnt < list.size() ; cnt++) {
			if(cnt > 0 && cnt < list.size()-1) {
				list.set(cnt+1, tempList.get(cnt));
			}else if(cnt == 0) {
				list.set(cnt, tempList.get(tempList.size()));
			}
		}
		count++;
	}
}
