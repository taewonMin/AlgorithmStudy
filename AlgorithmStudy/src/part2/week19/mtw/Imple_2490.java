package part2.week19.mtw;

import java.util.Scanner;

public class Imple_2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] yut = {"E","A","B","C","D"};

        String[] answer = new String[3];
        for(int i=0; i<3; i++){
            int bae = sc.nextLine().replaceAll("[\\s|1]", "").length();
            answer[i] = yut[bae];
        }

        for(String str : answer){
            System.out.println(str);
        }

        sc.close();
    }
}
