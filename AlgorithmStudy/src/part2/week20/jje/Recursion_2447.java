package part2.week20.jje;

import java.util.Scanner;

public class Recursion_2447 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //카드개수
        int m = sc.nextInt();
        int[] cardNum = new int[n];
        int result = 0;
        int tempResult = 0;

        for (int i = 0; i < n; i++) {
            cardNum[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    result = cardNum[i]+cardNum[j]+cardNum[k];
                    if(tempResult < result && result <= m) tempResult = result;
                }
            }
        }

        System.out.println(tempResult);
    }
}
