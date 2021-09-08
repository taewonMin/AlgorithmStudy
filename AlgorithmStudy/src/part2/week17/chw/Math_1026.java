package part2.week17.chw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Math_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = sc.nextInt();
        int result = 0;
        Integer[] firArr = new Integer[cnt];
        int[] secArr = new int[cnt];
        for(int i = 0; i < cnt; i++) {
        	firArr[i] = sc.nextInt();
        }
        for(int i = 0; i < cnt; i++) {
        	secArr[i] = sc.nextInt();
        }
        Arrays.sort(firArr, Collections.reverseOrder());
        Arrays.sort(secArr);
        
        for(int i =0; i < cnt; i++) {
        	result += firArr[i] * secArr[i];
        }
        System.out.println(result);
        sc.close();
    }
}
