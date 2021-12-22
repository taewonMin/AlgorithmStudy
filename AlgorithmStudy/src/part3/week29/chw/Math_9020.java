package part3.week29.chw;

import java.util.Scanner;

public class Math_9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i = 0; i < testCase; i++) {
        	int input = sc.nextInt();
        	if(input == 4) {
        		System.out.println("2 2");
        		continue;
        	}
        	int start = input / 2 % 2 == 0 ? input/2-1 : input/2;
        	while(start > 1) {
        		if(checkSosu(start, input - start)) {
            		System.out.println(start + " " + (input - start));
            		break;
            	}
        		start-=2;
        	}
        }
        sc.close();
    }
    static boolean checkSosu(int firNum, int secNum) {
    	for(int i = 3; i*i <= secNum; i+=2) {
    		if(firNum % i == 0 || secNum % i == 0) return false;
    	}
    	return true;
    }
}
