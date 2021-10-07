package part3.week21.psw;

import java.util.Scanner;

public class Brute_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;

            String str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                sum += Integer.parseInt(String.valueOf(str.charAt(j)));
            }

            if( i + sum == n ) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
