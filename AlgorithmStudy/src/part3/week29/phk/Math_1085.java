package part3.week29.phk;

import java.util.Scanner;

public class Math_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        sc.close();
        
//        int min = Math.min(x < w/2 ? x : w-x, y < h/2 ? y : h - y);
        
        System.out.println(Math.min(x <= w/2 ? x : w-x, y <= h/2 ? y : h - y));
        
    }
}
