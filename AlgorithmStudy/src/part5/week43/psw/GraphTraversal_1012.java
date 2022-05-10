package part5.week43.psw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//	27388	276
public class GraphTraversal_1012 {
    static boolean[][] map;
    static boolean[][] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt(), n = sc.nextInt(), k = sc.nextInt();
            map = new boolean[n][m];
            for (int j = 0; j < k; j++) {
                int y = sc.nextInt(), x = sc.nextInt();
                map[x][y] = true;
            }

            int cnt = 0;
            visited = new boolean[n][m];
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    if (map[j][l] && !visited[j][l]){
                        bfs(j,l);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }

    private static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        visited[i][j] = true;

        while (!queue.isEmpty()){
            int[] idx = queue.poll();
            int[][] idxes = {{idx[0]-1,idx[1]},{idx[0]+1,idx[1]},{idx[0],idx[1]-1},{idx[0],idx[1]+1}};
            for (int k = 0; k < 4; k++) {
                int x = idxes[k][0], y = idxes[k][1];
                if (boundaryChk(x,y) && map[x][y] && !visited[x][y]){
                    queue.add(new int[]{x,y});
                    visited[x][y] = true;
                }
            }
        }
    }

    private static boolean boundaryChk(int x, int y) {
        int xLen = map.length, yLen = map[0].length;
        return  x > -1 && y > -1 && x < xLen && y < yLen;
    }
}
