package part3.week25.psw;

import java.util.Scanner;

public class BackTracking_15651 {
    static StringBuffer sb = new StringBuffer();
    static int N;
    static int M;
    static int[] numbers = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        numbers = new int[M+1];
        dfs(1,new boolean[N+1]);
        sc.close();
        System.out.println(sb.toString());
    }

    private static void dfs(int depth, boolean[] visited) {
        if (depth == numbers.length){
            for (int i = 1; i < numbers.length; i++) {
                sb.append(numbers[i]+" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= visited.length-1; i++) {
            if (!visited[i]){
                visited[i] = true;
                numbers[depth] = i;
                dfs(depth+1, new boolean[visited.length]);
            }
        }
    }
}
