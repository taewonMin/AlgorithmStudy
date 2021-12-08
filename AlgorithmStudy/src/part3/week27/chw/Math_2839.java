package part3.week27.chw;

import java.util.Scanner;

public class Math_2839 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int sugar = sc.nextInt();
    	int fiveBag = sugar / 5;
    	int result = -1;
    	for(int i = fiveBag; i > -1; i--) {
    		if((sugar - i * 5) % 3 == 0) {
    			result = (sugar - i * 5) / 3 + i;
    			break;
    		}
    	}
    	System.out.println(result);
    	sc.close();
    }
}
