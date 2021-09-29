package part2.week19.chw;

import java.util.Iterator;
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
    	int lastNum = N;
    	int depth = 0;
    	while(!queue.isEmpty()) {
    		int nowValue = queue.peek();
    		boolean checkDepth = false;
//    		System.out.print(nowValue + " ");
    		if(nowValue == K) {
    			break;
    		}else if(nowValue == lastNum && !visited[nowValue]) {
    			checkDepth = true;
    		}
    		queue.remove();
    		
    		if(!visited[nowValue - 1]) {
    			visited[nowValue - 1] = true;
    			queue.add(nowValue - 1);
    		}
    		if(!visited[nowValue + 1]) {
    			visited[nowValue + 1] = true;
    			queue.add(nowValue + 1);
    		}
    		if(nowValue * 2 < visited.length && !visited[nowValue * 2]) {
    			visited[nowValue * 2] = true;
    			queue.add(nowValue * 2);
    		}
    		if(checkDepth) {
    			Iterator<Integer> iter = queue.iterator();
    			while(iter.hasNext()) {
    				lastNum = iter.next();
    			}
    			depth += 1;
    		}
    	}
    	System.out.println(depth);
    }
    
}
