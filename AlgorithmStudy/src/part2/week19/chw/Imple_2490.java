package part2.week19.chw;

import java.util.Scanner;

public class Imple_2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
	        char[] s = sc.nextLine().toCharArray();
	        int sum = 0;
	        char result = 'D';
	        for(char e : s) {
	        	if('1' == e) sum++;
	        }
	        System.out.println(sum == 4 ? 'E' : (char)(result-sum));
	        
	        /*
	        0 윷 D
	        1 걸 C
	        2 개 B
	        3 도 A
	        4 모 E
	        */
        }
        sc.close();
    }
}
