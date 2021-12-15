package part3.week28.jje;

import java.util.Scanner;

public class DP_1904 {
    public static void main(String[] args) {

        int[] arr = new int[10000001];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //11 2
        //12 21 111
        //121 211 112 1111 22 4 -> 5
        //1112 1121 1211 2111 122 221 11111  212 5 -> 8
        //121
        arr[2] = 2; arr[3] = 3;
        for (int i = 4; i <= n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        System.out.println(arr[n] % 15746);
        sc.close();
    }
}
