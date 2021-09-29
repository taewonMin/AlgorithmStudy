package part2.week19.jje;

import java.util.Scanner;

public class Imple_2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int result = 0;
            for (int j = 0; j < 4; j++) {
                if(sc.nextInt() == 1) result++;
            }
            System.out.println("ECBAD".charAt(result));
        }

        sc.close();
    }
}
