package part2.week20.bbg;

import java.util.Scanner;

public class Recursion_2447 {
	static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        draw(N);
    }
    
    static void draw(int n) {
    	
    	for(int y=0 ; y < n ; y++) {
    		for(int x=0 ; x < n ; x++) {
    			int val = x != 0 ? (int) (Math.pow(3, x) <= n ? Math.pow(3, x) : n) : n;
	    		if((val/3 <= x && x < val-(val/3))&&(val/3 <= y && y < val-(val/3))) { // x는 n/3 보다 크거나 같고 n-(n/3)보다 작거나 같을 때  
	    			//Math.pow(3,x) <= n 이면서  위 조건에 만족하는..?? 배수도 포함해야함?? 재귀는 언제 ???? 
    				sb.append(" ");
    			}else {
    				sb.append("*");
    			}
    		}
    		sb.append("\n");
    	}
    	System.out.println(sb);
    }
}
