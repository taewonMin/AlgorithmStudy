package part2.week18.chw;

import java.util.Scanner;

public class Tree_9372 {
	static int min;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for(int i = 0; i < cnt; i++) {
        	int country = sc.nextInt();
        	int plane = sc.nextInt();
        	int result = country;
        	int[][] adjList = new int[country+1][country+1];
        	boolean[] visited;
        	for(int j = 0; j < plane; j++) {
        		int fir = sc.nextInt();
        		int sec = sc.nextInt();
        		adjList[fir][sec] = 1;
        		adjList[sec][fir] = 1;
        	}
        	for(int j = 1; j <= plane;j++) {
        		visited = new boolean[country+1];
        		min = 0;
        		dfs(j, adjList, visited);
        		if(result > min) {
        			result = min;
        		}
//        		System.out.print("==> min : " + min);
//        		System.out.println();
        	}
        	System.out.println(result);
        }
        sc.close();
    }
    public static void dfs(int v, int[][] adjList, boolean[] visited) {
    	visited[v] = true;
//    	System.out.print(v+" ");
    	for(int i = 1; i < adjList[v].length; i++) {
    		if(adjList[v][i] == 1 && !visited[i]) {
    			dfs(i,adjList, visited);
    			min++;
    		}
    	}
    }
}
/*
1 -> 2 -> 3 -> 1



		  1
		2
	  3
	4
  5
*/


//package part2.week18.chw;
//
//import java.util.Scanner;
//
//public class Tree_9372 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int cnt = sc.nextInt();
//        for(int i = 0; i < cnt; i++) {
//        	int country = sc.nextInt();
//        	int plane = sc.nextInt();
//        	int count = 0;
//        	boolean[] visited = new boolean[country+1];
//        	for(int j = 0; j < plane; j++) {
//        		int fir = sc.nextInt();
//        		int sec = sc.nextInt();
//        		if(visited[fir] && visited[sec]) {
//        			count++;
//        		}else {
//        			visited[fir] = true;
//					visited[sec] = true;
//        		}
//        	}
//        	System.out.println(plane - count);
//        }
//        sc.close();
//    }
//}
