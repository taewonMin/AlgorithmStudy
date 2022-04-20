package part5.week42.jje;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS_2667 {
    private static int dx[] = {0,0,1,-1};
    private static int dy[] = {1,-1,0,0};
    private static int[] aparts = new int[25*25];
    private static int n;
    private static int apartNum = 0;
    private static boolean[][] visited = new boolean[25][25];
    private static int[][] map = new int[25][25];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        map = new int[n][n];
        visited = new boolean[n][n];

        for(int i=0; i<n; i++){
            String input = sc.next();
            for(int j=0; j<n; j++){
                map[i][j] = input.charAt(j)-'0';
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    apartNum++;
                    //dfs(i,j);
                    bfs(i,j);
                }
            }
        }

        Arrays.sort(aparts);
        System.out.println(apartNum);

        for(int i=0; i<aparts.length; i++){
            if(aparts[i] == 0){
            }else{
                System.out.println(aparts[i]);
            }
        }
    }

    private static void dfs(int x, int y) {
        visited[x][y] = true;
        aparts[apartNum]++;

        for(int i=0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && ny >=0 && nx < n && ny < n){
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx,ny);
                }
            }
        }
    }

    private static void bfs(int x, int y) {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{x,y});
        visited[x][y] = true;
        aparts[apartNum]++;

        while(!que.isEmpty()){

            int curX = que.peek()[0];
            int curY = que.peek()[1];
            que.poll();

            for(int i=0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx >= 0 && ny >= 0 && nx < n && ny < n){
                    if(map[nx][ny] == 1 && !visited[nx][ny]){
                        que.add(new int[]{nx,ny});
                        visited[nx][ny] = true;
                        aparts[apartNum]++;
                    }
                }
            }
        }
    }
}
