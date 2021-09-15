package part2.week19.psw;

import java.util.Scanner;

public class Imple_2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =0;
        while (i++<3){
            System.out.println("EABCD".charAt(sc.nextLine().replaceAll("[1, ]","").length()));
        }
    }
}