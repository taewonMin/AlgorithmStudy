package part2.week17.bbg;

import java.util.Scanner;
/** 12968KB 120ms*/
public class Math_1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] stdA = new int[N];
        int[] stdB = new int[N];
        
        for(int idx = 0 ; idx < N ; idx++) {
        	A[idx] = sc.nextInt();
        }
        for(int idx = 0 ; idx < N ; idx++) {
        	B[idx] = sc.nextInt();
        }
        sc.close();
        
        for(int i = 1 ; i < N ; i++) {
        	for(int j = 0 ; j < N - i ; j++) {
        		if(A[j] > A[j+1]) { // 작은수가 앞으로
        			int temp = A[j];
        			A[j] = A[j+1];
        			A[j+1] = temp;
        		}
        		
        		if(B[j] < B[j+1]) { // 큰수가 앞으로
        			int temp = B[j];
        			B[j] = B[j+1];
        			B[j+1] = temp;
        		}
        		
        	}
        	
        }
        int result = 0;
        for(int cnt = 0 ; cnt < A.length ; cnt++) {
        	result += A[cnt] * B[cnt];
        }
        System.out.println(result);
        
    }
}
