package part3.week21.psw;

import java.util.*;

public class BFS_2206 {
    static char[][] map = null;
    static int N;
    static int M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        map = new char[N][M];
        for (int i = 0; i < N; i++) map[i] = sc.nextLine().toCharArray();

        int answer = bfs();

        System.out.println(answer == 0 ? -1 : answer);
        sc.close();
    }

    static int cnt = 0;
    private static int bfs() {
        Queue<Integer[]> queue = new LinkedList<>();
        boolean[][][] visitied = new boolean[N][M][2];

        queue.add(new Integer[]{0,0,1,1});
        visitied[0][0][0] = true;
        visitied[0][0][1] = true;
        int tt = 0;
        while (!queue.isEmpty()){
            Integer[] t = queue.poll();
            int[][] idx = {{t[0]+1,t[1]},{t[0]-1,t[1]}, {t[0],t[1]+1},{t[0],t[1]-1}};
            for (int i = 0; i < idx.length; i++) {
                int n = idx[i][0];
                int m = idx[i][1];
                tt++;
                if (bChk(n,m)){
                    if(t[3] == 1 && !visitied[n][m][0] && map[n][m] == '0'){
                        visitied[n][m][0] = true;
                        queue.add(new Integer[]{n,m,t[2]+1,1});
                    }else if(t[3] == 1 && !visitied[n][m][1] && map[n][m] == '1'){
                        visitied[n][m][1] = true;
                        queue.add(new Integer[]{n,m,t[2]+1,0});
                    }else if(t[3] == 0 && !visitied[n][m][1] && map[n][m] == '0'){
                        visitied[n][m][1] = true;
                        queue.add(new Integer[]{n,m,t[2]+1,0});
                    }
                }
            }

            if (t[0] == N-1 && t[1] == M-1){
                cnt = cnt == 0 ? t[2] : Math.min(cnt,t[2]);
            }
        }
        return cnt;
    }

    private static boolean bChk(int n, int m) {
        return n > -1 && m > -1 && n < N && m < M;
    }
}
/** 최단거리
 * 노드를 결정하는 조건 0이거나 벽을 부수지 않은 상태에서 1
 * 각 노드는 벽을 부섰거나 안부섰거나의 정보를 담고 있음
 * 근데 벽을 부쉈거나 안 부순 상태에 따라서 visitied는 가변적이게됨
 * 우선적으로 벽을 부순적이 없다면 0인 장소들을 무적권적으로 방문해야함 (고정 visitied) 그래야 부순적 없는 벽들을 한번씩 건들여봄
 *                      0
 *                  (상 하 좌 우)
 *  (상 하 좌 우),(상 하 좌 우),(상 하 좌 우),(상 하 좌 우) 이 노드 어딘가에 존재하는 N,M의 좌표
 *
 *
 *
 */