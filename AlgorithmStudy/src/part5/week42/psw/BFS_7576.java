package part5.week42.psw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//341248	1656
public class BFS_7576 {
    static int[][] box;
    static boolean[][] visited;
    static Queue<Item> queue = new LinkedList<>();
    static int totalCnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        box = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box[i][j] = sc.nextInt();
                if (box[i][j] == 1) {
                    queue.add(new Item(0,i,j));
                    visited[i][j] = true;
                }else if (box[i][j] == 0) totalCnt++;
            }
        }
        System.out.println(bfs());
    }

    private static int bfs() {
        int cnt = 0;

        while (!queue.isEmpty()){
            Item item = queue.poll();
            cnt = Math.max(cnt, item.depth);
            if (item.depth != 0) totalCnt--;
            int[][] idxes = {{item.i-1, item.j},{item.i, item.j+1},{item.i+1, item.j},{item.i, item.j-1}};
            for (int i = 0; i < 4; i++) {
                int x = idxes[i][0], y = idxes[i][1];
                if (boundaryChk(x,y) && box[x][y]==0 && !visited[x][y]){
                    queue.add(new Item(item.depth+1,x,y));
                    visited[x][y] = true;
                }
            }
        }
        return totalCnt == 0 ? cnt : -1;
    }

    private static boolean boundaryChk(int x, int y) {
        return x>-1 && y>-1 && x<box.length && y<box[0].length;
    }


    static class Item{
        int depth;
        int i;
        int j;

        public Item(int depth, int i, int j) {
            this.depth = depth;
            this.i = i;
            this.j = j;
        }
    }
}
