package part6.week51.jje;

import java.util.Scanner;

public class BruteForce_42842 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brown = sc.nextInt();
        int yellow = sc.nextInt();
        int width = 0;
        int height = 0;
        int total = brown + yellow;
        int[] answer = new int[2];

        for (int i = 1; i < brown / 2; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i * j) == total && (i - 2) * (j - 2) == yellow) {
                    width = i;
                    height = j;
                    break;
                }
            }
        }
        answer = new int[]{width, height};
        System.out.println(width + ", " + height);

    }
}
