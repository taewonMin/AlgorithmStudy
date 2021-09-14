package part2.week18.jje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Math_1100 {
    public static void main(String[] args) throws IOException {
        //넣으면서 세기..? 8*8
        // 0,0 2,0 4,0 6,0
        // 1,1 3,1 5,1 7,1
        // ....
        /**
         * .F.F...F
         * F...F.F.
         * ...F.F.F
         * F.F...F.
         * .F...F..
         * F...F.F.
         * .F.F.F.F
         * ..FF..F.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        for (int i = 0; i < 8; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String chess = st.nextToken();
            for (int j = 0; j < 8; j++) {
                if(chess.charAt(j)=='F'){
                    if((i % 2 == 0 && j % 2 == 0)||(i % 2 != 0 && j % 2 != 0)){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);

        br.close();
    }
}
