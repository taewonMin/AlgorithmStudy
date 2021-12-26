package part3.week30.jje;

import java.util.Scanner;

public class Math_3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double r = sc.nextDouble();
        System.out.println(String.format("%.6f",(r * r * Math.PI)));
        System.out.println(String.format("%.6f",(r * r * 2)));
        sc.close();
    }
}
