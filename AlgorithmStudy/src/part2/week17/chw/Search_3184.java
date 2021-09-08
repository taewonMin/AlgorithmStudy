package part2.week17.chw;

import java.util.Scanner;

public class Search_3184 {
	static int sheep = 0;
	static int wolf = 0;
	static int sheepCnt = 0;
    static int wolfCnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int width = sc.nextInt();
        int height = sc.nextInt();
        String[][] map = new String[width][height];
        boolean[][] visited = new boolean[width][height];
        
        for(int i = 0; i < width; i++) {
    		map[i] = sc.next().split("");
        }
        sc.close();
        
        for(int i = 0; i < width; i++) {
        	for(int j = 0; j < height; j++) {
        		if(!visited[i][j] && !"#".equals(map[i][j])) {
        			dfs(visited, map, j, i);
        			if(sheepCnt > wolfCnt) {
        				sheep += sheepCnt;
        			}else {
        				wolf += wolfCnt;
        			}
        			sheepCnt = 0;
        			wolfCnt = 0;
        		}
        	}
        }
        System.out.println(sheep + " " + wolf);
    }
    
    static void dfs(boolean[][] visited, String[][] map, int x, int y) {
    	if("v".equals(map[y][x])) {
    		wolfCnt++;
    	}else if("o".equals(map[y][x])) {
    		sheepCnt++;
    	}
    	visited[y][x] = true;
    	for(int i = 0; i < 4; i++) {
			int[] coordinate = checkDirection(visited, map, x, y);
			if(coordinate != null) {
				dfs(visited, map, coordinate[1], coordinate[0]);
			}
    	}
    }
    
    static int[] checkDirection(boolean[][] visited, String[][] map, int x, int y) {
    	if(y - 1 > -1 && !visited[y-1][x] && !"#".equals(map[y-1][x])) {
    		return new int[] {y-1, x};
    	}else if(y + 1 < map.length && !visited[y+1][x] && !"#".equals(map[y+1][x])) {
    		return new int[] {y+1, x};
    	}else if(x - 1 > -1 && !visited[y][x-1] && !"#".equals(map[y][x-1])) {
    		return new int[] {y, x-1};
    	}else if(x + 1 < map[y].length && !visited[y][x+1] && !"#".equals(map[y][x+1])) {
    		return new int[] {y, x+1};
    	}
    	return null;
    }
}