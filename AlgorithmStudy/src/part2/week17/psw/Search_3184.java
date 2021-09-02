package part2.week17.psw;

import java.util.Scanner;

public class Search_3184 {
    static String[][] map;
    static boolean[][] visitied;
    static int v = 0;
    static int o = 0;

    private static void dfs(int i, int j) {
        countObject(map[i][j]);
        visitied[i][j] = true;
        for (int y = -1; y <= 1; y++) {
            for (int x = -1; x <= 1; x++) {
                if(x*y != 0) continue;
                if (boundaryChk(y+i,x+j) && !"#".equals(map[y+i][x+j]) && !visitied[y+i][x+j] ){
                    dfs(y+i,x+j);
                }
            }
        }
    }

    private static void countObject(String m) {
        if(m.equals("v")) v++;
        if(m.equals("o")) o++;
    }

    private static boolean boundaryChk(int i, int j) {
        return  i > -1 && j > -1 && i < map.length && j < map[0].length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new String[sc.nextInt()][sc.nextInt()];sc.nextLine();
        for (int i = 0; i < map.length; i++) map[i] = sc.nextLine().split("");
        visitied = new boolean[map.length][map[0].length];
        int wolf = 0;
        int sheep = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if( !"#".equals(map[i][j]) && !visitied[i][j]){
                    v = 0;
                    o = 0;
                    dfs(i,j);
                    sheep += o > v ? o : 0 ;
                    wolf += o <= v ? v : 0;
                }
            }
        }
        sc.close();
        System.out.println(sheep +" " + wolf);
    }


}
