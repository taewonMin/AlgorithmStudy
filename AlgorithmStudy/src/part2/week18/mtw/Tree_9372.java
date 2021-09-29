package part2.week18.mtw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 신장트리 간선의 개수 -> N-1
public class Tree_9372 {
    static boolean[][] map;
    static boolean[] visited;
    static int planeCnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] answer = new int[T];
        for(int i=0; i<T; i++){
            int N = sc.nextInt();   // 국가의 수
            int M = sc.nextInt();   // 비행기의 종류

            // planeCnt = 0;
            // map = new boolean[N][N];
            // visited = new boolean[N];
            
            // 노선 정보 설정
            for(int j=0; j<M; j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                // map[Math.min(a, b)-1][Math.max(a, b)-1] = true;
            }

            answer[i] = N-1;
            
            // 방문여부 체크 (bfs)
            // for(int j=0; j<N; j++){
            //     for(int k=j+1; k<N; k++){
            //         if(map[j][k] && visited[j] == false){
            //             bfs(j);
            //         }
            //     }
            // }
            // answer[i] = planeCnt-1;
        }

        for(int i : answer){
            System.out.println(i);
        }

        sc.close();
    }

    public static void bfs(int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);

        while(queue.isEmpty() == false){
            int num = queue.poll();
            planeCnt++;
            for(int j=num+1; j<visited.length; j++){
                if(map[num][j] && visited[j] == false){
                    queue.offer(j);
                    visited[j] = true;
                }
            }
            visited[num] = true;
        }
    }
}
