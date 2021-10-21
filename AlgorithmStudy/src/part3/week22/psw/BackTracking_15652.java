package part3.week22.psw;

import java.util.Arrays;
import java.util.Scanner;

public class BackTracking_15652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        int[] numbers = new int[m];
        Arrays.fill(numbers,1); // 3 3 3 = 9 +1
        while (m*n+1 != Arrays.stream(numbers).sum()){
            StringBuffer sb = new StringBuffer();
            boolean flag = true;

            sb.append(numbers[0]);
            for (int i = 1; i < m; i++) {
                if (numbers[i-1] > numbers[i]) {
                    flag = false;
                    break;
                }
                sb.append(" "+numbers[i]);
            }
            if (flag) System.out.println(sb);
            arrPlus(numbers, n);
        }
    }

    private static void arrPlus(int[] numbers, int n) {
        numbers[numbers.length-1]++;
        for (int i = numbers.length-1; i > 0; i--) {
            if (numbers[i] > n){
                numbers[i] = 1;
                numbers[i-1]++;
            }
        }
    }
}
