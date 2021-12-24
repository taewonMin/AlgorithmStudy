package part3.week30.psw;

import java.util.Scanner;
//	12872	116
public class Math_4153 {
    public static void main(String[] args) {
        String right = "right";
        String wrong = "wrong";

        Scanner sc = new Scanner(System.in);

        while (true){
            int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
            if (a==0&&b==0&&c==0) break;
            System.out.println(isTri(a,b,c) ? right : wrong);
        }

        sc.close();
    }

    public static boolean isTri(int a, int b, int c){
        return a*a+b*b == c*c || a*a+c*c == b*b || b*b+c*c ==a*a;
    }
}
