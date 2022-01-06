package part3.week30.psw;

import java.util.Scanner;
// 13040	112
public class Math_3053 {
    static double PI = Math.PI;
    static String formatter = "%.6f";
    public static void main(String[] args) {
        int r = new Scanner(System.in).nextInt();
        System.out.print(round(PI*(r*r))+"\n"+round(2.0*(r*r)));
    }
    public static String round(double num){
        return String.format(formatter,num);
    }
}
