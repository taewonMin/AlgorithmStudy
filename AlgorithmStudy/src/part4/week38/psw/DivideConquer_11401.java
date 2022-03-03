package part4.week38.psw;

import java.util.Scanner;
//12924	236
public class DivideConquer_11401 {
    static int p = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long top = factorial(n)%p;
        long bottom = factorial(k)*factorial(n-k)%p;
        System.out.println(top*pow(bottom,p-2)%p);
    }

    private static long pow(long a, int b) {
        if (b==1) return a%p;
        long temp = pow(a,b/2);
        if (b%2==1) return (temp*temp%p)*a%p;
        return temp*temp%p;
    }

    private static long factorial(long n) {
        long sum = 1;
        while (n > 1) sum = (sum*n--)%p; // 재귀로 팩토리얼 할경우 스택 터짐
        return sum;
    }
}
