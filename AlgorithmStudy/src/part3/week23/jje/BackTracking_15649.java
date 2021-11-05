package part3.week23.jje;

import java.util.ArrayList;
import java.util.Scanner;

public class BackTracking_15649 {
    static int n;
    static int m;
    static int[] arr = null;
    static boolean[] visited = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];
        visited = new boolean[n];
        dfs(0);
        sc.close();

    }

    static void dfs(int depth) {
        if (depth == m){
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}