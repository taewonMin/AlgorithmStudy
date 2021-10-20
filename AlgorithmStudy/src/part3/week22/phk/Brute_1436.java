package part3.week22.phk;

import java.util.Scanner;

// 159672kb	392ms
public class Brute_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = 666;
        int count = 1;
        while (count != n) {
            result++;
            if(String.valueOf(result).contains("666")) count++;
            
        }

        System.out.println(result);

        ///////////////////////////////////////////////////////
        /*
        int[] arr = new int[10000];
        String result = "666";

        for ( int i = 0; i < 10; i++) {
            for (int j = 0; j < arr.length; j++) {
                result = i + result + j;
            }
        }

        // a + 666 + b
        // a:0~10(11개)
        // b:0~1000(1001개)

        /*          a   b
        1   666     0   0    
        2   1666    1   0
        3   2666    2   0
        4   3666    3   0
        5   4666    4   0
        6   5666    5   0

            6660    0   0
        7   6661    0   1    
        8   6662    0   2
        9   6663    0   3
        10  6664    0   4
        11  6665    0   5
        12  6666    0   6
        13  6667    0   7
        14  6668    0   8
        15  6669    0   9

        16  7666    7   0
        17  8666    8   0    
        18  9666    9   0
        19 = 6 + 10 + 3

        19  10666   10  0
        20  11666   11  0
        21  12666   12  0
        22  13666   13  0
        23  14666   14  0
        24  15666   15  0

        25  16660   1   0

        36  19666
        (6 + 9 + 3)
        

        ...
        1)n+666
            1~1000 -> 1666 ~ 1000666
        2)666+n
            1~1000 -> 6661 ~ 6661000
        3)n+666+n
            0~100, 0~100 -> 666 ~ 100666100 

        
        */
    }
}
