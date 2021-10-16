package part3.week22.psw;

import java.util.Scanner;

public class Brute_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        int[][] mans = new int[N][];
        for (int i = 0; i < N; i++) {
            mans[i] = new int[]{sc.nextInt(),sc.nextInt()};
        }

        for (int i = 0; i < N; i++) {
            int answer = 1;
            for (int j = 0; j < N; j++) {
                if (i==j) continue;
                if (mans[i][0] < mans[j][0] && mans[i][1] < mans[j][1]) answer++;
            }
            System.out.print(answer+" ");
        }

        sc.close();
    }
}
