package part3.week23.psw;

import java.util.Scanner;

public class BackTracking_15649 {
    static StringBuffer sb = new StringBuffer();
    static int N;
    static int M;
    static int[] numbers = null;
    static boolean[] visited = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        numbers = new int[M+1];
        visited = new boolean[N+1];
        dfs(1);
        sc.close();
        System.out.println(sb.toString());
    }

    private static void dfs(int depth) {
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
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}
/*


        1                    2        3        4
    [2, 3, 4]             [1,3,4]   [1,2,4]   [1,2,3]
[3 ,4], [2,4], [2,3]
4  , 3   4, 2,  3 , 2


 */