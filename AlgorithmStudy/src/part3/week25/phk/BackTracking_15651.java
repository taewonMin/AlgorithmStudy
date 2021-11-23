package part3.week25.phk;

import java.util.Scanner;

public class BackTracking_15651 {
    public static boolean[] visit;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        visit = new boolean[N];
        arr = new int[M];

        dfs(N, M, 0);

        System.out.println(sb);

    }

    public static void dfs(int N, int M, int depth) {
        if(depth == M) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for(int i = 0; i < N; i++) {
            // if(!visit[i]) {
                // visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                // visit[i] = false;
            // }
        }
    }
}
