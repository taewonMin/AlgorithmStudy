package part2.week19.chw;

import java.util.Scanner;

public class Dynamic_17212 {
	static int[] coinArr = {7, 5, 2, 1};
	static int result = 0;
	static int idx = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculator(sc.nextInt());
        System.out.println(result);
        sc.close();
    }
    static void calculator(int input) {
    	if(input != 0){
    		if(input > 10 && input % 7 == 3) {
    			result += input / coinArr[idx] - 1;
    			input = 10;
    		}else if(input == 10){
    			result+=2;
    			return;
    		}else {
    			result += input / coinArr[idx];
    			input = input % coinArr[idx];
    		}
			idx++;
			calculator(input);
    	}
    }
}
