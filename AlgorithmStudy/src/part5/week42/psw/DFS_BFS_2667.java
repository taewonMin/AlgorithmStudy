package part5.week42.psw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFS_BFS_2667 {
    static int[][] map;
    static boolean[][] visited;
    static List<Integer> answer = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            map[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != 0 && !visited[i][j]){
                    //answer.add(bfs(i,j));
                    answer.add(bfs(i,j));
                }
            }
        }
        printAnswer();
    }

    private static int dfs(int i, int j, int cnt) {
        visited[i][j] = true;

        for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
                if (k*l != 0) continue;
                if (boundaryChk(i+k,j+l) && !visited[i+k][j+l] && map[i+k][j+l] !=0){
                    dfs(i+k,j+l,cnt+1);
                }
            }
        }

        return cnt;
    }

    private static void printAnswer() {
        StringBuffer sb = new StringBuffer();
        sb.append(answer.size()+"\n");
        answer.sort(Integer::compare);
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i)+"\n");
        }
        System.out.println(sb);
    }

    private static int bfs(int i,int j) {
        Queue<Integer[]> queue = new LinkedList<>();
        int cnt = 0;
        queue.add(new Integer[]{i,j,1});
        visited[i][j] = true;

        while (!queue.isEmpty()){
            Integer[] idxes = queue.poll();
            int x = idxes[0], y= idxes[1];
            cnt++;

            for (int k = -1; k <= 1; k++) {
                for (int l = -1; l <= 1; l++) {
                    if (k*l != 0) continue;
                    if (boundaryChk(x+k,y+l) && !visited[x+k][y+l] && map[x+k][y+l] !=0){
                        queue.add(new Integer[]{x+k,y+l,idxes[2]+1});
                        visited[x+k][y+l]= true;
                    }
                }
            }
        }

        return cnt;
    }

    private static boolean boundaryChk(int k, int l) {
        int length = map.length;
        return (k>-1 && l >-1) && (k < length && l < length);
    }
}
