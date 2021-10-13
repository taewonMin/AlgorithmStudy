package part3.week21.chw;

import java.util.Scanner;

public class Brute_2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int startNum = 0;
        int result = 0;
        
        while(startNum != input) {
        	startNum++;
        	int sum = startNum;
        	String[] bunhae = (startNum+"").split("");
        	for(String a : bunhae) {
        		sum += Integer.parseInt(a);
        	}
        	if(input == sum) {
        		result = startNum;
        		break;
        	}
        	
        }
        System.out.println(result);
        
        sc.close();
    }
}
