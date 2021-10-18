package part3.week22.jje;

import java.util.Scanner;

public class Brute_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] weight = new int[n][2];
        for (int i = 0; i < n; i++) {
            weight[i][0] = sc.nextInt();
            weight[i][1] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            int result = 1;
            for (int j = 0; j < n; j++) {
                if(weight[i][0] < weight[j][0] && weight[i][1] < weight[j][1]) result++;
            }
            System.out.print(result+" ");
        }
        sc.close();
    }
}
