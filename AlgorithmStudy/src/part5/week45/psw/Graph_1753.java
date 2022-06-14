package part5.week45.psw;

import java.util.*;

public class Graph_1753 {

    public static void main(String[] args) {
        //1. 초기화
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt(), e = sc.nextInt();
        int start = sc.nextInt();

        List<int[]>[] graph = new List[v+1];
        boolean[] visited = new boolean[v+1];
        int[] dp = new int[v+1];

        for (int i = 1; i <= v; i++) {
            dp[i] = Integer.MAX_VALUE;
            graph[i] = new ArrayList<>();
        }

        dp[start]=0;

        for (int i = 0; i < e; i++) {
            graph[sc.nextInt()].add(new int[]{sc.nextInt(),sc.nextInt()});
        }

        //2. 탐색
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a,b) -> {return Integer.compare(a[1],b[1]);});
        queue.offer(new int[]{start,0});

        while (!queue.isEmpty()){
            int[] poll = queue.poll();
            int i = poll[0];
            visited[i] = true;

            for (int[] item : graph[i]){
                int val = dp[i] + item[1] , j = item[0];
                if (!visited[j] && dp[j] > val) {
                    queue.offer(new int[]{j, dp[j] =  val});
                }
            }
        }

        //3. 출력
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= v; i++) {
            sb.append( (dp[i]==Integer.MAX_VALUE ? "INF": dp[i])+"\n");
        }
        System.out.println(sb);
    }
}
/*
6 9
1
1 2 10
1 3 30
1 4 15
2 5 20
5 6 20
3 6 5
4 2 5
4 6 20
6 4 20

 */