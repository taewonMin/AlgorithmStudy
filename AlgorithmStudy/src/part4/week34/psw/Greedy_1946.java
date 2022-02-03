package part4.week34.psw;

import java.util.Scanner;
//301244	3076... ?
public class Greedy_1946 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int[] score = new int[sc.nextInt()+1];
            for (int j = 1; j < score.length; j++) {
                score[sc.nextInt()] = sc.nextInt();
            }
            int cnt = 1, min = score[1];
            for (int j = 2; j < score.length; j++) {
                if (score[j] <= min){
                    min = score[j];
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
