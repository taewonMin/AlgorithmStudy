package part2.week18.psw;

import java.util.Scanner;

public class Imple_10994 { // 피라미드? 마름모?
    static char[][] map = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final byte N = sc.nextByte();
        // 1, 1+2+2, 5+2+2, 9 +2+2
        // 1 에서부터 4를 더해감
        // 1 + 4(N-1) -> 홀수
        map = new char[1 + 4*(N-1)][1 + 4*(N-1)];

        for (int i = 0; i < 1 + 2*(N-1); i++) { // 중심점은 안하네
            int end = map.length - 1;
            for (int j = i; j < end - i; j++) { // -1 을 하는 이유는
                char ch = i%2 == 0 ? '*' : ' ';
                map[i][j] = ch; // →
                map[j][end - i] = ch; // ↓
                map[end - i][end - j] = ch; // ←
                map[end - j][i] = ch; // ↑
            }
        }

        map[2*(N-1)][2*(N-1)] = '*'; // 중점
        StringBuffer sb = new StringBuffer();
        for (char[] line: map) {
            for (char t: line) sb.append(t);
            sb.append('\n');
        }

        System.out.println(sb.toString());
        sc.close();

    }
}