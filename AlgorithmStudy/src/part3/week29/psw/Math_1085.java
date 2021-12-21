package part3.week29.psw;

import java.util.Scanner;

public class Math_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt(),w=sc.nextInt(),h=sc.nextInt();
        sc.close();
        System.out.println(Math.min(Math.min(w-x,x),Math.min(h-y,y)));
    }
}
