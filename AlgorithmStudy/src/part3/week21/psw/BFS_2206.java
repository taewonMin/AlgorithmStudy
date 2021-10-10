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

        LinkedList<Integer[]> queue = new LinkedList<>();
        boolean[][] visitied = new boolean[N][M];

        int answer = bfs(0,0,1,queue,visitied,1);

        System.out.println(answer == 0 ? -1 : answer);
        sc.close();
    }

    static int cnt = 0;
    private static int bfs(int start, int end,int depth,LinkedList<Integer[]> queue, boolean[][] visitied, int wall) {

        queue.add(new Integer[]{start,end,depth});
        visitied[start][end] = true;

        while (!queue.isEmpty()){
            Integer[] t = queue.poll();
            int[][] idx = {{t[0]+1,t[1]},{t[0]-1,t[1]}, {t[0],t[1]+1},{t[0],t[1]-1}};
            for (int i = 0; i < idx.length; i++) {
                int n = idx[i][0];
                int m = idx[i][1];
                if (bChk(n,m) && !visitied[n][m]){

                    if (map[n][m] == '1' && wall > 0){
                        map[n][m] = '0';
                        int tt = bfs(n,m,t[2]+1,copyQueue(queue), copyVisitied(visitied),wall-1);
                        cnt = tt == 0 ? cnt: (cnt == 0 ? tt:Math.min(cnt,tt));
                        map[n][m] = '1';
                    }

                    if (map[n][m] == '0'){
                        visitied[n][m] = true;
                        queue.add(new Integer[]{n,m,t[2]+1});
                    }
                }
            }

            if (t[0] == N-1 && t[1] == M-1){
                cnt = cnt == 0 ? t[2] : Math.min(cnt,t[2]);
            }

            if (cnt != 0 && t[2] > cnt) return 0;
        }
        return cnt;
    }

    private static boolean[][] copyVisitied(boolean[][] visitied) {
        boolean[][] temp = new boolean[N][];
        for (int i = 0; i < N; i++) {
            temp[i] = visitied[i].clone();
        }
        return temp;
    }

    private static LinkedList<Integer[]> copyQueue(LinkedList<Integer[]> queue) {
        return (LinkedList)queue.clone();
    }

    private static boolean bChk(int n, int m) {
        return n > -1 && m > -1 && n < N && m < M;
    }
}
