package part3.week21.mtw;

import java.util.Scanner;

public class Recursion_10829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        System.out.println(binaryNumber(N));

        sc.close();
    }

    public static String binaryNumber(long N){
        if(N==1) return String.valueOf(N);
        
        return binaryNumber(N/2) + String.valueOf(N%2);
    }
}
