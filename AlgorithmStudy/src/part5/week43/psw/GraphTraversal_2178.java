package part5.week43.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//21252	312
public class GraphTraversal_2178 {
    static int[][] map;
    static boolean[][] visited;
    static int m = 0, n = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] param = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        m = param[0];
        n = param[1];

        map = new int[m][];
        for (int i = 0; i < m; i++) {
            map[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }
        visited = new boolean[m][n];
        System.out.println(bfs(0,0));
    }

    private static int bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j,1});
        visited[i][j] = true;

        while (!queue.isEmpty()){
            int[] idx = queue.poll();
            int[][] idxes = {{idx[0]-1,idx[1]},{idx[0]+1,idx[1]},{idx[0],idx[1]-1},{idx[0],idx[1]+1}};
            for (int k = 0; k < 4; k++) {
                int x = idxes[k][0], y = idxes[k][1];
                if (boundaryChk(x,y) && map[x][y] == 1 && !visited[x][y]){
                    if (x == m-1 && y == n-1) return idx[2]+1;
                    queue.add(new int[]{x,y,idx[2]+1});
                    visited[x][y] = true;
                }
            }
        }
        return 0;
    }

    private static boolean boundaryChk(int x, int y) {
        return  x > -1 && y > -1 && x < m && y < n;
    }
}
