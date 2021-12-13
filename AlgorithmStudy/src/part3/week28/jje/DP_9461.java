package part3.week28.jje;

import java.util.Scanner;

public class DP_9461 {
    static long[] arr = new long[101];

    public static void main(String[] args) {

        arr[1] = 1; arr[2] = 1; arr[3] = 1;

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = 0;
        long result = 0;
        for (int i = 0; i < t; i++) {
            n = sc.nextInt();
            if(arr[n] == 0) {
                makeTriangle(n);
            }
            System.out.println(arr[n]);
        }
        sc.close();
    }

    static void makeTriangle(int n){
        for (int i = 4; i <= n; i++) {
            if(arr[i] == 0 )  arr[i] = arr[i - 2] + arr[i - 3];
        }
    }
}
