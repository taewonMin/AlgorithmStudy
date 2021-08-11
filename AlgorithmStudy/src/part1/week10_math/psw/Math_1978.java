package part1.week10_math.psw;

import java.util.Scanner;

public class Math_1978 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int answer = n;
    	for (int i = 0; i < n; i++) {
    		int num = sc.nextInt();
    		if(num == 1) answer--;
    		int x = (int)Math.sqrt(num)+1;
    		
			for (int j = 2; j < x; j++) { if(num%j == 0) { answer--; break; } }
		}
    	sc.close();
    	System.out.println(answer);
    }
}
