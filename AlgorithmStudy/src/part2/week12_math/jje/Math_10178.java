package part2.week12_math.jje;

import java.util.Scanner;

public class Math_10178 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
      	  int c = sc.nextInt();
      	  int v = sc.nextInt();
      	  System.out.println("You get "+c/v+" piece(s) and your dad gets "+c%v+" piece(s).");
        }
    }
}
