package part2.week19.jje;

import java.util.Scanner;

public class Dynamic_17212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println(calcMoney(sc.nextInt()));

        int[] dp = new int[100001];

        int n = sc.nextInt();

        dp[1] = 1; dp[2] = 1; dp[3] = 2; dp[4] = 2; dp[5] = 1; dp[6] = 2; dp[7] = 1;

        for (int i = 8; i <= n; i++) {
            if(i % 7 == 0){
                dp[i] = i / 7;
            }else{
                int[] arr = {dp[i - 7], dp[i - 5], dp[i -2], dp[i -1]};
                dp[i] = min(arr) + 1;
            }
        }

        System.out.println(dp[n]);
        sc.close();
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

/**
    static int result = 0;
    static int calcMoney(int money){
            while(money != 0){
                if(money % 5 == 0 && money % 7 != 0){
                    result += money / 5;
                    break;
                }
                if(money >= 7){
                    money -= 7;
                }else if(money >= 5){
                    money -= 5;
                }else if(money >= 2){
                    money -= 2;
                }else if(money >= 1){
                    money -= 1;
                }
                result++;
            }
            return result;

    }
 **/
}
