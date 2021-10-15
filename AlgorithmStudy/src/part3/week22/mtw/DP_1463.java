package part3.week22.mtw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DP_1463 {
    public static boolean[] visited;
    public static int[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // visited = new boolean[N];
        dp = new int[N+1];

        // bfs(N);
        System.out.println(recursive(N));

        sc.close();
    }

    // 57328kb, 292ms
    public static int recursive(int N){
        if(N > 1 && dp[N]==0){
            if(N%6==0){
                dp[N] = Math.min(recursive(N/3), Math.min(recursive(N/2), recursive(N-1)))+1;
            }else if(N%3==0){
                dp[N] = Math.min(recursive(N/3), recursive(N-1))+1;
            }else if(N%2==0){
                dp[N] = Math.min(recursive(N/2), recursive(N-1))+1;
            }else{
                dp[N] = recursive(N-1)+1;
            }
        }
        return dp[N];
    }

    // 18712kb, 212ms
    public static void bfs(int N){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{N, 0});

        while(!queue.isEmpty()){
            int[] data = queue.poll();
            int num = data[0];

            if(num == 1){
                System.out.println(data[1]);
                break;
            }
            if(num%3==0 && visited[num/3] == false){
                visited[num/3] = true;
                queue.offer(new int[]{num/3, data[1]+1});
            }
            if(num%2==0 && visited[num/2] == false){
                visited[num/2] = true;
                queue.offer(new int[]{num/2, data[1]+1});
            }
            if(visited[num-1] == false){
                visited[num-1] = true;
                queue.offer(new int[]{num-1, data[1]+1});
            }
        }
    }
}
