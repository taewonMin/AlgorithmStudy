package part3.week29.psw;

import java.util.Scanner;
// 12836	108
public class Math_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[6];
        for (int i = 0; i < 6; i++) x[i] =sc.nextInt();
        System.out.println((x[0]==x[2]?x[4]:x[0]==x[4]?x[2]:x[0])+" "
                +(x[1]==x[3]?x[5]:x[1]==x[5]?x[3]:x[1]));
        sc.close();
    }
}
