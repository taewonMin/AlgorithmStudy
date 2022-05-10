package part5.week43.mtw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 유기농 배추
public class GraphTraversal_1012 {
    public static int[][] cabbage;
    public static boolean[][] visited;
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {-1,0,1,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            count = 0;
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            cabbage = new int[input[1]][input[0]];
            visited = new boolean[input[1]][input[0]];
            for(int j=0; j<input[2]; j++){
                int[] position = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                cabbage[position[1]][position[0]] = 1;
            }

            for(int j=0; j<cabbage.length; j++){
                for(int k=0; k<cabbage[j].length; k++){
                    if(cabbage[j][k] == 1 && visited[j][k]==false){
                        // bfs(j, k);
                        dfs(j,k);
                        count++;
                    }
                }
            }
            bw.write(count+"\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void bfs(int row, int col){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{row, col});
        visited[row][col] = true;

        while(!queue.isEmpty()){
            int[] node = queue.poll();

            for(int i=0; i<4; i++){
                int x = node[1]+dx[i];
                int y = node[0]+dy[i];
                if(boundaryCheck(x, y) && cabbage[y][x]==1 && visited[y][x]==false){
                    visited[y][x]=true;
                    queue.offer(new int[]{y,x});
                }
            }
        }
    }

    public static void dfs(int row, int col){
        visited[row][col] = true;

        for(int i=0; i<4; i++){
            int x = col+dx[i];
            int y = row+dy[i];
            if(boundaryCheck(x, y) && cabbage[y][x]==1 && visited[y][x]==false){
                dfs(y, x);
            }
        }
    }

    public static boolean boundaryCheck(int x, int y){
        return 0<=x && x<cabbage[0].length && 0<=y && y<cabbage.length;
    }
}
