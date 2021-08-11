package part2.week13.phk;

import java.util.Scanner;

public class Math_14916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
        
        int coin = -1;
        switch(n%5){
            case 1: case 3:
                if(n<5) break;
                coin = (n-5)/5 + (n%5+5)/2;
                break;
            case 2: case 4:
                coin = n/5 + (n%5)/2;
                break;
            default:
                coin = n/5;
                
        }
        
        System.out.println(coin);
        
        
	}
}
