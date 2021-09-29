package part2.week19.chw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Search_1697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        boolean[] visited = new boolean[K*2];
        bfs(visited, N, K);
        
        
        sc.close();
    }
    
    static void bfs(boolean[] visited, int N, int K) {
    	visited[N] = true;
    	Queue<Integer> queue = new LinkedList<Integer>();
    	queue.add(N);
    	int result = 1;
    	while(!queue.isEmpty()) {
    		int nowValue = queue.peek();
//    		System.out.print(nowValue + " ");
    		if(nowValue == K) {
    			checkDepth(result);
    			break;
    		}
    		queue.remove();
    		if(!visited[nowValue - 1]) {
    			visited[nowValue - 1] = true;
    			queue.add(nowValue - 1);
    		}else {
    			result++;
    		}
    		if(!visited[nowValue + 1]) {
    			visited[nowValue + 1] = true;
    			queue.add(nowValue + 1);
    		}else {
    			result++;
    		}
    		if(nowValue * 2 < visited.length && !visited[nowValue * 2]) {
    			visited[nowValue * 2] = true;
    			queue.add(nowValue * 2);
    		}else {
    			result++;
    		}
    		result++;
    		
    	}
    }
    
    static void checkDepth(int result) {
    	int depth = 1;
    	int depthCnt = 1;
    	while(true) {
    		if(result < depthCnt) depthCnt = depthCnt * 3;
    	}
    }
}
