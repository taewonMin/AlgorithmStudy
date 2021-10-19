package part3.week22.chw;

import java.util.Scanner;

public class Brute_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        int cnt = 0;
        int startNum = 665;
        while(input != cnt) {
        	startNum++;
        	if((startNum+"").contains("666")) cnt++;
        }
        System.out.println(startNum);
    }
}
