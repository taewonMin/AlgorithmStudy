package part4.week34.chw;

import java.math.BigInteger;
import java.util.Scanner;

public class Greedy_13305 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int[] distance = new int[N];
    	int[] city = new int[N];
    	int temp = 0;
    	BigInteger result = BigInteger.ZERO;
    	
    	for(int i = 0; i < N-1; i++) {
    		distance[i] = sc.nextInt();
    	}
    	for(int i = 0; i < N; i++) {
    		city[i]= sc.nextInt();
    		temp = i == 0 ? city[i] : Math.min(temp, city[i]);
    		result = result.add(new BigInteger(temp+"").multiply(new BigInteger(distance[i]+"")));
    	}
    	System.out.println(result);
    	sc.close();
    }
}
