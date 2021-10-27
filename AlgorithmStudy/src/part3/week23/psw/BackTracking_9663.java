package part3.week23.psw;

import java.util.Scanner;

public class BackTracking_9663 {
    static int answer = 0;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dfs(new boolean[N][N],N);
        sc.close();
        System.out.println(answer);
    }

    private static void dfs(boolean[][] visited, int cnt) {
        if (cnt == 0){
            answer++;
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfs(queenMap(visited,i,j) ,cnt-1);
                }
            }
        }
    }

    private static boolean[][] queenMap(boolean[][] visited, int i, int j) {
        boolean[][] map = new boolean[N][];
        for (int k = 0; k < N; k++) {
            map[k] = visited[k].clone();
        }


        for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
                if (bChk(k+i,l+j)) {
                    map[k+i][l+j] = true;
                    int n = 2;
                    while (k*l != 0 && bChk(k*n,l*n)){
                        map[k*n][l*n] = true;
                        n++;
                    }
                }
            }
        }
        return map;
    }

    private static boolean bChk(int x, int y) {
        return x > -1 && y > -1 && x < N && y < N;
    }

}
/*

300
003
300

 */