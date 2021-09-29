package part2.week19.bbg;

import java.util.Scanner;
/*윷놀이 12832KB 120ms */
public class Imple_2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int row = 0 ; row < 3 ; row++) {
        	int cnt = 0;
        	char result = 'D';

        	for(int item = 0 ; item < 4 ; item++) {
	        	if(sc.nextInt() != 0) cnt++;
	        }

        	if(cnt == 4) {
	        	result = 'E';
	        }else {
	        	result -= cnt;
	        }
	        System.out.println(result);
        }
        sc.close();
    }
}
