package part3.week22.phk;

import java.util.Scanner;

// 12940kb	120ms
public class Brute_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int[] rank = new int[n];
        for (int i = 0; i < rank.length; i++) {
            rank[i] = 1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][0] < arr[j][0] & arr[i][1] < arr[j][1]) rank[i]++;
                
            }
            System.out.print(rank[i] + " ");
        }

    }
}
