package part3.week22.jje;

import java.util.Scanner;

public class Brute_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int movie = 666;
        int add = 0;

        while (true){
            if(String.valueOf(movie).contains("666")){
                add++;
                if(add == n){
                    break;
                }
            }
            movie++;
        }
        System.out.println(movie);
        sc.close();
    }
}
