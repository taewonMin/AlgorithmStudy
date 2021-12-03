package part3.week24.phk;

import java.util.Scanner;

public class BackTracking_15650 {
    // public static boolean[] visit;
    public static int[] arr;
    public static int N, M;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        sc.close();

        // visit = new boolean[N];
        arr = new int[M];

        dfs(1, 0);

        System.out.println(sb);

    }

    public static void dfs(int a, int depth) {
        if(depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = a; i <= N; i++) {
            // if(!visit[i]) {
                // visit[i] = true;
                arr[depth] = i;
                dfs(i + 1, depth + 1);
                // visit[i] = false;
            // }
        }
    }
}



