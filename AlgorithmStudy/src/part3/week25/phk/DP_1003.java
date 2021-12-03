package part3.week25.phk;

import java.util.Scanner;

public class DP_1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] N = new int[T];
        for (int i : N) {
            i = sc.nextInt();
        }
        sc.close();

        for (int i : N) {
            int[] result = { 0, 0 };
            if(fibonacci(i) == 0) {
                result[0]++;
            }else if(fibonacci(i) == 1) {
                result[1]++;
            }else{
                result[0]++;
                result[1]++;
            }
            System.out.printf("%d %d\n", result[0], result[1]);
        }
        
        // System.out.println(fibonacci(0));
        // System.out.println(fibonacci(1));
        // System.out.println(fibonacci(2));
        // System.out.println(fibonacci(3));
        // System.out.println(fibonacci(4));
        // System.out.println(fibonacci(5));
    }

    public static int fibonacci(int n){
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

/**
 * f(3) = f(2) + f(1)
 *      = f(1) + f(0) + f(1)
 * 2    1
 * 
 */