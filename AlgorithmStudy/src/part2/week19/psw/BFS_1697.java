package part2.week19.psw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_1697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = bfs(sc.nextInt(), sc.nextInt());
        System.out.println(answer);
        sc.close();
    }

    private static int bfs(int start, int end) {
        Queue<Integer[]> queue = new LinkedList<>();
        boolean[] visitied = new boolean[100001];

        if(end-start != 0) queue.add(new Integer[]{start,0}); // 현재값, 깊이
        visitied[start] = true;

        while (!queue.isEmpty()){
            Integer[] now = queue.poll();
            Integer[] go = {now[0]*2, now[0]+1, now[0]-1};
            for (int i = 0; i < go.length; i++) {
                if (go[i] == end) return now[1]+1;

                if (boundaryChk(go[i]) && !visitied[go[i]]) {
                    visitied[go[i]] = true;
                    queue.add(new Integer[]{ go[i], now[1]+1});
                }
            }
        }
        return 0;
    }

    private static boolean boundaryChk(Integer go) {
        return go > 0 && go <= 100000;
    }
}
/*
    2 3^8 10
                        3                            1
                      2 4 6                          3
                abc,  ab3,  abc                       ...
 [abc,2 abc,abc], [abc,abc,abc], [abc,abc,abc]        3^n
 */