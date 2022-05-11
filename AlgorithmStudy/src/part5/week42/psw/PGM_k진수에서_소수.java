package part5.week42.psw;

import java.util.*;

public class PGM_k진수에서_소수 {
    public static void main(String[] args) {
        int k = 1;
        int n = 2;
        int result = 1;
        System.out.println(solution(n,k) == result);
    }

    public static int solution(int n, int k){
        int result = 0;
        String str = Integer.toString(n,k);
        String[] numbers = str.split("0");
        for (int i = 0; i < numbers.length; i++) {
            if (!"".equals(numbers[i]) && isPrime(numbers[i])){
                result++;
            }
        }
        return result;
    }

    private static boolean isPrime(String number) {
        long n = Long.parseLong(number);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i == 0) return false;
        }
        return n!=1;
    }
}
