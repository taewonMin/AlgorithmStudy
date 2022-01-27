package part4.week34.psw;

import java.util.Scanner;

public class Greedy_13305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] km = new int[N-1];
        for (int i = 0; i < km.length; i++) {
            km[i] = sc.nextInt();
        }
        long min = Long.MAX_VALUE;
        long answer = 0;
        for (int i = 0; i < N; i++) {
            long cost = sc.nextInt();
            if (cost < min){
                min = cost;
            }
            if(i < km.length) answer += min*km[i];
        }
        System.out.println(answer);
    }
}
