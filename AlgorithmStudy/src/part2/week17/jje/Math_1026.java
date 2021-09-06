package part2.week17.jje;

import java.util.Arrays;
import java.util.Scanner;

public class Math_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] aArray = new int[num];
        int[] bArray = new int[num];
        int result = 0;

        for (int i = 0; i < num; i++) {
            aArray[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            bArray[i] = sc.nextInt();
        }

        Arrays.sort(aArray);
        Arrays.sort(bArray);

        for (int i = 0; i < num; i++) {
            result += aArray[i]*bArray[num-(i+1)];
        }

        System.out.println(result);
        sc.close();
    }
}
