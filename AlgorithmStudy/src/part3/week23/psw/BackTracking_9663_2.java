package part3.week23.psw;

import java.util.Scanner;

public class BackTracking_9663_2 {
    static int answer = 0;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dfs(new boolean[N][N],new boolean[N][N],N);
        sc.close();
        System.out.println(answer);
    }

    private static void dfs(boolean[][] visited, boolean[][] map, int depth) {
        if (depth == 0){
            answer++;
            return;
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (depth==map.length) visited = new boolean[map.length][map.length];
                if (!map[i][j] && !visited[i][j]){
                    map[i][j] = true;
                    dfs(setChase(visited,i,j,map), deepCopy(map),depth-1);
                }
            }
        }
    }

    private static boolean bChk(int x, int y) {
        return x > -1 && y > -1 && x < N && y < N;
    }

    private static boolean[][] deepCopy(boolean[][] list){
        boolean[][] copyList = new boolean[list.length][];
        for (int i = 0; i < list.length; i++) {
            copyList[i] = list[i].clone();
        }
        return copyList;
    }

    private static boolean[][] setChase(boolean[][] map, int i, int j,boolean[][] qMap){
        for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
                if (bChk(k+i,l+j)) {
                    map[k+i][l+j] = true;

                    if (k==0 && l==0) continue;
                    int n = 2;
                    while (bChk(i+(k*n),i+(k*n)) && !qMap[i+(k*n)][i+(k*n)]){
                        int x = i+(k*n);
                        int y = j+(l*n);
                        map[x][y] = true;
                        n++;
                    }

                }
            }
        }
        return map;
    }
}
/*

300
003
300

1. 방문 기록은 초기화 되어야 함

0
5
6



같은 수열은 방문 못함

1. 2차원 배열이므로 먼저 첫번째 칸부터 가능한 모든 케이스를 방문함
2. 다음 케이스에는 이전에 방문했던 방문 이력을 받아서 해당 케이스는 절대 가지 않음(단 놓을수 있는것과는 구분)


100
001
010

 */