package part3.week27.psw;

import java.util.Scanner;

public class Math_2839 {
    public static void main(String[] args) {
        //System.out.println(calc(new Scanner(System.in).nextInt()));
        for (int i = 3; i < 5001; i++) {
            calc(i);
        }
    }
    // 12880	108
    private static int calc(int n) {
        int t = n/3;
        int p = n/5;
        if (n==3||n==6||n==9) return t;
        for (int i = 0; i <= t; i++) {
            for (int j = p; j >= 0; j--) {
                if (j*5 + i*3 == n) {
                    System.out.printf("%d%s%d%s%d%s",n," = ",j," : ",i,"\n");
                    return j+i;
                }
            }
        }
        return -1;
    }
    // 12828	120
    private static int calc2(int n){
        if (n < 10) return n == 9 ? 3 : n == 8 || n == 6 ? 2 : n == 3 || n == 5 ? 1 : -1;
        switch (n%5){
            case 0: return 0 + (n -3*0)/5;
            case 1: return 2 + (n -3*2)/5;
            case 2: return 4 + (n -3*4)/5;
            case 3: return 1 + (n -3*1)/5;
            case 4: return 3 + (n -3*3)/5;
        }
        return 0;
    }
}
