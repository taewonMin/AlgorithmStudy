package part3.week24.chw;

import java.util.Scanner;

public class BackTracking_15650 {
	public static int[] arr;
	public static int N, M;
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		N = sc.nextInt();
		M = sc.nextInt();
		
		sc.close();
		
		arr = new int[M];
        
		dfs(1, 0);
	}
 
	public static void dfs(int at, int depth) {
		if (depth == M) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
        
		for (int i = at; i <= N; i++) {
			arr[depth] = i;
			dfs(i + 1, depth + 1);
		}
	}
}

//package part3.week24.chw;
//
//import java.util.Scanner;
//
//public class BackTracking_15650 {
//	static int[] arr;
//	static int d = 1;
//	static int a1;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        arr = new int[M];
//        sc.close();
//        dfs(N, M, 0);
//    }
//    static void dfs(int N, int M, int depth) {
//    	if(M == depth) {
//    		for(int i : arr) {
//    			System.out.print(i + " ");
//    		}
//    		System.out.println();
//    		return;
//    	}
//    	for(int i = 0; i < N; i++) {
//    		if(depth > 1) {
//    			d = arr[1] - arr[0];
//    			if(i + 1 - arr[depth-1] == d && arr[depth-1] < i + 1) {
//    				arr[depth] = i + 1;
//        			dfs(N, M, depth + 1);
//    			}
//    		}else {
//    			if(depth == 1) {
//    				if(arr[0] < i + 1) {
//    					arr[depth] = i + 1;
//    					dfs(N, M, depth + 1);
//    				}
//    			}else {
//    				arr[depth] = i + 1;
//    				dfs(N, M, depth + 1);
//    			}
//    		}
//    	}
//    }
//}