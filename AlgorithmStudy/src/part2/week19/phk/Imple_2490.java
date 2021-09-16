package part2.week19.phk;

import java.util.Scanner;

// 12860kb	112ms
public class Imple_2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int cnt = 0;
            for (int j = 0; j < 4; j++) {
                if (1 == sc.nextInt()) cnt++;
            }
            // System.out.println(result(cnt));
            System.out.println("DCBAE".charAt(cnt));
            
        }
        sc.close();
    }

    static char result(int n){
        char r = 0;

        switch (n) {
            case 3:
                r = 'A';
                break;
                
            case 2:
                r = 'B';
                break;
                
            case 1:
                r = 'C';
                break;
                
            case 0:
                r = 'D';
                break;
                
            default:
                r = 'E';
                break;
        }

        return r;
    }
}
