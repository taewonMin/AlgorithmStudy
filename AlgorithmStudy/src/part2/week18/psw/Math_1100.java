package part2.week18.psw;

import java.util.Scanner;

public class Math_1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        int i = 0;
        for (int j = 0; j < 8; j++) {
            for (String horse: sc.nextLine().split("")) {
                if((i+j)%2 == 0 &&  "F".equals(horse)) answer++;
                i++;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}
