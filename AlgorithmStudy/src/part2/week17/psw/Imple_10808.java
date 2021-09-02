package part2.week17.psw;

import java.util.Arrays;
import java.util.Scanner;

public class Imple_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] answer = new int['z'-'a'+1];

        for (char ch: sc.next().toCharArray()) {
            answer[ch-'a']++;
        }

        System.out.println(Arrays.toString(answer).replaceAll("[\\],\\,,\\[]",""));
        sc.close();
    }
}
