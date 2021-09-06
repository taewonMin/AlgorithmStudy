package part2.week17.jje;

import java.util.Scanner;

public class Imple_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //97~122까지 알파벳

        String s = sc.next();
        int[] alphabet = new int[122-97+1];
        int num = 97;
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = num;
            num++;
        }
        for (int j = 0; j < alphabet.length; j++) {
            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                if((int)s.charAt(i)==alphabet[j]) result++;
            }
            System.out.println(result);
        }
        sc.close();
    }
}
