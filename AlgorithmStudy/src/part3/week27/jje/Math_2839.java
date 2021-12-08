package part3.week27.jje;

import java.util.Scanner;

public class Math_2839 {
    public static void main(String[] args) {
        //3 5

        Scanner sc = new Scanner(System.in);
                /*
        int n = sc.nextInt();
        int result = 0;
        while(n > 2) {
            if(n % 5 == 0) {
                result += n / 5;
                break;
            } else {
                n -= 3;
                result++;
            }
        }
        if(n < 3) {
            System.out.println(-1);
        } else{
            System.out.println(result);
        }

    }
    */

        int[] dp = new int[5001];
        int n = sc.nextInt();

        dp[3] = 1; dp[4] = -1; dp[5] = 1; dp[6] = 2; dp[7] = -1;

        for (int i = 8; i <= n; i++) {
                int[] arr = {dp[i - 5], dp[i - 3]};
                dp[i] = min(arr) + 1;
        }

        System.out.println(dp[n]);
        sc.close();
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (min != -1 && num != -1){
                if (num < min) {
                    min = num;
                }
            }else {
                min = Math.max(min, num);
            }
        }
        return min;
    }

}