package part2.week13.chw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BFS_2606 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int computer = sc.nextInt();
		int network = sc.nextInt();
		
		int[] unionArr = new int[computer + 1];
		
		for(int i = 1; i <= computer; i++) {
			unionArr[i] = i;
		}
		int[][] arr2d = new int[network][2];
		for(int i = 0; i < network; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x < y) {
				arr2d[i][0] = x;
				arr2d[i][1] = y;
			}else {
				arr2d[i][0] = y;
				arr2d[i][1] = x;
			}
//			unionParent(unionArr, sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr2d, Comparator.comparingInt(o1 -> o1[0]));
//		for(int[] i : arr2d) {
//			for(int j : i) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		for(int[] i : arr2d) {
			unionParent(unionArr, i[0], i[1]);
		}
		int No1Com = unionArr[1];
		int result = 0;
		for(int i = 2; i < unionArr.length; i++) {
			if(No1Com == unionArr[i]) result++; 
		}
		System.out.println(result);
		sc.close();
	}
	public static void unionParent(int[] unionArr, int a, int b) {
		a = getParent(unionArr, a);
		b = getParent(unionArr, b);
		if(a < b) {
			unionArr[b] = a;
		}else {
			unionArr[a] = b;
		}
	}
	
	public static int getParent(int[] unionArr, int x) {
		if(unionArr[x] == x) return x;
		return unionArr[x] = getParent(unionArr, unionArr[x]);
	}
}
/*
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int computer = sc.nextInt();
	int network = sc.nextInt();
	int start = 1;
	int[][] arr2d = new int[computer+1][computer+1];
	boolean[] visit = new boolean[computer+1];
	
	for(int i = 0; i < network; i++) {
		int fir = sc.nextInt();
		int sec = sc.nextInt();
		arr2d[fir][sec] = 1;
		arr2d[sec][fir] = 1;
	}
	
	Queue<Integer> queue = new LinkedList<Integer>();
	queue.offer(start);
	visit[start] = true;
	int idx = 0;
	while(queue.size() != 0) { 
		int temp = queue.poll();
		if(temp != 1) idx++;
		for(int j = 1; j < computer + 1; j++) {
			if(arr2d[temp][j] == 1 && visit[j] == false) {
				queue.offer(j);
				visit[j] = true;
			}
		}
	}
	sc.close();
	System.out.println(idx);
}

*/