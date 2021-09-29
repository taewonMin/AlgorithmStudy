package part2.week19.chw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Search_7569 {
	static int[][][] boxes;
	static boolean[][][] visited;
	static int M;
    static int N;
    static int H;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        M = sc.nextInt();
        N = sc.nextInt();
        H = sc.nextInt();
        int result = 0;
        boxes = new int[H][N][M];
        boolean checkTomato = false;
        visited = new boolean[H][N][M]; 
        for(int i = 0 ; i < H; i++) {
	        for(int j = 0; j < N; j++) {
	        	for(int k = 0; k < M; k++) {
	        		boxes[i][j][k] = sc.nextInt();
	        		if(boxes[i][j][k] == 0) checkTomato = true;
	        	}
	        }
        }
        System.out.println("start");
        sc.close();
        if(!checkTomato) {
        	System.out.println(result);
        }else {
        	for(int i = 0 ; i < H; i++) {
    	        for(int j = 0; j < N; j++) {
    	        	for(int k = 0; k < M; k++) {
    	        		if(!visited[i][j][k] && boxes[i][j][k] == 1) {
    	        			Integer[] coordinate = {i, j, k};
    	        			bfs();
//    	        			bfs(new Integer[] {i, j, k});
    	        			result++;
    	        		}
    	        	}
    	        }
            }
        }
        System.out.println(result);
    }
    
    static void bfs() {
    	List<Integer[]> coordinateList = getCoordinateList();
    	// visited가 false이면서 boxes[z][y][x] == 1인 좌표 리스트만큼 for문 감싸기
    	for(int l = 0; l < coordinateList.size(); l++) {
    		Integer[] coordinate = coordinateList.get(l);
	    	visited[coordinate[0]][coordinate[1]][coordinate[2]] = true;
	    	Queue<Integer[]> queue = new LinkedList<Integer[]>();
	    	queue.add(coordinate);
	    	while(!queue.isEmpty()) {
	    		Integer[] nowCoordinate = queue.peek();
	    		queue.remove();
	    		// 6방향에서 안익은 토마토가 있을때 1로 변경
	    		// 6방향에서 익은 토마토가 있을때 그 좌표를 큐에 추가
	    		for(int i = -1; i <= 1; i++) {
	    			for(int j = -1; j <= 1; j++) {
	    				for(int k = -1; k <=1; k++) {
	    					if(i*j*k == 0 && (i+j+k == 1 || i+j+k == -1)) {
	    						int z = nowCoordinate[0] + i;
	    						int y = nowCoordinate[1] + j;
	    						int x = nowCoordinate[2] + k;
	    						if(x > -1 && y > -1 && z > -1 && x < boxes[0][0].length && y < boxes[0].length && z < boxes.length && !visited[z][y][x]) {
	    							if(boxes[z][y][x] == 1) {
	    								Integer[] newCoordinate = {z, y, x};
	    								visited[z][y][x] = true;
	    								queue.add(newCoordinate);
	//    								queue.add(new Integer[]{z, y, x});
	    							}else if(boxes[z][y][x] == 0) {
	    								boxes[z][y][x] = 1;
	    							}
	    						}
	    					}
	    					
	    				}
	    			}
	    		}
    		}

    		
    	}
    }
    
    static List<Integer[]> getCoordinateList() {
    	List<Integer[]> coordinateList = new ArrayList<Integer[]>();
    	for(int i = 0 ; i < H; i++) {
	        for(int j = 0; j < N; j++) {
	        	for(int k = 0; k < M; k++) {
	        		if(!visited[i][j][k] && boxes[i][j][k] == 1) {
	        			Integer[] coordinate = {i, j, k};
	        			coordinateList.add(coordinate);
//	        			return new int[] {i,j,k};
	        		}
	        	}
	        }
        }
    	return coordinateList;
    }
}





//package part2.week19.chw;
//
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Search_7569 {
//	static int[][][] boxes;
//	static int M;
//    static int N;
//    static int H;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        
//        M = sc.nextInt();
//        N = sc.nextInt();
//        H = sc.nextInt();
//        int result = 0;
//        boxes = new int[H][N][M];
//        boolean checkTomato = false;
//        for(int i = 0 ; i < H; i++) {
//	        for(int j = 0; j < N; j++) {
//	        	for(int k = 0; k < M; k++) {
//	        		boxes[i][j][k] = sc.nextInt();
//	        		if(boxes[i][j][k] == 0) checkTomato = true;
//	        	}
//	        }
//        }
//        sc.close();
//        if(checkTomato) {
//        	System.out.println(result);
//        }else {
//        	bfs();
//        }
//    }
//    
//    static void bfs() {
//    	Queue<Integer[]> coordinateList = checkCoordinate();
//    	while(!coordinateList.isEmpty()) {
//    		Integer[] coordinate = coordinateList.peek();
//    		coordinateList.remove();
//    		checkAndChangeCoordinate(coordinate);
//    	}
//    }
//    
//    static void checkAndChangeCoordinate(Integer[] coordinate) {
//    	
//    }
//    
//    static Queue<Integer[]> checkCoordinate() {
//    	Queue<Integer[]> queue = new LinkedList<Integer[]>();
//    	for(int i = 0 ; i < H; i++) {
//	        for(int j = 0; j < N; j++) {
//	        	for(int k = 0; k < M; k++) {
//	        		if(boxes[i][j][k] == 1) {
//	        			Integer[] coordinate = {i, j, k};
//	        			queue.add(coordinate);
//	        		}
//	        	}
//	        }
//        }
//    	return queue;
//    }
//}