package part3.week23.chw;

import java.util.Scanner;

public class BackTracking_15649 {
	static int[] arr;
	static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        dfs(N, M, 0);
        sc.close();
    }
    static void dfs(int N, int M, int depth) {
    	if(depth == M) {
    		for(int i : arr) {
    			System.out.print(i + " ");
    		}
    		System.out.println();
    		return;
    	}
    	for(int i = 0; i < N; i++) {
    		if(!visited[i]) {
    			visited[i] = true;
    			arr[depth] = i + 1;
    			dfs(N, M, depth + 1);
    			visited[i] = false;
    		}
    	}
    }
}
