package part2.week17.chw;

import java.util.Scanner;
import java.util.Stack;

public class Search_3184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int width = sc.nextInt();
        int height = sc.nextInt();
        int sheep = 0;
        int wolf = 0;
        
        String[][] map = new String[height][width];
        boolean[][] visited = new boolean[height][width];
        
        for(int i = 0; i < height; i++) {
    		map[i] = sc.next().split("");
        }
        dfs(visited, map, true);
        
        
    }
    
    static void dfs(boolean[][] visited, String[][] map, boolean flag) {
    	Stack<Integer[]> stack = new Stack<Integer[]>();
    	Integer[] idx = checkCoordinate(map);
    	stack.push(idx);
    	visited[idx[0]][idx[1]] = true;
    	while(!stack.isEmpty()) {
    		Integer[] idx2 = stack.peek();
    		flag = false;
    		
    		for(int i = 0; i < map.length; i++) {
    			for(int j = 0; j < map[i].length; j++) {
    				if(!visited[i][j]) {
    					Integer[] idx3 = {i,j};
    					stack.push(idx3);
    					visited[i][j] = true;
    					flag = true;
    					break;
    				}else if("#".equals(map[i][j])) {
    					
    					if(i == map.length-1 || j == 0) {
    						flag = true;
    						break;
    					}
    					
    					if(!"#".equals(map[i+1][j-1])) {
    						Integer[] idx3 = {i+1,j-1};
        					stack.push(idx3);
        					visited[i+1][j-1] = true;
        					flag = true;
        					break;
    					}else {
    						flag = true;
    						break;
    					}
    				}
    			}
    			if(flag) break;
    		}
    		if(!flag) {
    			System.out.println(stack.peek());
    			stack.pop();
    			
    		}
    		
    		
    	}
    	
    	
	}
    static Integer[] checkCoordinate(String[][] map) {
    	for(int i = 0; i < map.length; i++) {
    		for(int j = 0; j < map[i].length; j++) {
    			if(!"#".equals(map[i][j])) {
    				Integer[] idx = {i,j};
    				return idx;
    			}
    		}
    	}
    	return null;
    }
}

    
