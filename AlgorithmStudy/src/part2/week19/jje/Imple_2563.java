package part2.week19.jje;

import java.util.Scanner;

public class Imple_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int paperNum = sc.nextInt();
        boolean[][] sketchbook = new boolean[100][100];
        int result = 0;

        for (int i = 0; i < paperNum; i++) {
            int width = sc.nextInt();
            int height = sc.nextInt();

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if(!sketchbook[width+j][height+k]){
                        sketchbook[width+j][height+k]=true;
                        result++;
                    }
                }
            }
        }
        System.out.println(result);

        sc.close();
    }
}
