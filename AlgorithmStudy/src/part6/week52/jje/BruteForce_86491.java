package part6.week52.jje;

import java.util.Scanner;

public class BruteForce_86491 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] sizes = new int[2][n];
        int l = sizes[0].length;
        for (int i = 0; i < n; i++) {
            int width = sc.nextInt();
            int height = sc.nextInt();
            if (width >= height) {
                sizes[0][i] = width;
                sizes[1][i] = height;
            } else {
                sizes[0][i] = height;
                sizes[1][i] = width;
            }

        }
        int maxWidth = 0;
        int maxHeight = 0;

        for (int i = 0; i < n; i++) {
            if (sizes[0][i] > maxWidth) maxWidth = sizes[0][i];
            if (sizes[1][i] > maxHeight) maxHeight = sizes[1][i];
        }

        System.out.println(maxWidth * maxHeight);

    }
}
