package part2.week19.psw;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_7569 {
    static int[][][] map;
    static int answer;
    static int H,N,M;
    static Queue<Integer[]> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();N = sc.nextInt();H = sc.nextInt();
        map = new int[H][N][M];

        int i = -1;
        int max = H*N*M-1;
        while (i++ < max) {
            int h = i/(M*N), n = (i/M)%N, m = i%M;
            map[h][n][m] = sc.nextInt();
            if(map[h][n][m] == 1) queue.add(new Integer[]{h,n,m,0});
        }
        bfs();

        System.out.println(Arrays.deepToString(map).contains("0") ? -1 : answer);
    }

    private static void bfs() {
        boolean[][][] visitied = new boolean[H][N][M];

        while (!queue.isEmpty()){
            Integer[] t = queue.poll();
            int h = t[0], n = t[1], m = t[2];
            visitied[h][n][m] = true;

            int[][] idx = {{h+1,n,m},{h-1,n,m},{h,n-1,m},{h,n+1,m},{h,n,m-1},{h,n,m+1}};

            for (int i = 0; i < idx.length; i++) {
                int h2 = idx[i][0],n2 = idx[i][1], m2 = idx[i][2];
                if (bChk(idx[i]) && map[h2][n2][m2] == 0 && !visitied[h2][n2][m2]){
                    visitied[h2][n2][m2] = true;
                    map[h2][n2][m2] = 1;
                    queue.add(new Integer[]{h2,n2,m2,t[3]+1});
                };
            }
            answer = t[3];
        }

    }
    private static boolean bChk(int[] idx) {
        return idx[0] > -1 && idx[1] > -1 && idx[2] > -1 && idx[0] < H && idx[1] < N && idx[2] < M;
    }
}
