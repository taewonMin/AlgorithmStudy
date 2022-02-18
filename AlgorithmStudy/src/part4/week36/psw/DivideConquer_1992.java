package part4.week36.psw;

import java.util.Scanner;
//15388	124
public class DivideConquer_1992 {
    static char[][] map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        map = new char[n][];
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            map[i] = line.toCharArray();
            sb.append(line);
        }

        if (sb.indexOf("0") == -1 || sb.indexOf("1") == -1) {
            System.out.println(sb.substring(0,1));
        }else {
            String str = goQuadTree(0,0,n);
            System.out.println(str);
        }
    }

    private static String goQuadTree(int i,int j,int n) {
        String str = "(";
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                str += searchMap(i + k*(n/2),j + l*(n/2),n/2);
            }
        }
        return str+")";
    }

    private static String searchMap(int i, int j, int n) {
        char str = map[i][j];
        if (n==1) return str+"";

        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                if (str != map[i+k][j+l]){
                    return goQuadTree(i,j,n);
                }
            }
        }
        return str+"";
    }
}
