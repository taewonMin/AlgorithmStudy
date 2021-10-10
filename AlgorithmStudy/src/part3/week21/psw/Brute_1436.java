package part3.week21.psw;

import java.util.Scanner;

public class Brute_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int target = sc.nextInt();
        int answer = 0;
        int i = 666;
        while (target != n){
            if (String.valueOf(i).contains("666")){
                n++;
                answer=i;
            }
            i++;
        }
        System.out.println(answer);
        sc.close();
    }
}
