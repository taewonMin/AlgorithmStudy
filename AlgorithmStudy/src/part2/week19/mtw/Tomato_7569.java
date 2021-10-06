package part2.week19.mtw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Tomato_7569 {
    public static int[][][] box;
    public static boolean[][][] visited;
    public static Queue<int[]> queue = new LinkedList<>();

    public static int[] dh = {1,-1,0,0,0,0};
    public static int[] dn = {0,0,1,-1,0,0};
    public static int[] dm = {0,0,0,0,1,-1};
    public static int H,N,M,ripeCnt=0,nonRipeCnt=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        M = Integer.parseInt(input[0]);
        N = Integer.parseInt(input[1]);
        H = Integer.parseInt(input[2]);
        box = new int[H][N][M];
        visited = new boolean[H][N][M];

        for(int i=0; i<H; i++){
            for(int j=0; j<N; j++){
                String[] line = br.readLine().split(" ");
                for(int k=0; k<M; k++){
                    int state = Integer.parseInt(line[k]);
                    box[i][j][k] = state;
                    if(state == 0){
                        nonRipeCnt++;
                    }else if(state == 1){
                        ripeCnt++;
                        queue.offer(new int[]{i,j,k,1});
                        visited[i][j][k] = true;
                    } 
                }
            }
        }

        if(nonRipeCnt == 0){    // 모든 토마토가 익어있는 경우
            System.out.println(0);
        }else if(ripeCnt == 0){ // 익은 토마토가 없을경우 = 토마토가 모두 익지 못하는 상황
            System.out.println(-1);
        }else{
            bfs();
        }

        br.close();
    }

    public static void bfs(){
        while(!queue.isEmpty()){
            int[] node = queue.poll();
            int depth = node[3];
            for(int i=0; i<dh.length; i++){
                int h = node[0]+dh[i];
                int n = node[1]+dn[i];
                int m = node[2]+dm[i];
                if(boundaryCheck(h,n,m) && visited[h][n][m] == false){
                    if(box[h][n][m] == 0){
                        ripeCnt++;
                        nonRipeCnt--;
                        if(nonRipeCnt == 0){
                            System.out.println(depth);
                            return;
                        }
                    }
                    if(box[h][n][m] != -1){
                        queue.offer(new int[]{h, n, m, depth+1});
                    }
                    visited[h][n][m] = true;
                }
            }
        }
        System.out.println(-1);
    }

    public static boolean boundaryCheck(int h, int n, int m){
        return -1 < h && h < H && -1 < n && n < N && -1 < m && m < M;
    }
}