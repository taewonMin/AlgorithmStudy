package part4.week34.chw;

import java.util.Scanner;

public class Greedy_1541 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String[] inputArr = sc.next().split("-");
    	int result = 0;
    	for(int i = 0; i < inputArr.length; i++) {
    		String[] arr = inputArr[i].split("\\+");
    		int sum = 0;
    		for(String str : arr) {
    			sum += Integer.parseInt(str);
    		}
    		if(i == 0) {
    			result = sum;
    		}else {
    			result -= sum;
    		}
    	}
    	System.out.println(result);
    	sc.close();
    }
}
