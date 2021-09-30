package part2.week19.psw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_7569 {
    static int[][][] map;
    static int answer;
    static int M, N, H;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();N = sc.nextInt();H = sc.nextInt();
        map = new int[H][N][M];

        int i = -1;
        int max = H*N*M-1;
        while (i++ < max) map[i/(M*N)][(i/M)%N][i%M] = sc.nextInt();
        day(max);
        System.out.println(isFail(max) ? -1 : answer);
    }

    private static boolean isFail(int max) {
        int i = -1;
        while (i++ < max) {
            if (map[i/(M*N)][(i/M)%N][i%M] == 0) return true;
        };
        return false;
    }

    private static void day(int max) {
        boolean[][][] visitied = new boolean[H][N][M];
        Queue<Integer[]> queue = new LinkedList<>();

        int i = -1;
        while (i++ < max){
            int h = i/(M*N), n = (i/M)%N, m = i%M;
            if(map[h][n][m] == 1 && !visitied[h][n][m]) bfs(h,n,m,visitied, queue);
        }

        if(!queue.isEmpty()){
            answer++;
            rotten(queue);
            day(max);
        }
    }

    private static void rotten(Queue<Integer[]> queue) {
        while (!queue.isEmpty()) {
            Integer[] idx = queue.poll();
            map[idx[0]][idx[1]][idx[2]] = 1;
        }
    }

    private static void bfs(int h, int n, int m, boolean[][][] visitied, Queue<Integer[]> queue) {
        visitied[h][n][m] = true;
        int[][] idx = {{h+1,n,m},{h-1,n,m},{h,n-1,m},{h,n+1,m},{h,n,m-1},{h,n,m+1}};
        for (int i = 0; i < idx.length; i++) {
            if (bChk(idx[i]) && map[idx[i][0]][idx[i][1]][idx[i][2]] == 0 && !visitied[idx[i][0]][idx[i][1]][idx[i][2]]){
                visitied[idx[i][0]][idx[i][1]][idx[i][2]] = true;
                queue.add(new Integer[]{idx[i][0],idx[i][1],idx[i][2]});
            };
        }
    }
    private static boolean bChk(int[] idx) {
        return idx[0] > -1 && idx[1] > -1 && idx[2] > -1 && idx[0] < H && idx[1] < N && idx[2] < M;
    }
}
