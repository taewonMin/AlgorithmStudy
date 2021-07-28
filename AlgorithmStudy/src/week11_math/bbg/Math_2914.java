package week11_math.bbg;

import java.util.Scanner;

//저작권 	17700KB	232ms
public class Math_2914 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println((int) Math.ceil((double) sc.nextInt() * (sc.nextInt() - 0.99)));		

		sc.close();
	}
}
/*
 import java.util.Scanner;

//저작권 17796KB	248ms
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int I = sc.nextInt();
		
		double t = I - 0.99 ;
		
		System.out.println((int) Math.ceil((double) A * t ));
		
		sc.close();
	}
}
 */
/* 1112KB 0ms
#include <stdio.h>
#include <math.h>

int main(){
    int A, I;
    double t;
    
    scanf("%d\n", &A);
    scanf("%d\n", &I);
    
    t = I - 0.99 ;
    
    printf("%d\n", (int)ceil(A * t));
    
    return 0;
}
 */
