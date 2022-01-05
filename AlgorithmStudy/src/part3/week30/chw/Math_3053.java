package part3.week30.chw;

import java.util.Scanner;

public class Math_3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double pie = Math.PI;
        System.out.printf("%.6f\n",pie*r*r);
        System.out.printf("%.6f\n",2.0*r*r);
        sc.close();
    }
}
