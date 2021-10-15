package part3.week22.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_7562 {
    public static boolean[][] visited;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++){
            int I = Integer.parseInt(br.readLine());
            visited = new boolean[I][I];
            String[] now = br.readLine().split(" ");
            String[] destination = br.readLine().split(" ");

            bfs(I, new int[]{Integer.parseInt(now[0]), Integer.parseInt(now[1])}, new int[]{Integer.parseInt(destination[0]), Integer.parseInt(destination[1])});
        }

        br.close();
    }

    public static void bfs(int I, int[] now, int[] destination){
        int[] dx = {-2,-1,1,2,2,1,-1,-2};
        int[] dy = {1,2,2,1,-1,-2,-2,-1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{now[0],now[1],0});    // x, y, 이동횟수

        while(!queue.isEmpty()){
            int[] data = queue.poll();

            if(data[0] == destination[0] && data[1] == destination[1]){
                System.out.println(data[2]);
                return;
            }

            for(int i=0; i<dx.length; i++){
                int x = data[0]+dx[i];
                int y = data[1]+dy[i];
            
                if(boundaryCheck(x, y, I) && visited[x][y] == false){
                    visited[x][y] = true;
                    queue.offer(new int[]{x,y,data[2]+1});
                }
            }
        }
    }

    public static boolean boundaryCheck(int x, int y, int I){
        return -1<x && x<I && -1<y && y<I;
    }
}
