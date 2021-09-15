package part2.week18.psw;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Search_14502 {
    static int answer = 0;
    static Byte[][] map = null;

    public static void main(String[] args) { // 0 의 수가 3개 이상인지 조건이 없다. ㅡㅡ;
        Scanner sc = new Scanner(System.in);
        final byte N = sc.nextByte();
        final byte M = sc.nextByte();
        map = new Byte[N][M];

        for (byte i = 0; i < N; i++) {
            for (byte j = 0; j < M; j++) {
                map[i][j] = sc.nextByte();
            }
        }
        setDfsWalls();
        sc.close();
        System.out.println(answer);
    }

    private static void setDfsWalls() {
        dfs(3);
    }

    private static void dfs(int walls) {
        if(walls == 0){
            countSafeArea();
            return;
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 0){
                    map[i][j] = 1;
                    dfs(walls-1);
                    map[i][j] = 0;
                }
            }
        }
    }

    private static void countSafeArea() {
        int cnt = 0;
        Byte[][] inpected = goVirus();
        for (Byte[] line: inpected) {
            for (Byte t: line) {
                if(t == 0) cnt++;
            }
        }
        //deepPrint(inpected);
        if(cnt > answer) answer = cnt;
    }

    private static Byte[][] goVirus() {
        boolean[][] visitied = new boolean[map.length][map[0].length];
        Byte[][] copyMap = new Byte[map.length][];
        for (int i = 0; i < copyMap.length; i++) {
            copyMap[i] = map[i].clone();
        }

        for (int i = 0; i <  map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(map[i][j] == 2 && !visitied[i][j]){
                    bfs(i,j,visitied, copyMap);
                }
            }
        }

        return copyMap;
    }

    private static void bfs(int i, int j, boolean[][] visitied, Byte[][] copyMap) {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{i,j});
        visitied[i][j] = true;
        while (!queue.isEmpty()){
            Integer[] maps = queue.poll();
            for (int k = -1; k <= 1; k++) {
                for (int l = -1; l <= 1; l++) {
                    if(k*l != 0) continue;
                    int x = k + maps[0];
                    int y = l + maps[1];
                    if(boundsCheck(x,y) && (copyMap[x][y] == 0 || copyMap[x][y] == 2) && !visitied[x][y]){
                        queue.add(new Integer[]{x,y});
                        copyMap[x][y] = 2;
                        visitied[x][y] = true;
                    }
                }
            }
        }
    }

    private static boolean boundsCheck(int x, int y) {
        return x > -1 && y > -1 && x < map.length && y < map[0].length;
    }


    private static void deepPrint(Byte[][] map){
        for (Byte[] t: map) {
            System.out.println(Arrays.toString(t).replaceAll("\\,",""));
        }
    }
}
