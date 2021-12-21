package part3.week29.phk;

import java.util.Scanner;

public class Math_3009 {
    public static void main(String[] args) {
    	int[] x = new int[3];
        int[] y = new int[3];
    	Scanner sc = new Scanner(System.in);

    	for (int i = 0; i < x.length; i++) {

    		x[i] = sc.nextInt();
    		y[i] = sc.nextInt();
		}
        sc.close();
        
        int a = result(x[0], x[1], x[2]);
        int b = result(y[0], y[1], y[2]);
        
        System.out.println(a + " " + b);
        
        
    }
    
    public static int result(int a, int b, int c) {
    	
    	if(a == b) {
    		return c;
    	}else if(a == c){
    		return b;
    	}else {
    		return a;
    	}
    	
    }
}
