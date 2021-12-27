package part3.week30.phk;

import java.util.Scanner;

public class Math_3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();
        // 유클리드 기하학 원의 넓이 pi*r*r
        System.out.println(String.format("%.6f", Math.PI*r*r)); 
        
        // 택시 기하학 원의 넓이 = 2r*2r/2 = 2*r*r
        // 유클리드 기하학상에서 마름모 = 택시 기하학에서 원
        System.out.println(String.format("%.6f", (double)2*r*r));
    }
}
