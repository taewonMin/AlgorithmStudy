package part2.week20.psw;

import java.util.Scanner;

public class Recursion_2447 {
    static char[][] map;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new char[n][n];
        drawStar(n, 0, 0);
        printStar();
        sc.close();
    }

    static int cnt = 0;

    private static void drawStar(int size, int x, int y) {
        for (int i = 0; i < 9; i++) {
            if(i != 4){
                if(size != 3){
                    drawStar(size/3 ,x+(size/3)*(i/3), y+(size/3)*(i%3));
                }else {
                    map[x+(i/3)][y+(i%3)]='*';
                }
            }
        }
    }

    private static void printStar(){
        StringBuffer sb = new StringBuffer();
        for (char[] line: map) {
            for (char t: line) sb.append(t == '*' ? t : ' ');
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}

/*
(0,0)(0,3)(0,6)     (0,9)(0,12)(0,15)    (0,18)(0,21)(0,24)


(3,0)     (3,6)     (3,9)      (3,15)     (3,18)     (3,24)


(6,0)(6,3)(6,6)     (6,9)(6,12)(6,15)    (6,18)(6,21)(6,24)
--------------------------------------------------------------

(9,0)(9,3)(9,6)                          (9,18)         (9,24)


(12,0)      (12,6)                       (12,18)     (12,24)


(15,0)(15,3)(15,6)                       (15,18)(15,21)(15,24)

--------------------------------------------------------------

(18,0)(18,3)(18,6)  (18,9)(18,12)(18,15)    (18,18)(18,21)(18,24)


(21,0)      (21,6)  (21,9)       (21,15)    (21,18)        (21,24)


(24,0)(24,3)(24,6)  (24,9)(24,12)(24,15)    (24,18)(24,21)(24,24)
--------------------------------------------------------------

 */