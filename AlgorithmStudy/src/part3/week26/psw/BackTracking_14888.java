package part3.week26.psw;

import java.util.Scanner;

public class BackTracking_14888 {
    static int[] numbers;
    static int[] calc;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        numbers = new int[n];
        calc = new int[4];
        for (int i = 0; i < n; i++) numbers[i] = sc.nextInt();
        for (int i = 0; i < 4; i++) calc[i] = sc.nextInt();
        sc.close();
        dfs(numbers[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int sum, int cnt) {
        if (cnt == numbers.length) {
            max = Math.max(sum, max);
            min = Math.min(sum, min);
        }

        for (int i = 0; i < 4; i++) {
            if (calc[i] > 0) {
                calc[i]--;
                switch (i) {
                    case 0:
                        dfs(sum + numbers[cnt], cnt + 1);
                        break;
                    case 1:
                        dfs(sum - numbers[cnt], cnt + 1);
                        break;
                    case 2:
                        dfs(sum * numbers[cnt], cnt + 1);
                        break;
                    case 3:
                        dfs(sum / numbers[cnt], cnt + 1);
                        break;
                }
                calc[i]++;
            }
        }
    }
}
