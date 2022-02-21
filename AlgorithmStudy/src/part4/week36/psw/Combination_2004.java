package part4.week36.psw;

import java.util.Scanner;

public class Combination_2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        long two = get(n,2) - (get(n-m,2)+get(m,2));
        long five = get(n,5) - (get(n-m,5)+get(m,5));
        System.out.println(Math.min(two,five));

    }
    public static long get(int n, int target){
        long cnt = 0;
        while (n >= target){
            cnt += (n/target);
            n /= target;
        }
        return cnt;
    }
}
/*
n!/(n-m)!*m!
 */