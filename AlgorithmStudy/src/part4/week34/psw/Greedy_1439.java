package part4.week34.psw;

import java.util.Scanner;
// 	13060	116
public class Greedy_1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "00000";
        int zero = 0, one = 0;
        char compare = '2';
        for (int i = 0; i < str.length(); i++) {
            if (compare != str.charAt(i)){
                compare = str.charAt(i);
                if (compare == '0') zero++;
                else one++;
            }
        }
        System.out.println(Math.min(zero,one));
    }
}
