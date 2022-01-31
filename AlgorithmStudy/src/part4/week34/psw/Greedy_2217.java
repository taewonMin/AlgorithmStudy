package part4.week34.psw;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ropes = new int[sc.nextInt()];
        for (int i = 0; i < ropes.length; i++) {
            ropes[i] = sc.nextInt();
        }

        Arrays.sort(ropes);
        int answer = 0;
        for (int i = 0; i < ropes.length; i++) {
            answer = Math.max(answer, ropes[i]*(ropes.length-i));
        }
        System.out.println(answer);
    }
}
