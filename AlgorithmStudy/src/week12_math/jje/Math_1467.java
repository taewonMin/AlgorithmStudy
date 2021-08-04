package week12_math.jje;

import java.util.Scanner;

public class Math_1467 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        int i = 1;
        
        while(true){ 
        	
              if((i-e)%15==0 && (i-s)%28==0 && (i-m)%19==0){
                    System.out.println(i); 
                    break;
                 } 
              i++;
        }
        
        sc.close();
	}
}
