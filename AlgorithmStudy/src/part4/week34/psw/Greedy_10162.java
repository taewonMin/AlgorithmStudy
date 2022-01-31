package part4.week34.psw;

import java.util.Scanner;

public class Greedy_10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] buttons = {5*60,60,10};
        int t = sc.nextInt();
        StringBuffer assume = new StringBuffer();

        if (t%10 == 0){
            for (int i = 0; i < buttons.length; i++) {
                assume.append(t/buttons[i]+" ");
                t %= buttons[i];
            }
        }else {
            assume.append(-1);
        }
        System.out.println(assume);
    }
}
