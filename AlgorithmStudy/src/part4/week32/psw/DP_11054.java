package part4.week32.psw;

import java.util.Scanner;

public class DP_11054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numbers = new int[length], asc = new int[length], desc = new int[length];

        int answer = 0;
        for (int i = 0; i < length; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < length; i++) {
            int reIdx = length-1-i;
            int max = 0;
            int min = 0;
            for (int j = 0; j < i; j++) {
                if (numbers[i] > numbers[j] && max < asc[j]) {
                    max = asc[j];
                }

                int reJdx = length-1-j;
                if (numbers[reIdx] > numbers[reJdx] && min < desc[reJdx]){
                    min = desc[reJdx];
                }
            }
            asc[i] = max +1;
            desc[reIdx] = min +1;

        }
        for (int i = 0; i < length; i++) {
            answer = Math.max(answer,desc[i]+asc[i]-1);
        }

        System.out.println(answer);
        sc.close();
    }
}
