package part3.week27.psw;

import java.util.Scanner;

public class Backtracking_14889 {
    static int[][] map = null;
    static boolean[] visited = null;
    static int n = 0, min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        init();
        dfs(0,n/2);
        System.out.println(min);
    }

    private static void dfs(int i, int cnt) {
        if (cnt == 0) {
            min = Math.min(min,getValue());

            if (min==0){ // 추가하면 약 더걸려....?????!!!!!
                // 0 이면 최솟값이니깐 더 돌릴 필요가 없으니 하는건데.. 자료 구조마다 다를거같음, 조건문으로 인한 속도 저하 발생됨
                System.out.println(min);
                System.exit(0);
            }
            return;
        }

        int t = cnt==n/2 ? n/2 : n; // 첫 노드일 경우엔 n/2 만큼만 돌아도 된다..! 왜냐면 절반으로 3개를 골랐으면 나머지 팀도 결정되니깐... 근데 속도 무엇..
        for (int j = i; j < t; j++) {
            if (!visited[j]){
                visited[j] = true;
                dfs(j+1,cnt-1);
                visited[j] = false;
            }
        }
    }

    private static int getValue() {
        int start=0;
        int end=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int val = map[i][j]+map[j][i];
                if (visited[i]&&visited[j]) start += val;
                if (!visited[i]&&!visited[j]) end += val;
            }
        }
        return Math.abs(start-end);
    }

    private static void init() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n][n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
    }
}
