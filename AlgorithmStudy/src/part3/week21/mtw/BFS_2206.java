package part3.week21.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_2206 {
    public static int[][] map;
    public static boolean[][][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);
        map = new int[N][M];
        visited = new boolean[N][M][2];

        for(int i=0; i<N; i++){
            String[] row = br.readLine().split("");
            for(int j=0; j<row.length; j++){
                map[i][j] = Integer.parseInt(row[j]);
            }
        }

        System.out.println(bfs(N,M));

        br.close();
    }

    public static int bfs(int N, int M){
        if(N==1 && M==1) return 1;
        
        int[] dn = {-1,1,0,0}; // 상하
        int[] dm = {0,0,-1,1}; // 좌우
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0,0,1,0));    // n,m,distance,isBroken
        visited[0][0][0] = true;
        visited[0][0][1] = true;

        while(!queue.isEmpty()){
            Node node = queue.poll();
            for(int i=0; i<dn.length; i++){
                int n = node.n+dn[i];
                int m = node.m+dm[i];
                int isBroken = node.isBroken;

                if(n==N-1 && m==M-1){
                    return node.distance+1;
                }
                if(boundaryCheck(n, m, N, M) && visited[n][m][isBroken]==false){
                    if(map[n][m] == 1){
                        if(isBroken == 1){  // 뚫을수 없으면
                            continue;
                        }
                        isBroken = 1;
                    }
                    visited[n][m][isBroken] = true;
                    queue.offer(new Node(n,m,node.distance+1,isBroken));
                }
            }
        }
        return -1;
    }

    public static boolean boundaryCheck(int i, int j, int N, int M){
        return -1<i && i<N && -1<j && j<M;
    }
}

class Node{
    int n;
    int m;
    int distance;
    int isBroken; // 0이면 부술 수 있음

    Node(int n, int m, int distance, int isBroken){
        this.n = n;
        this.m = m;
        this.distance = distance;
        this.isBroken = isBroken;
    };
}

/*
1. 큐 -> poll()
2. 상하좌우 바운더리체크
3. 큐에 visited == false 일때
    vistised = true
    0이면 -> i, j, distance+1, isBroken = 0 를 큐에 집어넣음
    1이고 isBroken가 0 이면 -> i, j, distance+1, isBroken = 1 를 큐에 집어넣음
4. i = n, j = m 이면 return distance
5. while 문이 종료되면 return -1
*/