package part3.week21.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS_2206 {
    public static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);
        map = new int[N][M];

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
        int[] dn = {-1,1,0,0}; // 상하
        int[] dm = {0,0,-1,1}; // 좌우
        Queue<Object[]> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();
        list.add("00");
        queue.offer(new Object[]{0,0,1,true,list});    // n,m,distance,isBroken,지나온 경로 좌표배열

        while(!queue.isEmpty()){
            Object[] data = queue.poll();
            int distance = (int)data[2];
            boolean isBroken = (boolean)data[3];
            List<String> path = (List<String>)data[4];
            for(int i=0; i<dn.length; i++){
                int n = (int)data[0]+dn[i];
                int m = (int)data[1]+dm[i];
                

                if(n==N-1 && m==M-1){
                    return distance+1;
                }
                if(boundaryCheck(n, m, N, M) && path.contains(n+""+m)==false){
                    List<String> pathCopy = new LinkedList<>();
                    pathCopy.addAll(path);
                    pathCopy.add(n+""+m);
                    if(map[n][m] == 0){
                        queue.offer(new Object[]{n,m,distance+1,isBroken,pathCopy});
                    }else{
                        if(isBroken){  // 뚫을수 있으면
                            queue.offer(new Object[]{n,m,distance+1,false,pathCopy});
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static boolean boundaryCheck(int i, int j, int N, int M){
        return -1<i && i<N && -1<j && j<M;
    }
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
