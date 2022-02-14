package part4.week35.psw;

import java.util.Scanner;
//12948	116
public class Number_1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            max = Math.max(val,max);
            min = Math.min(val,min);
        }
        System.out.println(max*min);
        sc.close();
    }
}
