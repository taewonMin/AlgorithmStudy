package part2.week19.bbg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
/*
 * DFS = 깊이우선 = 스택이나 재귀함수 이용
 * 
 * BFS = 너비우선 = 큐 이용
 * */

public class DFS_BFS_1260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 점 개수
        int M = sc.nextInt(); // 선 개수
        int V = sc.nextInt(); // 시작 번호
        int[][] loc = new int[N][2]; // 점 위치 저장
        boolean[] visited = new boolean[N]; // 초기값 false, 방문 시 true
        LinkedList<Integer>[] listArr = new LinkedList[N+1];
        
        for(int cnt = 0 ; cnt < M ; cnt++) {
        	listArr[cnt] = new LinkedList<>();
        	// 선이 연결하는 두 점의 번호
        	int fir = sc.nextInt();
        	int sec = sc.nextInt();
//        	listArr[fir];
        }
        
        
        sc.close();
    }
    
    void bfs(int start, boolean[] arr) {
    	Queue<Integer> q = new LinkedList<>();
    	q.add(start);
    	arr[start] = true;
    	while(!q.isEmpty()) {
    		int x = q.poll();
    		System.out.println(x);
//    		for(int i=0 ; i < ) {
    			
//    		}
    	}
    }
    
    
}
