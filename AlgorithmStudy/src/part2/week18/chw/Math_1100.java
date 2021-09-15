package part2.week18.chw;

import java.util.Scanner;

public class Math_1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for(int i = 0; i < 8; i++) {
    		char[] input = sc.next().toCharArray();
    		for(int j = 0; j < input.length; j++) {
    			if(i % 2 == 0 && j % 2 == 0 && input[j] - 'F' == 0) {
    				cnt++;
    			}else if(i % 2 == 1 && j % 2 == 1 && input[j] - 'F' == 0) {
    				cnt++;
    			}
    		}
        }
        System.out.println(cnt);
        sc.close();
    }
}
