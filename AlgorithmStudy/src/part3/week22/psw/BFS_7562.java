package part3.week22.psw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_7562 {
    static boolean[][] visitied = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            visitied = new boolean[l][l];

            bfs(new Integer[]{sc.nextInt(), sc.nextInt(),0}
                    ,new Integer[]{sc.nextInt(),sc.nextInt()});
        }

        sc.close();
    }

    private static void bfs(Integer[] now, Integer[] target) {
        Queue<int[]> queue = new LinkedList<>();
        visitied[now[0]][now[1]] = true;
        queue.offer(new int[]{now[0],now[1],0});
        int[][] go = {{-2,1},{-1,2},
                {1,2},{2,1},
                {2,-1},{1,-2},
                {-1,-2},{-2,-1}
        };

        while (!queue.isEmpty()){
            int[] t = queue.poll();

            if(t[0] == target[0] && t[1] == target[1]){
                System.out.println(t[2]);
                return;
            }

            for(int i=0; i<go.length; i++){
                int x = t[0]+go[i][0];
                int y = t[1]+go[i][1];

                if(bChk(x, y) && visitied[x][y] == false){
                    visitied[x][y] = true;
                    queue.offer(new int[]{x,y,t[2]+1});
                }
            }
        }
    }

    private static boolean bChk(int n, int m) {
        return n > -1 && m > -1 && n < visitied.length && m < visitied.length;
    }
}
