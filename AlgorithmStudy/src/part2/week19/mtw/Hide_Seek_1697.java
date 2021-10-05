package part2.week19.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Hide_Seek_1697{
    public static boolean[] visited = new boolean[100001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        bfs(N, K);

        br.close();
    }

    public static void bfs(int N, int K){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{N, 0});
        visited[N] = true;
        while(!queue.isEmpty()){
            int[] next = queue.poll();
            if(next[0] == K){
                System.out.println(next[1]);
                break;
            }

            if(next[0] > 0 && visited[next[0]-1] == false){
                queue.offer(new int[]{next[0]-1, next[1]+1});
                visited[next[0]-1] = true;
            }
            if(next[0] < K){
                if(next[0]<100000 && visited[next[0]+1] == false){
                    queue.offer(new int[]{next[0]+1, next[1]+1});
                    visited[next[0]+1] = true;
                }
                if(next[0]<50001 && visited[next[0]*2] == false){
                    queue.offer(new int[]{next[0]*2, next[1]+1});
                    visited[next[0]*2] = true;
                }
            }
            
        }
    }
}