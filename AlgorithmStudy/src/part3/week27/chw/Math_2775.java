package part3.week27.chw;

import java.util.Scanner;

public class Math_2775 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int testCase = sc.nextInt();
    	int[][] house = new int[15][15];
    	for(int i = 0; i < house.length; i++) {
    		for(int j = 1; j < house[i].length; j++) {
    			if(i == 0) {
    				house[i][j] = j;
    			}else {
    				for(int k = 1; k <= j; k++) {
    					house[i][j] += house[i-1][k];
    				}
    			}
    		}
    	}
    	
    	for(int i = 0; i < testCase; i++) {
    		int floor = sc.nextInt();
    		int roomNum = sc.nextInt();
    		System.out.println(house[floor][roomNum]);
    	}
		sc.close();
    }
}